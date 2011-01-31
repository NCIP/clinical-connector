create or replace package C3D_UTIL_MAILER
-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
--     Author: Patrick Conrad                                                      
--       Date: Nov 15, 2007                                                        
--Description: Mailing Utility for C3D Utilities                                   
--                                                                                 
-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
--  Modification History                                                           
-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
-- PRC 03/09/2010                                                                  
--                                                                                 
--    1)Added code that would look up the FROM e-mail account from the C3D_MAIL_CTL
--      table instead of using a generic, non e-mail account.                      
--    2)Added code to allow for the inclusion of a POSTSCRIPT section of message to
--      be added when building a message.  The new POSTSCRIPT section gives notice 
--      that the e-mail should not be replied to.  Inside the POSTSCRIPT text, the 
--      variable #CONTACT# is used as a placeholder so that the value of the       
--      CONTACT for the utility, held in C3D_MAIL_CTL, can be substituted in.      
-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 

AS

-- Global Variables

   crlf     varchar2(2)  := Chr(13) || Chr(10);

Function Build_Msg_For(v_Util_Code  varchar2,
                       v_Alert_type varchar2,
                       v_msg_text   varchar2) Return Varchar2;

PROCEDURE SEND_MAIL (msg_to      varchar2,
                     msg_subject varchar2,
                     msg_text    varchar2);

PROCEDURE Send_Mail_For(v_Util_Code     varchar2,
                        v_Alert_type    varchar2,
                        v_msg_subj      Varchar2,
                        v_msg_text      varchar2);

End C3D_UTIL_MAILER;
/



create or replace PACKAGE BODY C3D_UTIL_MAILER
AS

PROCEDURE SEND_MAIL (msg_to      varchar2,
                     msg_subject varchar2,
                     msg_text    varchar2)
IS
   NO_MAIL_HOST  EXCEPTION;
   NO_MAIL_FROM  EXCEPTION;

   c             utl_smtp.connection;
   rc            integer;
   msg_from      varchar2(50);
   mailhost      VARCHAR2(30);
   msg_subj      varchar2(1000) := nvl(msg_subject,'C3D Utility Mailer has sent you a message');

BEGIN
   Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');

   Begin
      -- Query checks for mail host
      select substr(TO_ADDRESS,1,30)
        into mailhost
        from C3D_MAIL_CTL
       where UTIL_CODE = 'C3D_MAILER'
         and ALERT_TYPE = 'MAILSERVER';

   Exception
      When  No_Data_Found Then
         -- The above query found no mail host
         -- This code is used to catch C3D Utility Mailer configuration issues.
            Raise NO_MAIL_HOST;
   End;

   Begin
      select substr(TO_ADDRESS,1,50)
        into msg_from
        from C3D_MAIL_CTL
       where UTIL_CODE = 'C3D_MAILER'
         and ALERT_TYPE = 'MAILFROM';
   Exception
      When  No_Data_Found Then
         -- The above query found no mail host
         -- This code is used to catch C3D Utility Mailer configuration issues.
            Raise NO_MAIL_FROM;
   End;


   c := utl_smtp.open_connection(mailhost, 25); -- SMTP on port 25
   utl_smtp.helo(c, mailhost);
   utl_smtp.mail(c, msg_from);
   utl_smtp.rcpt(c, msg_to);
   utl_smtp.open_data(c);
   utl_smtp.write_data(c, substr('From: ' || msg_from || crlf, 1, 1000));
   utl_smtp.write_data(c, substr('To: '   || msg_to || crlf, 1, 1000));
   utl_smtp.write_data(c, substr('Subject: ' || msg_subj || crlf, 1, 1000));
   utl_smtp.write_data(c, crlf || substr(msg_text, 1, 1000));
   utl_smtp.close_data(c);
   utl_smtp.quit(c);


