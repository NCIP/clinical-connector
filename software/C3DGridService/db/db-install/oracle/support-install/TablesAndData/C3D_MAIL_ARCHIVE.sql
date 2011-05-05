CREATE TABLE C3D_MAIL_ARCHIVE
(
  UTIL_CODE     VARCHAR2(15)               NOT NULL,
  ALERT_TYPE    VARCHAR2(10)               NOT NULL,
  TO_ADDRESS    VARCHAR2(40)               NOT NULL,
  MESSAGE_SUBJ  VARCHAR2(4000),
  MESSAGE_TEXT  LONG                       NOT NULL,
  SEND_DATE     DATE
)
/

