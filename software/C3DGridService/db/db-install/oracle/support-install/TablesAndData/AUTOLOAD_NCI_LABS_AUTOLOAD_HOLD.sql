CREATE TABLE NCI_LABS_AUTOLOAD_HOLD
(
  STUDY          VARCHAR2(15),
  CREATE_DATE    DATE,
  CREATE_USER    VARCHAR2(30),
  RESTART_DATE   DATE,
  RESTART_COUNT  NUMBER(6),
  REQUESTS       NUMBER(6)
)
/