EXCEPTION
   WHEN UTL_SMTP.INVALID_OPERATION THEN
      If Log_Util.Log$LogName is null Then --prc 11/10/05
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: SEND_MAIL - INVALID_OPERATION');
      Log_Util.LogMessage('C3DMAILER - Invalid Operation in Mail attempt using UTL_SMTP.');
      LOG_Util.LogMessage('C3DMAILER - SEND_MAIL Paramters');
      LOG_Util.LogMessage('C3DMAILER -   From:    "'||msg_from||'"');
      LOG_Util.LogMessage('C3DMAILER -   To:      "'||msg_to  ||'"');
      LOG_Util.LogMessage('C3DMAILER -   Subject: "'||msg_subj||'"');
      dbms_output.put_line('Invalid Operation in mail attempt using UTL_SMTP.');

   WHEN UTL_SMTP.TRANSIENT_ERROR THEN
      If Log_Util.Log$LogName is null Then --prc 11/10/05
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: SEND_MAIL - TRANSIENT_ERROR ');
      Log_Util.LogMessage('C3DMAILER - Temporary e-mail issue - try again');
      LOG_Util.LogMessage('C3DMAILER - SEND_MAIL Paramters');
      LOG_Util.LogMessage('C3DMAILER -   From:    "'||msg_from||'"');
      LOG_Util.LogMessage('C3DMAILER -   To:      "'||msg_to  ||'"');
      LOG_Util.LogMessage('C3DMAILER -   Subject: "'||msg_subj||'"');
      dbms_output.put_line('Temporary issue with e-mail - try again');
   WHEN UTL_SMTP.PERMANENT_ERROR THEN
      If Log_Util.Log$LogName is null Then --prc 11/10/05
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: SEND_MAIL - PERMANENT_ERROR ');
      Log_Util.LogMessage('C3DMAILER - Permanent Error Encountered.');
      LOG_Util.LogMessage('C3DMAILER - SEND_MAIL Paramters');
      LOG_Util.LogMessage('C3DMAILER -   From:    "'||msg_from||'"');
      LOG_Util.LogMessage('C3DMAILER -   To:      "'||msg_to  ||'"');
      LOG_Util.LogMessage('C3DMAILER -   Subject: "'||msg_subj||'"');
      dbms_output.put_line('Permanent Error Encountered.');
   WHEN NO_MAIL_HOST THEN
      If Log_Util.Log$LogName is null Then --prc 03/09/10
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: NO MAIL HOST DEFINITION ');
      Log_Util.LogMessage('C3DMAILER - Control Table C3D_MAIL_CTL does not contain a MAILSERVER definition.');
      LOG_Util.LogMessage('C3DMAILER - Mail cannot be sent without a MAILSERVER.');
      LOG_Util.LogMessage('C3DMAILER -   From:    "'||msg_from||'"');
      LOG_Util.LogMessage('C3DMAILER -   To:      "'||msg_to  ||'"');
      LOG_Util.LogMessage('C3DMAILER -   Subject: "'||msg_subj||'"');
      dbms_output.put_line('ERROR: NO MAIL HOST DEFINITION');
   WHEN NO_MAIL_FROM THEN
      If Log_Util.Log$LogName is null Then --prc 03/09/10
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: NO MAIL FROM DEFINITION ');
      Log_Util.LogMessage('C3DMAILER - Control Table C3D_MAIL_CTL does not contain a MAILFROM definition.');
      LOG_Util.LogMessage('C3DMAILER - Mail cannot be sent without a MAILFROM.');
      LOG_Util.LogMessage('C3DMAILER -   From:    "'||msg_from||'"');
      LOG_Util.LogMessage('C3DMAILER -   To:      "'||msg_to  ||'"');
      LOG_Util.LogMessage('C3DMAILER -   Subject: "'||msg_subj||'"');
      dbms_output.put_line('ERROR: NO MAIL FROM DEFINITION');
   When Others Then
      If Log_Util.Log$LogName is null Then --prc 11/10/05
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: SEND_MAIL - Unexpected Error');
      Log_Util.LogMessage('C3DMAILER - ERROR: Code:    ' || SQLCODE);
      Log_Util.LogMessage('C3DMAILER - ERROR: Message: ' || SQLERRM);
      LOG_Util.LogMessage('C3DMAILER - SEND_MAIL Paramters');
      LOG_Util.LogMessage('C3DMAILER -   From:    "'||msg_from||'"');
      LOG_Util.LogMessage('C3DMAILER -   To:      "'||msg_to  ||'"');
      LOG_Util.LogMessage('C3DMAILER -   Subject: "'||msg_subj||'"');
      Null;
END;

Procedure Archive_Mail_Record (v_Util_code    varchar2,
                               v_Alert_Type   varchar2,
                               v_to_address   varchar2,
                               v_message_subj varchar2,
                               v_message_text varchar2)
