declare
   cursor ix is
     select *
       from user_objects
      where object_type in ('TABLE', 'VIEW', 'FUNCTION', 'SEQUENCE','PACKAGE', 'SYNONYM')
        and object_name in ('NCI_LABS_AUTOLOAD_HOLD','NCI_LABS_MANUAL_LOAD_BATCHES','NCI_LABS_MANUAL_LOAD_CTL',
		            'NCI_LABS_MANUAL_LOAD_HOLD','NCI_LABS_MANUAL_LOAD_STAGE','NCI_MANUAL_LOAD_BATCH_SEQ',
		            'NCI_MANUAL_LOAD_SEQ','NCI_LABS_MANUAL_LOADER');
begin
  for x in ix loop
    execute immediate('drop '||x.object_type||' '||x.object_name);
  end loop;
end;
/
