create database feb;
use emp;
create table Department(
depId int primary key,
Name varchar(50) not null
);
start transaction;
select * from department;
insert into department values(105,"finance");
update department set name="marketing"where depId=105;
insert into department values(104,"marketing"); 
insert into department values(106,"marg"); 
update department set name="Hr" where deptId=104;
update department set name="H" where deptId=105;
rollback;
commit;
select user from mysql.user;  # list of created user
show schemas;
select user();                # current working user

#************************************************************************************************************************
