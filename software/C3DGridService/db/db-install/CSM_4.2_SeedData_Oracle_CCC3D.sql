spool CSM-SeedData-Oracle-CCC3D.lst

set define off echo on


INSERT INTO csm_application(application_name, application_description) VALUES ('CCC3D', 'Clinical Connect for C3D');

-- Clinical Connector C3D only needs 3 roles; only insert them if they do not already exist.
-- Registration Role
INSERT INTO csm_role(role_name, role_description, application_id, active_flag)
select 'registrar', 'Accepts and approves/denies subject registration requests; requests subject registration on a particular study',
       application_id, 1
  from csm_application
 where application_name = 'CCC3D'
   and not exists (select 'x' from csm_role where role_name = 'registratr')
/

-- Lab Data Loader Role
INSERT INTO csm_role(role_name, role_description, application_id, active_flag)
select 'lab_data_user',	'Enters, edits, and imports labs from LIMS, viewing labs, selecting and sending labs to CDMS and caAERS',
       application_id, 1
  from csm_application
 where application_name = 'CCC3D'
   and not exists (select 'x' from csm_role where role_name = 'lab_data_user')
/

-- Get Data Role
INSERT INTO csm_role(role_name, role_description, application_id, active_flag)
select 'data_analyst',	'Read-only: searches for data, uses built-in analysis tools, exports data to third party tools',
       application_id, 1
  from csm_application
 where application_name = 'CCC3D'
   and not exists (select 'x' from csm_role where role_name = 'data_analyst')
/

-- Registration Privilege
INSERT INTO csm_privilege(privilege_name, privilege_description)
select 'registrar', 'Accepts and approves/denies subject registration requests; requests subject registration on a particular study'
  from dual
 where not exists (select 'x' from csm_privilege where privilege_name = 'registratr')
/

-- Lab Data Loader Privilege
INSERT INTO csm_privilege(privilege_name, privilege_description)
select 'lab_data_user',	'Enters, edits, and imports labs from LIMS, viewing labs, selecting and sending labs to CDMS and caAERS'
  from dual
 where not exists (select 'x' from csm_privilege where privilege_name = 'lab_data_user')
/

-- Get Data Privilege
INSERT INTO csm_privilege(privilege_name, privilege_description)
select 'data_analyst',	'Read-only: searches for data, uses built-in analysis tools, exports data to third party tools'
  from dual
 where not exists (select 'x' from csm_privilege where privilege_name = 'data_analyst')
/

/* vv Look at this section again!  Is it needed for Clinical Connector C3D? vv */

-- Registrar Role/Priv
INSERT INTO csm_role_privilege(role_id, privilege_id)
select role_id, privilege_id
  from csm_role,
       csm_privilege
 where role_name = 'registrar'
   and privilege_name = 'registrar'
/

-- Lab Data Role/Priv
INSERT INTO csm_role_privilege(role_id, privilege_id)
select role_id, privilege_id
  from csm_role,
       csm_privilege
 where role_name = 'lab_data_user'
   and privilege_name = 'lab_data_user'
/

-- Data Analyst Role/Priv
INSERT INTO csm_role_privilege(role_id, privilege_id)
select role_id, privilege_id
  from csm_role,
       csm_privilege
 where role_name = 'data_analyst'
   and privilege_name = 'data_analyst'
/
/* ^^ Look at this section again!  Is it needed for Clinical Connector C3D? ^^ */


INSERT INTO csm_privilege(privilege_name, privilege_description)
 select 'CCC3D_ENROLLPATIENT_SERVICE','Clinical Connector C3D, Enroll Patient on Study Service.'
   from dual
  where not exists (select 'X' from csm_privilege where privilege_name = 'CCC3D_ENROLLPATIENT_SERVICE')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, privilege_id
  from csm_role,
       csm_privilege
where role_name = 'registrar'
  and privilege_name = 'CCC3D_ENROLLPATIENT_SERVICE'
/


INSERT INTO csm_privilege(privilege_name, privilege_description)
 select 'CCC3D_LOADLABS_SERVICE','Clinical Connector C3D, Load Laboratory Test Result Service.'
   from dual
  where not exists (select 'X' from csm_privilege where privilege_name = 'CCC3D_LOADLABS_SERVICE')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, privilege_id
  from csm_role,
       csm_privilege
