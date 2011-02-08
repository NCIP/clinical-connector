Declare

   DEFAULT_ENCRYPTION_KEY	  varchar2(80) := '12C3PR34567890ENCRYPTIONC3PR4KEY5678901234567890';
   DESEDE_ENCRYPTION_SCHEME	  varchar2(10) := 'DESede';
   DES_ENCRYPTION_SCHEME		varchar2(10) := 'DES';
   encryptedString varchar2(400);

	
Begin
   Insert into DCAPI_USER_CREDENTIALS (UNAME, PWORD, STATUS, C3D_TNS_ENTRY)
   Values ('@database.dcapi.user@',
           getEncrypt('@database.dcapi.user@',DEFAULT_ENCRYPTION_KEY,DES_ENCRYPTION_SCHEME,'1'),
           'ACTIVE',
           '@database.name@')
   where not exists 
         (select 'X' from DCAPI_USER_CREDENTIALS
           where UNAME = '@database.dcapi.user@');


   Update DCAPI_USER_CREDENTIALS (UNAME, PWORD, STATUS, C3D_TNS_ENTRY)
      set PWORD         = getEncrypt('@database.dcapi.user@',DEFAULT_ENCRYPTION_KEY,DES_ENCRYPTION_SCHEME,'1'),
          STATUS        = 'ACTIVE',
          C3D_TNS_ENTRY = '@database.name@'
   where UNAME = '@database.dcapi.user@');
End;
