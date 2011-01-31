declare
   cursor ix is
     select *
       from user_objects
      where object_type in ('TABLE', 'VIEW', 'FUNCTION', 'SEQUENCE')
        and object_name in ('C3D_USER','CC_TRANSLATORS','CC_VALID_PROPERTY_VALUES',
                            'CLINICAL_CONNECTOR_PROPERTIES','DCAPI_USER_CREDENTIALS',
                            'HOTLINKRDC','STUDY_CDES_CTL','STUDY_PRIVATE_CDE',
                            'STUDY_SECURITY_LEVEL','STUDY_TRANSLATIONS','GETDECRYPT',
                            'CC_TRANSLATE','GETENCRYPT','REDACT');
begin
  for x in ix loop
    execute immediate('drop '||x.object_type||' '||x.object_name);
  end loop;
end;
/
