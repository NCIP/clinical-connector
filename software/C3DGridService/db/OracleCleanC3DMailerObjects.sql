declare
   cursor ix is
     select *
       from user_objects
      where object_type in ('TABLE', 'VIEW', 'FUNCTION', 'SEQUENCE','PACKAGE')
        and object_name in ('C3D_MAIL_ARCHIVE','C3D_MAIL_CTL','C3D_MAIL_MESSAGE_CTL','C3D_UTIL_MAILER');
begin
  for x in ix loop
    execute immediate('drop '||x.object_type||' '||x.object_name);
  end loop;
end;
/
