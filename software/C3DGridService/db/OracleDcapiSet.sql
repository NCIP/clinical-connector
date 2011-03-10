Declare

   DEFAULT_ENCRYPTION_KEY	  varchar2(80) := '12C3PR34567890ENCRYPTIONC3PR4KEY5678901234567890';
   DESEDE_ENCRYPTION_SCHEME	  varchar2(10) := 'DESede';
   DES_ENCRYPTION_SCHEME	  varchar2(10) := 'DES';
	
Begin
   Insert into DCAPI_USER_CREDENTIALS (UNAME, PWORD, STATUS, C3D_TNS_ENTRY)
   select '@database.dcapi.user@',
          getEncrypt('@database.dcapi.password@',DEFAULT_ENCRYPTION_KEY,DES_ENCRYPTION_SCHEME,'1'),
          'ACTIVE',
          '@database.name@'
   from dual
   where not exists 
         (select 'X' from DCAPI_USER_CREDENTIALS
           where upper(UNAME) = upper('@database.dcapi.user@'));


   Update DCAPI_USER_CREDENTIALS
      set PWORD         = getEncrypt('@database.dcapi.password@',DEFAULT_ENCRYPTION_KEY,DES_ENCRYPTION_SCHEME,'1'),
          STATUS        = 'ACTIVE',
          C3D_TNS_ENTRY = '@database.name@'
   where upper(UNAME) = upper('@database.dcapi.user@');
End;
