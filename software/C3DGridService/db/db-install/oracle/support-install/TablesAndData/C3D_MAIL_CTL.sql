CREATE TABLE C3D_MAIL_CTL
(
  UTIL_CODE     VARCHAR2(15),
  ALERT_TYPE    VARCHAR2(10),
  TO_ADDRESS    VARCHAR2(50),
  CREATE_USER   VARCHAR2(30),
  CREATE_DATE   DATE,
  MODIFY_USER   VARCHAR2(30),
  MODIFY_DATE   DATE
)
/

CREATE OR REPLACE TRIGGER CMC_BU 
 BEFORE UPDATE 
 ON C3D_MAIL_CTL
 REFERENCING OLD AS OLD NEW AS NEW 
 FOR EACH ROW 
-- PL/SQL Block
BEGIN 
 :new.MODIFY_USER := substr(user,1,30); 
 :new.MODIFY_DATE := sysdate; 
END;
/

CREATE OR REPLACE TRIGGER CMC_BI 
 BEFORE INSERT 
 ON C3D_MAIL_CTL
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

INSERT INTO C3D_MAIL_CTL ( UTIL_CODE, ALERT_TYPE, TO_ADDRESS )
 VALUES ('AUTO_LOADER', 'FAILURE', 'emailaddress@mail.server')
/

INSERT INTO C3D_MAIL_CTL ( UTIL_CODE, ALERT_TYPE, TO_ADDRESS )
 VALUES ('AUTO_LOADER', 'SUCCESS', 'emailaddress@mail.server')
/

INSERT INTO C3D_MAIL_CTL ( UTIL_CODE, ALERT_TYPE, TO_ADDRESS )
 VALUES ('AUTO_LOADER', 'CONTACT', 'emailaddress@mail.server')
/

INSERT INTO C3D_MAIL_CTL ( UTIL_CODE, ALERT_TYPE, TO_ADDRESS )
 VALUES ('C3D_MAILER', 'FAILURE', 'emailaddress@mail.server')
/

INSERT INTO C3D_MAIL_CTL ( UTIL_CODE, ALERT_TYPE, TO_ADDRESS )
 VALUES ('C3D_MAILER', 'WARNING', 'emailaddress@mail.server')
/

INSERT INTO C3D_MAIL_CTL ( UTIL_CODE, ALERT_TYPE, TO_ADDRESS )
 VALUES ('C3D_MAILER', 'MAILSERVER', 'MAILFWD.NIH.GOV')
/

INSERT INTO C3D_MAIL_CTL ( UTIL_CODE, ALERT_TYPE, TO_ADDRESS )
 VALUES ('C3D_MAILER', 'MAILFROM', 'emailaddress@mail.server')
/

INSERT INTO C3D_MAIL_CTL ( UTIL_CODE, ALERT_TYPE, TO_ADDRESS )
 VALUES ('C3D_MAILER', 'CONTACT', 'emailaddress@mail.server')
/