where role_name = 'lab_data_user'
and privilege_name = 'CCC3D_LOADLABS_SERVICE'
/

INSERT INTO csm_privilege(privilege_name, privilege_description)
 select 'CCC3D_GETSTUDYCDES_SERVICE','Clinical Connector C3D, Get Study CDE IDs Metadata Service.'
   from dual
  where not exists (select 'X' from csm_privilege where privilege_name = 'CCC3D_GETSTUDYCDES_SERVICE')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, privilege_id
  from csm_role,
       csm_privilege
where role_name = 'data_analyst'
and privilege_name = 'CCC3D_GETSTUDYCDES_SERVICE'
/

INSERT INTO csm_privilege(privilege_name, privilege_description)
 select 'CCC3D_GETSTUDYCDEDATA_SERVICE','Clinical Connector C3D, Get Study Data via CDE Id Service.'
   from dual
  where not exists (select 'X' from csm_privilege where privilege_name = 'CCC3D_GETSTUDYCDEDATA_SERVICE')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, privilege_id
  from csm_role,
       csm_privilege
where role_name = 'data_analyst'
and privilege_name = 'CCC3D_GETSTUDYCDEDATA_SERVICE'
/

INSERT INTO csm_privilege(privilege_name, privilege_description)
 select 'CCC3D_ISVALIDSTUDY_SERVICE','Clinical Connector C3D, Validate C3D Study Existance Service.'
   from dual
  where not exists (select 'X' from csm_privilege where privilege_name = 'CCC3D_ISVALIDSTUDY_SERVICE')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, privilege_id
  from csm_role,
       csm_privilege
where role_name in ('registrar','lab_data_user','data_analyst')
and privilege_name = 'CCC3D_ISVALIDSTUDY_SERVICE'
/




INSERT INTO CSM_PROTECTION_ELEMENT
   ( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_ISVALIDSTUDY_SERVICE', 'Clinical Connector C3D, Validate C3D Study Existance Service',
       'ISVALIDSTUDY_SERVICE', application_id
  from csm_application
 where application_name = 'CCC3D'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_ISVALIDSTUDY_SERVICE', 'Clinical Connector C3D, Validate C3D Study Existance Service',
       application_id, 0
  from csm_application
 where application_name = 'CCC3D'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_GETSTUDYCDEDATA_SERVICE', 'Clinical Connector C3D, Get Study Data via CDE Id Service',
       'GETSTUDYCDEDATA_SERVICE', application_id
  from csm_application where application_name = 'CCC3D'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_GETSTUDYCDEDATA_SERVICE', 'Clinical Connector C3D, Get Study Data via CDE Id Service',
       application_id, 0
  from csm_application where application_name = 'CCC3D'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_GETSTUDYCDES_SERVICE', 'Clinical Connector C3D, Get Study CDE IDs Metadata Service',
       'GETSTUDYCDES_SERVICE', application_id
  from csm_application where application_name = 'CCC3D'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_GETSTUDYCDES_SERVICE', 'Clinical Connector C3D, Get Study CDE IDs Metadata Service',
       application_id, 0
  from csm_application where application_name = 'CCC3D'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_LOADLABS_SERVICE', 'Clinical Connector C3D, Load Laboratory Test Result Service',
       'LOADLABS_SERVICE', application_id
  from csm_application where application_name = 'CCC3D'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_LOADLABS_SERVICE', 'Clinical Connector C3D, Load Laboratory Test Result Service',
       application_id, 0
  from csm_application where application_name = 'CCC3D'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_ENROLLPATIENT_SERVICE', 'Clinical Connector C3D, Enroll Patient on Study Service',
       'ENROLLPATIENT_SERVICE', application_id
  from csm_application where application_name = 'CCC3D'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_ENROLLPATIENT_SERVICE', 'Clinical Connector C3D, Enroll Patient on Study Service',
       application_id, 0
  from csm_application where application_name = 'CCC3D'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


set define on echo off

spool off
