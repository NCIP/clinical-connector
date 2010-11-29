spool CSM-CCC3D-Suite-Data-Oracle.lst

set define off echo on



INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_ENROLLPATIENT_SERVICE','Clinical Connector C3D, Enroll Patient on Study Service.')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, csm_privilege_privilege_id_seq.currval from csm_role
where role_name = 'registrar'
/


INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_LOADLABS_SERVICE','Clinical Connector C3D, Load Laboratory Test Result Service.')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, csm_privilege_privilege_id_seq.currval from csm_role
where role_name = 'lab_data_user'
/

INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_GETSTUDYCDES_SERVICE','Clinical Connector C3D, Get Study CDE IDs Metadata Service.')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, csm_privilege_privilege_id_seq.currval from csm_role
where role_name = 'data_analyst'
/

INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_GETSTUDYCDEDATA_SERVICE','Clinical Connector C3D, Get Study Data via CDE Id Service.')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, csm_privilege_privilege_id_seq.currval from csm_role
where role_name = 'data_analyst'
/

INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_ISVALIDSTUDY_SERVICE','Clinical Connector C3D, Validate C3D Study Existance Service.')
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, csm_privilege_privilege_id_seq.currval from csm_role
where role_name = 'registrar'
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, csm_privilege_privilege_id_seq.currval from csm_role
where role_name = 'lab_data_user'
/

INSERT INTO csm_role_privilege(role_id, privilege_id)
select Role_id, csm_privilege_privilege_id_seq.currval from csm_role
where role_name = 'data_analyst'
/




INSERT INTO CSM_PROTECTION_ELEMENT
   ( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_ISVALIDSTUDY_SERVICE', 'Clinical Connector C3D, Validate C3D Study Existance Service',
       'ISVALIDSTUDY_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_ISVALIDSTUDY_SERVICE', 'Clinical Connector C3D, Validate C3D Study Existance Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_GETSTUDYCDEDATA_SERVICE', 'Clinical Connector C3D, Get Study Data via CDE Id Service',
       'GETSTUDYCDEDATA_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_GETSTUDYCDEDATA_SERVICE', 'Clinical Connector C3D, Get Study Data via CDE Id Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_GETSTUDYCDES_SERVICE', 'Clinical Connector C3D, Get Study CDE IDs Metadata Service',
       'GETSTUDYCDES_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_GETSTUDYCDES_SERVICE', 'Clinical Connector C3D, Get Study CDE IDs Metadata Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_LOADLABS_SERVICE', 'Clinical Connector C3D, Load Laboratory Test Result Service',
       'LOADLABS_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_LOADLABS_SERVICE', 'Clinical Connector C3D, Load Laboratory Test Result Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_ENROLLPATIENT_SERVICE', 'Clinical Connector C3D, Enroll Patient on Study Service',
       'ENROLLPATIENT_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_ENROLLPATIENT_SERVICE', 'Clinical Connector C3D, Enroll Patient on Study Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
/

INSERT INTO CSM_PG_PE (
   PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (CSM_PROTECTIO_PROTECTION_G_SEQ.currval,CSM_PROTECTIO_PROTECTION_E_SEQ.currval )
/

set define on echo off

spool off