IS
-- This procedure is used to keep a copy of each e-mail sent.
-- The AUTONOMOUS_TRANSACTION option is used to that the insert and
-- commit do not effect the transactional state of other statements.
PRAGMA AUTONOMOUS_TRANSACTION;

Begin
   INSERT INTO C3D_MAIL_ARCHIVE (
         UTIL_CODE, ALERT_TYPE, TO_ADDRESS,
         MESSAGE_SUBJ, MESSAGE_TEXT, SEND_DATE)
   VALUES (
         v_Util_Code, v_Alert_Type, v_To_Address,
         v_message_Subj, v_message_text, Sysdate);

   Commit;
End;


PROCEDURE Send_Mail_For(v_Util_Code     varchar2,
                        v_Alert_type    varchar2,
                        v_msg_subj      Varchar2,
                        v_msg_text      varchar2)
IS

  NO_MAIL_DEF  EXCEPTION;

  v_Found         varchar2(1);

  v_Full_Msg      Varchar2(32767);
  v_Full_Msg_Subj Varchar2(4000) := nvl(v_msg_subj,v_Util_Code || ' - ' || v_Alert_Type);

BEGIN

   Begin
      -- Query checks that at least one record exists for the utility for the specific alert type.
      Select distinct 'X' into v_found
        from C3D_MAIL_CTL
       where Util_Code = v_Util_Code
         and Alert_Type = v_Alert_Type;

   Exception
      When  No_Data_Found Then
         -- The above query found no alert type for the utility.  If the utility is not the MAILER itself
         -- then an e-mail must be sent to the C3D Mailer administrator about the missing alert type,
         -- otherwise, if it IS the MAILER, raise a normal error and do not send an e-mail
         -- This code is used to catch C3D Utility Mailer configuration issues.
         If v_Util_Code <> 'C3D_MAILER' Then
            Raise NO_MAIL_DEF;
         Else
            Raise;
         End If;
   End;

   v_Full_Msg := Build_Msg_For(v_Util_Code, v_Alert_type, v_msg_text);

   For X in (Select To_Address
               from C3D_MAIL_CTL
              where Util_Code = v_Util_Code
                and Alert_Type = v_Alert_Type) Loop

      -- send the e-mail message
      Send_Mail(X.To_Address, v_full_Msg_Subj, v_Full_Msg);

      -- record that an e-mail message was sent.
      Archive_Mail_Record(v_Util_Code, v_Alert_Type, X.To_Address,
                          v_Full_Msg_Subj, v_full_Msg);

   End Loop;

EXCEPTION
    When NO_MAIL_DEF Then
      dbms_output.put_line('ERROR: NO_MAIL_DEF - No Mail Controls for "'||v_Util_Code||'" - "'||v_Alert_Type||'".');

      If Log_Util.Log$LogName is null Then
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: NO_MAIL_DEF - No Mail Controls for "'||v_Util_Code||'" - "'||v_Alert_Type||'".');
      --Raise;
      C3D_UTIL_MAILER.Send_Mail_For('C3D_MAILER','WARNING','CDE Mailer NO_MAIL_DEF Error',
                                    'C3DMAILER - ERROR: NO_MAIL_DEF - No Mail Controls for "'||v_Util_Code||'" - "'||v_Alert_Type||'".');
   When NO_DATA_FOUND Then
      If Log_Util.Log$LogName is null Then
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: Send_Mail_For failed for '||v_Util_Code ||' - '||v_Alert_Type||'.');
      Log_Util.LogMessage('C3DMAILER - ERROR: Error Encountered: ' || SQLCODE);
      Log_Util.LogMessage('C3DMAILER - ERROR: Error Message: ' || SQLERRM);
      --Raise;

   When Others Then
      If Log_Util.Log$LogName is null Then
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: Send_Mail_For failed for '||v_Util_Code ||' - '||v_Alert_Type||'.');
      Log_Util.LogMessage('C3DMAILER - ERROR: Error Encountered: ' || SQLCODE);
      Log_Util.LogMessage('C3DMAILER - ERROR: Error Message: ' || SQLERRM);
      --Raise;
      v_full_msg := 'C3DMAILER - ERROR: Send_Mail_For failed for '||v_Util_Code ||' - '||v_Alert_Type||'.' || crlf ||
                    'C3DMAILER - ERROR: Error Encountered: ' || SQLCODE || crlf ||
      	            'C3DMAILER - ERROR: Error Message: ' || SQLERRM;

      If v_Util_Code <> 'C3D_MAILER' Then
         C3D_UTIL_MAILER.Send_Mail_For('C3D_MAILER','FAILURE','CDE Mailer Send_Mail_For',v_full_msg);
      End If;


