CREATE TABLE CLINICAL_CONNECTOR_PROPERTIES
(
  PROPERTY_KEY    VARCHAR2(50)             NOT NULL,
  PROPERTY_VALUE  VARCHAR2(50)             NOT NULL,
  CREATE_USER     VARCHAR2(30),
  CREATE_DATE     DATE,
  MODIFY_USER     VARCHAR2(30),
  MODIFY_DATE     DATE
)
/


CREATE UNIQUE INDEX CCP_PK ON CLINICAL_CONNECTOR_PROPERTIES
(PROPERTY_KEY)
/

CREATE OR REPLACE TRIGGER CCP_BI 
 BEFORE INSERT 
 ON CLINICAL_CONNECTOR_PROPERTIES 
 REFERENCING OLD AS OLD NEW AS NEW 
 FOR EACH ROW 
-- PL/SQL Block
BEGIN 
 if :new.CREATE_USER IS NULL THEN 
   :new.CREATE_USER := substr(user,1,30); 
 END IF; 
 :new.CREATE_DATE := sysdate; 
END;
/


CREATE OR REPLACE TRIGGER CCP_BU 
 BEFORE UPDATE 
 ON CLINICAL_CONNECTOR_PROPERTIES 
 REFERENCING OLD AS OLD NEW AS NEW 
 FOR EACH ROW 
-- PL/SQL Block
BEGIN 
 :new.MODIFY_USER := substr(user,1,30); 
 :new.MODIFY_DATE := sysdate; 
END;
/


Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values ('csm.application.name', 'CTMS_SUITE')
/

Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values   ('csm.enroll.role', 'registrar')
/

Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values   ('csm.lab.role', 'lab_data_user')
/

Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values   ('enrollPatientManager.saveBirthDate.value', 'true')
/

Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values   ('enrollPatientManager.saveGender.value', 'true')
/

Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values   ('enrollPatientManager.saveInitials.value', 'true')
/

Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values   ('enrollPatientManager.saveEnrollmentDate.value', 'true')
/

Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values   ('enrollPatientService.useCSM', 'true')
/

Insert into CLINICAL_CONNECTOR_PROPERTIES   (PROPERTY_KEY, PROPERTY_VALUE)
 Values   ('loadLabsService.useCSM', 'true')
/

