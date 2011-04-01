Alter Table C3D_USER 
Add (  CREATE_USER       VARCHAR2(30))
/

Alter Table C3D_USER 
Add (  CREATE_DATE       DATE)
/

Alter Table C3D_USER 
Add (  MODIFY_USER      VARCHAR2(30))
/

Alter Table C3D_USER 
Add (  MODIFY_DATE      DATE)
/



CREATE OR REPLACE TRIGGER CU_BU 
 BEFORE UPDATE 
 ON C3D_USER 
 REFERENCING OLD AS OLD NEW AS NEW 
 FOR EACH ROW 
-- PL/SQL Block
BEGIN 
 :new.MODIFY_USER := substr(user,1,30); 
 :new.MODIFY_DATE := sysdate; 
END;
/



CREATE OR REPLACE TRIGGER CU_BI 
 BEFORE INSERT 
 ON C3D_USER 
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