END;

Function Build_Msg_For(v_Util_Code  varchar2,
                       v_Alert_type varchar2,
                       v_msg_text   varchar2) Return Varchar2
is
   -- This function is used to build an e-mail message.  It consists of 5 parts.  4 of the parts are considered
   -- boiler text, while for fourth is generated and passed by the utility sending the e-mail.  The four parts
   -- OPENING, BODY, CLOSING and POSTSCRIPT are stored in the table C3D_MAIL_MESSAGE_CTL.  Each part can exist for each of
   -- the  three alert types for each utility.  The three alert types are SUCCESS, FAILURE, WARNING.
   -- The fifth part of the message is passed to this routine and the four other parts are concatenated to it
   -- in the followin manner:  OPENING + BODY + utility text + CLOSING + POSTSCRIPT.  A blank line seperates each section.
   -- POSTSCRIPT has additional functionality in that it can contain the variable #CONTACT# which is used as a
   -- place holder for the contact for a Utility.  The contact for a utility is held in the C3D_MAIL_CTL table for
   -- each Utility with an Alert_Type of CONTACT.
   v_part_msg  varchar2(4000);
   v_full_msg  varchar2(32767) := NULL;
   v_contact   varchar2(50)    := NULL;
   v_section   varchar2(30)    := 'Initializing';

Begin

   Begin
      v_section := 'Get Opening';

      -- Get the 'OPENING' text for the message type
      Select Message_text
        into v_part_msg
       from C3D_MAIL_MESSAGE_CTL
       where Util_Code = v_Util_Code
         and Alert_Type = v_Alert_Type
         and Message_type = 'OPENING';

   Exception
      When NO_DATA_FOUND Then
         v_part_msg := NULL;
   End;

   v_full_msg := v_part_msg;

   Begin
      v_section := 'Get Body';
      -- Get the 'BODY' text for the message type
      Select Message_text
        into v_part_msg
        from C3D_MAIL_MESSAGE_CTL
       where Util_Code = v_Util_Code
         and Alert_Type = v_Alert_Type
         and Message_type = 'BODY';

   Exception
      When NO_DATA_FOUND Then
         v_part_msg := NULL;
   End;

   v_section := 'Build Open/Body/Text';
   If v_part_msg is null then
      -- Message is now set to 'OPENING' and user text
      v_full_msg := v_full_msg || crlf || crlf || v_msg_text;
   Else
      -- Message is now set to 'OPENING', 'BODY' and user text
      v_full_msg := v_full_msg || crlf || crlf || v_part_msg || crlf || crlf || v_msg_text;
   End If;

   Begin
      v_section := 'Get Closing';

      -- Get the 'CLOSING' text for the message type
      Select Message_text
        into v_part_msg
        from C3D_MAIL_MESSAGE_CTL
       where Util_Code = v_Util_Code
         and Alert_Type = v_Alert_Type
         and Message_type = 'CLOSING';

   Exception
      When NO_DATA_FOUND Then
         v_part_msg := NULL;
   End;

   v_section := 'Build Text/Closing';
   -- Add 'CLOSING' to the message
   v_full_msg := v_full_msg || crlf || crlf || v_part_msg;

   v_full_msg := rtrim(ltrim(v_full_msg, crlf), crlf);

   Begin
      v_section := 'Get Post Script';

      -- Get the 'POSTSCRIPT' text for the message type, if it exists
      Select Message_text
        into v_part_msg
        from C3D_MAIL_MESSAGE_CTL
       where Util_Code = v_Util_Code
         and Alert_Type = v_Alert_Type
         and Message_type = 'POSTSCRIPT';

   Exception
      When NO_DATA_FOUND Then
         -- Get the 'POSTSCRIPT' text for the message type for ALL utilities, if it exists
         -- NOTE:  The POSTSCRIPT text type is a special type that can exist at different degrees for a
         --        Utility.  An "ALL" designation at UTIL_CODE level designates that the text can be used
         --        for ALL utilities for that specific alert type.  An ALL designation for both UTIL_CODE
         --        and ALERT_TYPE designates that the text is used for ALL E-mails sent.
      Begin
         Select Message_text
           into v_part_msg
        from C3D_MAIL_MESSAGE_CTL
       where Util_Code = 'ALL' --v_Util_Code
         and Alert_Type = v_Alert_Type
         and Message_type = 'POSTSCRIPT';
      Exception
         When NO_DATA_FOUND Then
         -- Get the 'POSTSCRIPT' text for ALL message types for ALL utilities, if it exists
         Begin
            Select Message_text
              into v_part_msg
              from C3D_MAIL_MESSAGE_CTL
             where Util_Code = 'ALL' --v_Util_Code
               and Alert_Type = 'ALL'
               and Message_type = 'POSTSCRIPT';
         Exception
	   When NO_DATA_FOUND Then
	      v_part_msg := NULL;
	 End;

      End;
   End;

   If v_part_msg is not null Then
      If instr(upper(v_part_msg),'#CONTACT#') <> 0 Then
      -- If the placeholder variable #CONTACT# is in the template text, it will need replaced.
      Begin
         v_section := 'Get Contact';

         -- Get the 'CONTACT' for the Utility, if it exists
         select substr(TO_ADDRESS,1,50)
           into v_contact
           from C3D_MAIL_CTL
          where UTIL_CODE = v_Util_Code
            and ALERT_TYPE = 'CONTACT';

      Exception
         When NO_DATA_FOUND Then
         Begin
            -- Get the 'CONTACT' for the C3D Mailer, if it exists
            select substr(TO_ADDRESS,1,50)
              into v_contact
              from C3D_MAIL_CTL
             where UTIL_CODE = 'C3D_MAILER'
               and ALERT_TYPE = 'CONTACT';
         Exception
            When NO_DATA_FOUND Then
               v_contact := NULL;
         End;
      End;
      v_part_msg := substr(v_part_msg,1,instr(upper(v_part_msg),'#CONTACT#') -1 )||
                    v_contact ||
                    substr(v_part_msg,instr(upper(v_part_msg),'#CONTACT#') + 9);
      End If;
   End If;

   v_section := 'Build Text/PostScript';
   -- Add 'POSTSCRIPT' to the message
   v_full_msg := v_full_msg || crlf || crlf || v_part_msg;

   v_full_msg := rtrim(ltrim(v_full_msg, crlf), crlf);

   -- Return the built message to the calling procedure
   Return v_full_msg;

