/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/* Author: Patrick Conrad (Ekagra Software Technologies)                 */
/* Date:   Aug. 17, 2010                                                 */
/* Description: This is the upgrade script for the C3D Lab Loader        */
/*              AutoLoader add-on                                        */
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
/* Modification History:                                                 */
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

-- Added condition to exit when error.  Just incase run accidently.
--WHENEVER SQLERROR EXIT

-- Spool a log file
spool upgrade_DB0bjects.lst

Select 'Upgrade of DBObjects' "WHAT", to_char(sysdate,'MM/DD/YYYY HH24:MI:SS') "Execution Date", User "User"
  from dual;

--upgrade table, index and privs
Prompt ...Upgrading Table, Index, Synonym and Privileges.
--Upgrade nci_labs_manual_load_hold table to increase size of columns
@upgrade_DBObjects_for_v22.sql

-- Packages
Prompt ...upgrade/replace Package, synonym and privileges

spool off

PROMPT
PROMPT FINISHED!
PROMPT