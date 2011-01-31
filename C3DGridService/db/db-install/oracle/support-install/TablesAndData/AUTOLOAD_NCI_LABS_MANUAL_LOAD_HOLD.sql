CREATE TABLE NCI_LABS_MANUAL_LOAD_HOLD
(
  STUDY                VARCHAR2(200),
  PATIENT_ID           VARCHAR2(20),
  OC_PATIENT_POS       VARCHAR2(20),
  LAB_SAMPLE_DATE_RAW  VARCHAR2(20),
  LAB_SAMPLE_TIME_RAW  VARCHAR2(20),
  LAB_TEST_NAME        VARCHAR2(200),
  LAB_TEST_RESULT      VARCHAR2(300),
  LAB_TEST_UOM         VARCHAR2(20),
  LAB_TEST_RANGE       VARCHAR2(80),
  LABORATORY           VARCHAR2(10),
  RECEIVED_DATE        DATE,
  RECORD_ID            NUMBER(10),
  LAB_TEST_EVENT       VARCHAR2(40),
  BATCH_ID             INTEGER,
  LAB_TEST_RANGE_LOW   VARCHAR2(30),
  LAB_TEST_RANGE_HIGH  VARCHAR2(30),
  QUALIFYING_VALUE     VARCHAR2(80),
  STATUS_CODE          VARCHAR2(1)         DEFAULT 'N',
  STATUS_COMMENT       VARCHAR2(200)       DEFAULT 'New Record',
  LAB_SAMPLE_DATETIME  DATE
)
/

CREATE OR REPLACE TRIGGER BI_ER_MLT
before insert
on NCI_LABS_MANUAL_LOAD_HOLD
REFERENCING OLD AS OLD NEW AS NEW
FOR EACH ROW
Begin
   Declare
   -- Ekagra Software Technologies                                                 --
   -- Table Trigger to set audit trail columns and launch the Lab Load Autoloader  --
   --                                                                              --

      Hold_Number Number;       -- Holds Job Id Number during checking
      Hold_Found  Varchar2(1);  -- Holds Found/Not-Found results

   Begin
      -- Set date record created
      :new.received_date := sysdate;
      -- Set Record ID for the record received, used for tracking into NCI_LABS
      select nci_manual_load_seq.nextval
        into :new.record_id
        from dual;

      If sql%notfound Then
         -- If sequence cannot be created, raise an error to the calling application
         Raise_application_error(-20041,
              'Warning: Record Id cannot be issued, NCI_MANUAL_LOAD_SEQ not working');
      End If;

      -- Get Batch ID for group of committed records, each group should have
      -- a unique ID as these records are processed as a group through the AutoLoader
      Begin

         -- Get the current value from the Batch ID Sequence.  If this is the
         -- first time trying, an error should occur because the sequnce was
         -- not initiated.  That way we always get a NEW id for each batch.

         select nci_manual_load_batch_seq.currval
           into hold_number
           from dual;

      Exception
         when others then

            -- if ANY error occurs from last statement, get a NEW id number.
            -- This is the behavior we are expecting.  The next record through this
            -- routine will get the same Batch ID, because we check current value first

            select nci_manual_load_batch_seq.nextval
              into hold_number
              from dual;

            -- If we do not get a sequence, there is a problem. Raise an error to the
            -- calling program.

            If sql%notfound Then
               Raise_application_error(-20041,
                 'Warning: Batch Id cannot be issued, NCI_MANUAL_LOAD_BATCH_SEQ not working');
            End If;
      End;


      Begin

         -- Check the Batch ID we just polled.  If it has already been used for a started
         -- Job, then we need a different number.  This can happen when the DB connection is
         -- not closed and reused, or when the user commits two seperate batches of records
         -- from the command line.

         Select 'X' into Hold_Found
           from nci_labs_manual_load_batches
          where batch_id = hold_number
            and job_id is not null;

         Begin

            -- get a new sequence number because the above statement found it in the submitted
            -- batches table

            select nci_manual_load_batch_seq.nextval
              into hold_number
              from dual;


            -- If we do not get a sequence, there is a problem. Raise an error to the
            -- calling program.

         Exception
            When Others Then
               Raise_application_error(-20041,
                 'Warning: Batch Id cannot be issued, NCI_MANUAL_LOAD_BATCH_SEQ not working');
         End;

      Exception
         When Others Then

            -- If an error occurs when checking the existence of the Batch ID in the
            -- summitted batches table, then the sequence is okay and nothing needs done

            Null;
      End;


      -- Assign the Batch ID to the tables Batch ID column.
      :new.batch_id := hold_number;

      Begin

         -- Write the Batch ID, the user committing the data and the Date into the
         -- submitted batches table of the Autoloader.
         -- The AutoLoader WATCHER application will see it and execute.

         Insert into NCI_LABS_MANUAL_LOAD_BATCHES
            (BATCH_ID, SUBMIT_BY, SUBMIT_DATE)
         select Hold_Number, USER, SYSDATE
           from DUAL
          where not exists (select 'X'
                              from NCI_LABS_MANUAL_LOAD_BATCHES
                             where BATCH_ID = Hold_Number);


         -- Request that the Lab Loader AutoLoader start.  This ensures
         -- that the batches of records committed will be processed by the
         -- AutoLoader by ensure that the Watcher is running.
         -- Nci_labs_manual_loader.AutoLoad_Watcher_Control ('START');

      End;

   End;

End;
/
