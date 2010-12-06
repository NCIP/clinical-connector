
CREATE TABLE CLINICAL_CONNECTOR_PROPERTIES
(
  PROPERTY_KEY    VARCHAR2(50 BYTE)             NOT NULL,
  PROPERTY_VALUE  VARCHAR2(50 BYTE)             NOT NULL
)
/


CREATE UNIQUE INDEX CCP_PK ON CLINICAL_CONNECTOR_PROPERTIES
(PROPERTY_KEY)
LOGGING
NOPARALLEL
/


ALTER TABLE CLINICAL_CONNECTOR_PROPERTIES ADD (
  CONSTRAINT CCP_PK
 PRIMARY KEY
 (PROPERTY_KEY))
/



Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('csm.application.name', 'CTMS_SUITE');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('csm.enroll.role', 'registrar');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('csm.lab.role', 'lab_data_user');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('csm.CDE.role', 'data_analyst');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('csm.CDEData.role', 'data_analyst');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('enrollPatientManager.saveBirthDate.value', 'false');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('enrollPatientManager.saveGender.value', 'false');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('enrollPatientManager.saveInitials.value', 'true');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('enrollPatientManager.saveEnrollmentDate.value', 'false');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('enrollPatientService.useCSM', 'false');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('loadLabsService.useCSM', 'false');
Insert into CLINICAL_CONNECTOR_PROPERTIES
   (PROPERTY_KEY, PROPERTY_VALUE)
 Values
   ('isValidStudyService.useCSM', 'true');
COMMIT;
