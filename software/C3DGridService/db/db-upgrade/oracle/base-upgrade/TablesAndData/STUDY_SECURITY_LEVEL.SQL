Alter table STUDY_SECURITY_LEVEL
ADD (  CREATE_USER   VARCHAR2(30))
/

Alter table STUDY_SECURITY_LEVEL
ADD (  CREATE_DATE   DATE)
/

Alter table STUDY_SECURITY_LEVEL
ADD (  MODIFY_USER  VARCHAR2(30))
/

Alter table STUDY_SECURITY_LEVEL
ADD (  MODIFY_DATE  DATE)
/

CREATE UNIQUE INDEX SSL_PK ON STUDY_SECURITY_LEVEL
(STUDY)
/


CREATE OR REPLACE TRIGGER SSL_BU 
 BEFORE UPDATE 
 ON STUDY_SECURITY_LEVEL 
 REFERENCING OLD AS OLD NEW AS NEW 
 FOR EACH ROW 
-- PL/SQL Block
BEGIN 
 IF (:new.ACCESS_METHOD <> 'PUBLIC' and :new.ACCESS_METHOD <> 'PRIVATE') THEN 
       raise_application_error(-20001, 
           'Warning on Insert: ACCESS_METHOD must be either "PUBLIC" or "PRIVATE".'); 
 END IF; 
 :new.MODIFY_USER := substr(user,1,30); 
 :new.MODIFY_DATE := sysdate; 
END;
/


CREATE OR REPLACE TRIGGER SSL_BI 
 BEFORE INSERT 
 ON STUDY_SECURITY_LEVEL 
 REFERENCING OLD AS OLD NEW AS NEW 
 FOR EACH ROW 
-- PL/SQL Block
BEGIN 
 IF (:new.ACCESS_METHOD <> 'PUBLIC'  and :new.ACCESS_METHOD <> 'PRIVATE') THEN 
       raise_application_error(-20001, 
           'Warning on Insert: ACCESS_METHOD must be either "PUBLIC" or "PRIVATE".'); 
 END IF; 
 if :new.CREATE_USER IS NULL THEN 
   :new.CREATE_USER := substr(user,1,30); 
 END IF; 
 :new.CREATE_DATE := sysdate; 
END;
/

