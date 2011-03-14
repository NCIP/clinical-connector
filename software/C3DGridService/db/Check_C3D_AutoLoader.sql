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

Select 'Checking for AUTO LOADER Objects' "Checking" from dual;

Select 'C3D Auto Load Object Check "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".' "C3D Auto Load Object Check"
  from all_objects
 where object_name = 'NCI_LABS_AUTOLOAD_HOLD'
Union
select 'C3D Auto Load Hold Object Check "'||'NCI_LABS_AUTOLOAD_HOLD'||'" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'NCI_LABS_AUTOLOAD_HOLD');

Select 'C3D Auto Load Batch Object "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".' "C3D Auto Load Batch Object"
  from all_objects
 where object_name = 'NCI_LABS_MANUAL_LOAD_BATCHES'
Union
Select 'C3D Auto Load Batch Object "'||'NCI_LABS_MANUAL_LOAD_BATCHES'||'" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'NCI_LABS_MANUAL_LOAD_BATCHES');

Select 'C3D Auto Load Object Check "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".' "C3D Auto Load Object Check"
  from all_objects
 where object_name = 'NCI_LABS_MANUAL_LOAD_CTL'
Union
Select 'C3D Auto Load Control Object "'||'NCI_LABS_MANUAL_LOAD_CTL'||'" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'NCI_LABS_MANUAL_LOAD_CTL');

Select 'Checking for NCI LAB LOADER Objects' "Checking" from dual;

Select 'NCI Lab Loader Object Check "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".' "NCI Lab Loader Object Check"
  from all_objects
 where object_name = 'NCI_LABS'
Union
select 'NCI Lab Loader Object Check "NCI_LABS" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'NCI_LABS');

Select 'NCI Lab Loader Object Check "'||object_name||'" EXISTS for "'||owner||
       '" as a "'||object_type||'".' "NCI Lab Loader Object Check"
  from all_objects
 where object_name = 'CDW_DATA_TRANSFER_V3'
Union
Select 'NCI Lab Loader Object Check "CDW_DATA_TRANSFER_V3" DOES NOT exist.'
  from dual
 where not exists (select 'X' from all_objects
                    where object_name = 'CDW_DATA_TRANSFER_V3');

Select  'If the PUBLIC synonyms for NCI_LABS object and CDW_DATA_TRANSFER_V3 object' "Notes", 1 from dual
union
Select  'are not found then the Auto Loader will not execute successfully.' "notes", 2 from dual
union 
Select  'Consult with your C3D Database Administrator if this issue exists.' "notes", 3 from dual
order by 2;
 

spool off

PROMPT
PROMPT FINISHED!
PROMPT