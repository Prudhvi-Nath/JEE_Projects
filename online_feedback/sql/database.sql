set pagesize 100
set linesize 100
set num 10
drop table studentmarks;
drop table student_attd;
drop table student_details;
drop type Technology;
drop table studentfeedback;


drop table teacherlogin;
drop type techno;

create type Technology as OBJECT(technology1 varchar2(20),technology2 varchar2(20),technology3 varchar2(20),technology4 varchar2(20),technology5 varchar2(20));
/

 create table student_details(sid varchar2(15) constraint pk_sid primary key,name varchar2(30),password varchar2(20),gender varchar2(10),ug varchar2(40),specilization varchar2(30),social varchar2(10),link varchar2(45),tech Technology,DOB varchar2(10));
create table studentfeedback(first number(5),second number(5),third number(5),fourth number(5),fifth number(5),sixth number(5),seventh number(5),eight number(5),nine number(5),tenth number(5),eleven number(5),twelth number(5),thirteen number(5),fourteen number(5),fiftheen number(5),sixteen number(5),seventeen number(5),eighteen number(5),nineteen number(5),twenteen number(5),twentyone number(5),twentytwo number(5),twentythree number(5),twentyfour number(5),twentyfive number(5),id varchar2(15) constraint pk_stfeed primary key,cmt varchar2(100),dateoffeed varchar2(10));
 create table student_attd(january number(5),febuary number(5),march number(5),april number(5),may number(5),june number(5),july number(5),augest number(5),september number(5),october number(5),november number(5),december number(5),total number(8),id varchar2(15) references student_details(sid) on delete cascade,year number(4),dateenter varchar2(10));
create table studentmarks(telugu number(3),hindi number(3),english number(3),maths number(3),science number(5),social number(3),percentage number(3),id varchar2(15) constraint pk_idmark primary key  references student_details on delete cascade,total number(3));
create type techno as OBJECT(techno1 varchar2(20),techno2 varchar2(20),techno3 varchar2(20),techno4 varchar2(20))
  /
create table teacherlogin(name varchar2(30),id varchar2(15) constraint pk_ids primary key,DOB varchar2(10),gender varchar2(10),dept varchar2(30),branch varchar2(30),bloodgrp varchar2(10),join number(6),tech techno,pass varchar2(10));

