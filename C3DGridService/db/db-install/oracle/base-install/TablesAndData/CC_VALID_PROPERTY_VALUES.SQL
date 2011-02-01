
CREATE TABLE CC_VALID_PROPERTY_VALUES
(
  VALID_PROPERTY_KEY    VARCHAR2(50),
  VALID_PROPERTY_VALUE  VARCHAR2(50),
  CREATE_USER           VARCHAR2(30),
  CREATE_DATE           DATE,
  MODIFY_USER           VARCHAR2(30),
  MODIFY_DATE           DATE
)
/

CREATE UNIQUE INDEX CCVPVP_PK ON CC_VALID_PROPERTY_VALUES
(VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE)
/

CREATE OR REPLACE TRIGGER CCVPV_BU 
 BEFORE UPDATE 
 ON CC_VALID_PROPERTY_VALUES 
 REFERENCING OLD AS OLD NEW AS NEW 
 FOR EACH ROW 
-- PL/SQL Block
BEGIN 
 :new.MODIFY_USER := substr(user,1,30); 
 :new.MODIFY_DATE := sysdate; 
END;
/



CREATE OR REPLACE TRIGGER CCVPV_BI 
 BEFORE INSERT 
 ON CC_VALID_PROPERTY_VALUES 
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



Insert into CC_VALID_PROPERTY_VALUES (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('csm.application.name', 'CTMS_SUITE')
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values  ('csm.enroll.role', 'registrar'     )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE  )
 Values   ('csm.lab.role', 'lab_data_user'     )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientManager.saveBirthDate.value', 'false'     )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientManager.saveGender.value', 'false'     )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientManager.saveInitials.value', 'true'     )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientManager.saveEnrollmentDate.value', 'false'     )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientService.useCSM', 'true'     )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('loadLabsService.useCSM', 'false'     )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientManager.saveBirthDate.value', 'true'    )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientManager.saveGender.value', 'true'    )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientManager.saveInitials.value', 'false'    )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientManager.saveEnrollmentDate.value', 'true'    )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('enrollPatientService.useCSM', 'false'    )
/

Insert into CC_VALID_PROPERTY_VALUES   (VALID_PROPERTY_KEY, VALID_PROPERTY_VALUE   )
 Values   ('loadLabsService.useCSM', 'true')
/
