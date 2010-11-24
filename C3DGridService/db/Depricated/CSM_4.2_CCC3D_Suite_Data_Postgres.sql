
INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_ENROLLPATIENT_SERVICE','Clinical Connector C3D, Enroll Patient on Study Service.')
;

INSERT INTO csm_role_privilege(role_id, privilege_id)
VALUES (
(select Role_id      from CSM_ROLE       where ROLE_NAME      = 'registrar'),
(select PRIVILEGE_ID from CSM_PRIVILEGE  where PRIVILEGE_NAME = 'CCC3D_ENROLLPATIENT_SERVICE')
);


INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_LOADLABS_SERVICE','Clinical Connector C3D, Load Laboratory Test Result Service.')
;

INSERT INTO csm_role_privilege(role_id, privilege_id)
VALUES (
(select Role_id      from CSM_ROLE       where ROLE_NAME      = 'lab_data_user'),
(select PRIVILEGE_ID from CSM_PRIVILEGE  where PRIVILEGE_NAME = 'CCC3D_LOADLABS_SERVICE')
);

INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_GETSTUDYCDES_SERVICE','Clinical Connector C3D, Get Study CDE IDs Metadata Service.')
;

INSERT INTO csm_role_privilege(role_id, privilege_id)
VALUES (
(select Role_id      from CSM_ROLE       where ROLE_NAME      = 'data_analyst'),
(select PRIVILEGE_ID from CSM_PRIVILEGE  where PRIVILEGE_NAME = 'CCC3D_GETSTUDYCDES_SERVICE')
);

INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_GETSTUDYCDEDATA_SERVICE','Clinical Connector C3D, Get Study Data via CDE Id Service.')
;

INSERT INTO csm_role_privilege(role_id, privilege_id)
VALUES (
(select Role_id      from CSM_ROLE       where ROLE_NAME      = 'data_analyst'),
(select PRIVILEGE_ID from CSM_PRIVILEGE  where PRIVILEGE_NAME = 'CCC3D_GETSTUDYCDEDATA_SERVICE')
);


INSERT INTO csm_privilege(privilege_name, privilege_description) VALUES ('CCC3D_ISVALIDSTUDY_SERVICE','Clinical Connector C3D, Validate C3D Study Existance Service.')
;

INSERT INTO csm_role_privilege(role_id, privilege_id)
VALUES (
(select Role_id      from CSM_ROLE       where ROLE_NAME      = 'registrar'),
(select PRIVILEGE_ID from CSM_PRIVILEGE  where PRIVILEGE_NAME = 'CCC3D_ISVALIDSTUDY_SERVICE')
);

INSERT INTO csm_role_privilege(role_id, privilege_id)
VALUES (
(select Role_id      from CSM_ROLE       where ROLE_NAME      = 'lab_data_user'),
(select PRIVILEGE_ID from CSM_PRIVILEGE  where PRIVILEGE_NAME = 'CCC3D_ISVALIDSTUDY_SERVICE')
);

INSERT INTO csm_role_privilege(role_id, privilege_id)
VALUES (
(select Role_id      from CSM_ROLE       where ROLE_NAME      = 'data_analyst'),
(select PRIVILEGE_ID from CSM_PRIVILEGE  where PRIVILEGE_NAME = 'CCC3D_ISVALIDSTUDY_SERVICE')
);





INSERT INTO CSM_PROTECTION_ELEMENT
   ( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_ISVALIDSTUDY_SERVICE', 'Clinical Connector C3D, Validate C3D Study Existance Service',
       'ISVALIDSTUDY_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_ISVALIDSTUDY_SERVICE', 'Clinical Connector C3D, Validate C3D Study Existance Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PG_PE(PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (
(select PROTECTION_GROUP_ID   from CSM_PROTECTION_GROUP    where PROTECTION_GROUP_NAME   = 'CCC3D_ISVALIDSTUDY_SERVICE'),
(select PROTECTION_ELEMENT_ID from CSM_PROTECTION_ELEMENT  where PROTECTION_ELEMENT_NAME = 'CCC3D_ISVALIDSTUDY_SERVICE')
);


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_GETSTUDYCDEDATA_SERVICE', 'Clinical Connector C3D, Get Study Data via CDE Id Service',
       'GETSTUDYCDEDATA_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_GETSTUDYCDEDATA_SERVICE', 'Clinical Connector C3D, Get Study Data via CDE Id Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PG_PE(PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (
(select PROTECTION_GROUP_ID   from CSM_PROTECTION_GROUP    where PROTECTION_GROUP_NAME   = 'CCC3D_GETSTUDYCDEDATA_SERVICE'),
(select PROTECTION_ELEMENT_ID from CSM_PROTECTION_ELEMENT  where PROTECTION_ELEMENT_NAME = 'CCC3D_GETSTUDYCDEDATA_SERVICE')
);


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_GETSTUDYCDES_SERVICE', 'Clinical Connector C3D, Get Study CDE IDs Metadata Service',
       'GETSTUDYCDES_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_GETSTUDYCDES_SERVICE', 'Clinical Connector C3D, Get Study CDE IDs Metadata Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PG_PE(PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (
(select PROTECTION_GROUP_ID   from CSM_PROTECTION_GROUP    where PROTECTION_GROUP_NAME   = 'CCC3D_GETSTUDYCDES_SERVICE'),
(select PROTECTION_ELEMENT_ID from CSM_PROTECTION_ELEMENT  where PROTECTION_ELEMENT_NAME = 'CCC3D_GETSTUDYCDES_SERVICE')
);


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_LOADLABS_SERVICE', 'Clinical Connector C3D, Load Laboratory Test Result Service',
       'LOADLABS_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_LOADLABS_SERVICE', 'Clinical Connector C3D, Load Laboratory Test Result Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PG_PE(PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (
(select PROTECTION_GROUP_ID   from CSM_PROTECTION_GROUP    where PROTECTION_GROUP_NAME   = 'CCC3D_LOADLABS_SERVICE'),
(select PROTECTION_ELEMENT_ID from CSM_PROTECTION_ELEMENT  where PROTECTION_ELEMENT_NAME = 'CCC3D_LOADLABS_SERVICE')
);


INSERT INTO CSM_PROTECTION_ELEMENT
( PROTECTION_ELEMENT_NAME, PROTECTION_ELEMENT_DESCRIPTION, OBJECT_ID, APPLICATION_ID )
Select 'CCC3D_ENROLLPATIENT_SERVICE', 'Clinical Connector C3D, Enroll Patient on Study Service',
       'ENROLLPATIENT_SERVICE', application_id
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PROTECTION_GROUP
( PROTECTION_GROUP_NAME, PROTECTION_GROUP_DESCRIPTION, APPLICATION_ID, LARGE_ELEMENT_COUNT_FLAG )
select 'CCC3D_ENROLLPATIENT_SERVICE', 'Clinical Connector C3D, Enroll Patient on Study Service',
       application_id, 0
  from csm_application where application_name = 'CTMS_SUITE'
;

INSERT INTO CSM_PG_PE(PROTECTION_GROUP_ID, PROTECTION_ELEMENT_ID)
VALUES (
(select PROTECTION_GROUP_ID   from CSM_PROTECTION_GROUP    where PROTECTION_GROUP_NAME   = 'CCC3D_ENROLLPATIENT_SERVICE'),
(select PROTECTION_ELEMENT_ID from CSM_PROTECTION_ELEMENT  where PROTECTION_ELEMENT_NAME = 'CCC3D_ENROLLPATIENT_SERVICE')
);

