INSERT INTO csm_user(user_id, login_name, first_name, last_name,"password", email_id) 
VALUES ((select nextval('csm_user_user_id_seq')),
         '/O=caBIG/OU=caGrid/OU=Stage LOA1/OU=Dorian/CN=cctsdev1',
         'coppagridsvcs','stage',
         'put_password_here',
         'TesterUserQA@gmail.com' );
         
INSERT INTO csm_user_group_role_pg(
            user_group_role_pg_id, user_id, group_id, protection_group_id, role_id,update_date)
    VALUES (
(select nextval('csm_user_grou_user_group_r_seq')),
(select user_id from csm_user where login_name = '/O=caBIG/OU=caGrid/OU=Stage LOA1/OU=Dorian/CN=cctsdev1'),
(select group_id from csm_group where group_name = 'data_analyst'),
(select protection_group_id from csm_protection_group where protection_group_name = 'CCC3D_GETSTUDYCDES_SERVICE'),
(select role_id from csm_role where role_name = 'data_analyst'),
now());         

INSERT INTO csm_user_group_role_pg(
            user_group_role_pg_id, user_id, group_id, protection_group_id, role_id,update_date)
    VALUES (
(select nextval('csm_user_grou_user_group_r_seq')),
(select user_id from csm_user where login_name = '/O=caBIG/OU=caGrid/OU=Stage LOA1/OU=Dorian/CN=cctsdev1'),
(select group_id from csm_group where group_name = 'data_analyst'),
(select protection_group_id from csm_protection_group where protection_group_name = 'CCC3D_GETSTUDYCDEDATA_SERVICE'),
(select role_id from csm_role where role_name = 'data_analyst'),
now());         