Exception
   When TOO_MANY_ROWS Then
      If Log_Util.Log$LogName is null Then
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: SEND_MAIL_FOR failed for Utility "'||v_Util_Code ||'" - Alert "'||v_Alert_Type||'".');
      Log_Util.LogMessage('C3DMAILER - ERROR: Section "'||v_section||'".');
      Log_Util.LogMessage('C3DMAILER - ERROR: Error Encountered: ' || SQLCODE);
      Log_Util.LogMessage('C3DMAILER - ERROR: Error Message: ' || SQLERRM);
      v_full_msg := 'C3DMAILER - ERROR: SEND_MAIL_FOR failed for Utility "'||v_Util_Code ||'" - Alert "'||v_Alert_Type||'".' || crlf ||
                    'C3DMAILER - ERROR: Section "'||v_section||'".'||crlf||
                    'C3DMAILER - ERROR: Error Encountered: ' || SQLCODE || crlf ||
       	            'C3DMAILER - ERROR: Error Message: ' || SQLERRM;

      C3D_UTIL_MAILER.Send_Mail_For('C3D_MAILER','FAILURE','CDE Mailer Send_Mail_For',v_full_msg);
   When Others Then
      If Log_Util.Log$LogName is null Then --prc 11/10/05
         Log_Util.LogSetName('C3DMAILER_' || to_char(sysdate, 'YYYYMMDD-HH24MI'),'C3D_MAILER');
      End If;
      Log_Util.LogMessage('C3DMAILER - ERROR: Build_Msg_For failed for '||v_Util_Code ||' - '||v_Alert_Type||'.');
      Log_Util.LogMessage('C3DMAILER - ERROR: Section "'||v_section||'".');
      Log_Util.LogMessage('C3DMAILER - ERROR: Error Encountered: ' || SQLCODE);
      Log_Util.LogMessage('C3DMAILER - ERROR: Error Message: ' || SQLERRM);

End;


End C3D_UTIL_MAILER;
/
