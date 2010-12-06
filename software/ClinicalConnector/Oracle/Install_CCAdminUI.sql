/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/* Author: Patrick Conrad (Ekagra Software Technologies)                   */
/* Date:   Dec. 3, 2010                                                    */
/* Description: This is the installation script for the Clinical Connector */
/*              Administrator UI                                           */
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
/* Modification History:                                                   */
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

-- Added condition to exit when error.  Just incase run accidently.
--WHENEVER SQLERROR EXIT

Select 'CCAdminUI for v2.3' "What", to_char(sysdate,'MM/DD/YYYY HH24:MI:SS') "Execution Date", User "User"
  from dual;

-- Spool a log file
spool Install_CCAdminUI.lst

--install the table, index and privs
Prompt ...Installing Table, Index, Synonym and Privileges.
@ddl/ClinicalConnectorProperties_TABLE.sql

-- Install Package
Prompt ...Installing Package, synonym and privileges
@plsql/encrypt.sql
@plsql/decrypt.sql

spool off

PROMPT
PROMPT FINISHED!
PROMPT