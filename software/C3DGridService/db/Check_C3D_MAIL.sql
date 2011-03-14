/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/* Author: Patrick Conrad (Ekagra Software Technologies)                 */
/* Date:   Dec. 13, 2007                                                 */
/* Description: This is the script to check for existance of the C3D     */
/*              Mail Utility                                             */
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
/* Modification History:                                                 */
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

set lines 132 pages 60

-- Spool a log file
spool Check_c3d_mail.lst

Select to_char(sysdate,'MM/DD/YYYY HH24:MI:SS') "Execution Date", User "User"
  from dual;

--Check for object existance

Select 'C3D Mail Archive Object "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".' "C3D Mail Archive Object Check"
  from all_objects
 where object_name = 'C3D_MAIL_ARCHIVE'
Union
select 'C3D Mail Archive Object "'||'C3D_MAIL_ARCHIVE'||'" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'C3D_MAIL_ARCHIVE');

Select 'C3D Mail Control Object "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".' "C3D Mail Control Object Check"
  from all_objects
 where object_name = 'C3D_MAIL_CTL'
Union
Select 'C3D Mail Control Object "'||'C3D_MAIL_CTL'||'" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'C3D_MAIL_CTL');

Select 'C3D Mail Message Control Object "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".'
  from all_objects
 where object_name = 'C3D_MAIL_MESSAGE_CTL'
Union
Select 'C3D Mail Message Control Object "'||'C3D_MAIL_MESSAGE_CTL'||'" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'C3D_MAIL_MESSAGE_CTL');

Select 'C3D Mail Processor Object "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".'
  from all_objects
 where object_name = 'C3D_UTIL_MAILER'
Union
Select 'C3D Mail Processor Object "'||'C3D_UTIL_MAILER'||'" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'C3D_UTIL_MAILER');

spool off

PROMPT
PROMPT FINISHED!
PROMPT