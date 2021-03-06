set pagesize 100
set linesize 100
set num 10
drop table fest_admin;
drop table fest_event_Staff_create;
drop table fest_event_org_create;
drop table fest_staff_ids;
  create table fest_admin(id varchar2(20),name varchar2(30),password varchar2(30),gender varchar2(10),age number(3),blood_grp varchar2(10),qualification varchar2(20),department varchar2(30),role varchar2(30),experience number(3), constraint fest_adm_pk primary key(id,name,department,role));
create table fest_event_org_create(id varchar2(10),name varchar2(30),password varchar2(30),gender varchar2(20),mobileno number(10),dept varchar2(50),event varchar2(50), constraint fest_event_org_pk primary key(id,name,mobileno,event));
 create table fest_event_staff_create(sid varchar2(10),name varchar2(20),gender varchar2(10),mobileno number(10),event varchar2(30),orgid varchar2(10),department varchar2(70));
alter table fest_event_staff_create  add constraint p_k_staff primary key(sid,name,mobileno);


create table fest_staff_ids(id varchar2(10));
 alter table fest_staff_ids add constraint p_k_staff_id primary key(id);
insert into fest_admin values('admin','sujatha','festadmin','female',50,'AB-','MTECH','Computer Science','Vice Principal',10);
insert into fest_staff_ids values('EVOS1');
insert into fest_staff_ids values('EVOS2');
insert into fest_staff_ids values('EVOS3');
insert into fest_staff_ids values('EVOS4');
insert into fest_staff_ids values('EVOS5');
insert into fest_staff_ids values('EVOS6');
insert into fest_staff_ids values('EVOS7');
insert into fest_staff_ids values('EVOS8');
insert into fest_staff_ids values('EVOS9');
insert into fest_staff_ids values('EVOS10');
insert into fest_staff_ids values('EVOS11');
insert into fest_staff_ids values('EVOS12');
insert into fest_staff_ids values('EVOS13');
insert into fest_staff_ids values('EVOS14');
insert into fest_staff_ids values('EVOS15');
insert into fest_staff_ids values('EVOS16');
insert into fest_staff_ids values('EVOS17');
insert into fest_staff_ids values('EVOS18');
insert into fest_staff_ids values('EVOS19');
insert into fest_staff_ids values('EVOS20');
insert into fest_staff_ids values('EVOS21');
insert into fest_staff_ids values('EVOS22');
insert into fest_staff_ids values('EVOS23');
insert into fest_staff_ids values('EVOS24');
insert into fest_staff_ids values('EVOS25');
commit;
alter table fest_event_staff_create  add constraint   f_k_staff foreign key(orgid)  references fest_event_org_create(id) on delete cascade;