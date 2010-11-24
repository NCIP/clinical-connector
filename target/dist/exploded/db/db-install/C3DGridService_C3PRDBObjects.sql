-- Spool a log file
spool install_c3probjects.lst

Select to_char(sysdate,'MM/DD/YYYY HH24:MI:SS') "Execution Date", User "User"
  from dual;

--
-- DCAPI_USER_CREDENTIALS  (Table) 
--
-- NOTES:  Hold User Credentials for DCAPI user id.

CREATE TABLE DCAPI_USER_CREDENTIALS
(
  UNAME          VARCHAR2(50 BYTE),
  PWORD          VARCHAR2(400 BYTE),
  STATUS         VARCHAR2(100 BYTE),
  C3D_TNS_ENTRY  VARCHAR2(100 BYTE)
);

-- Table Data:
-- DCAPI User credentials.  The value in PWORD is encryted.  
-- The value in C3D_TNS_ENTRY is the Sql*Net TNS Names entry for the 
-- Oracle database.

INSERT INTO DCAPI_USER_CREDENTIALS ( UNAME, PWORD, STATUS, C3D_TNS_ENTRY ) 
VALUES ( 'C3DDCAPIUSER', 'nB5wkF1GNcs=', 'ACTIVE', 'OCDEV45.NCI.NIH.GOV'); 

COMMIT;


--
-- STUDY_CDES  (Table) 
--
-- NOTES:  This table hold the value of the CDE for the particular question, 
--         for a paticular study.  
CREATE TABLE STUDY_CDES_CTL
(
  STUDY           VARCHAR2(100)            NOT NULL,
  REFERENCE_CODE  VARCHAR2(100)            NOT NULL,
  CDE             VARCHAR2(400)            NOT NULL
);

-- Table Data:
-- NOTES:  The values below represent the default CDE values for common
--         NCI Study Questions.  Study specific entries can eb entered.
--
INSERT INTO STUDY_CDES_CTL ( STUDY, REFERENCE_CODE, CDE ) 
VALUES ( 'ALL', 'PATIENT_ID_CDE', 'CDE_ID:2003301VERSION:3.0'); 

INSERT INTO STUDY_CDES_CTL ( STUDY, REFERENCE_CODE, CDE ) 
VALUES ( 'ALL', 'NCI_INST_CD_CDE', 'CDE_ID:2003707VERSION:3'); 

INSERT INTO STUDY_CDES_CTL ( STUDY, REFERENCE_CODE, CDE ) 
VALUES ( 'ALL', 'OFF_STUDY_REASON_CDE', 'CDE_ID:2003606VERSION:3'); 

INSERT INTO STUDY_CDES_CTL ( STUDY, REFERENCE_CODE, CDE ) 
VALUES ( 'ALL', 'OFF_STUDY_DATE_CDE', 'CDE_ID:2003605VERSION:3'); 

INSERT INTO STUDY_CDES_CTL ( STUDY, REFERENCE_CODE, CDE ) 
VALUES ( 'ALL', 'OFF_TREATMENT_REASON_CDE', '2179998'); 

INSERT INTO STUDY_CDES_CTL ( STUDY, REFERENCE_CODE, CDE ) 
VALUES ( 'ALL', 'OFF_TREATMENT_DATE_CDE', 'CDE_ID:2177930VERSION:1.0'); 

COMMIT;


--
-- STUDY_CDES  (Table) 
--
-- NOTES:  This view holds the values of the CDE for a particular question, 
--         for every study, by using the default "ALL" study values for derivation.
create or replace view study_cdes as
SELECT a.study,
       a.reference_code,
	   a.cde,
	   a.study reference_study
  FROM study_cdes_ctl a
UNION
SELECT c.study,
       a.reference_code,
	   a.cde,
	   a.study reference_study
  FROM clinical_studies c, 
       study_cdes_ctl a
 WHERE a.study = 'ALL'
   AND NOT EXISTS (SELECT 'X'
                    FROM study_cdes_ctl b
                    WHERE b.study = c.study
		      and b.reference_code = a.reference_code 
                      AND b.study <> 'ALL');

spool off


