
show databases;
create database Employee;
use Employee;
create table emp (id int, name varchar(25),designation varchar(25));
show tables;
insert into emp (id,name,designation) values (101,'Pranav','Java Developer');
select * from emp;
insert into emp(id,name,designation) values (102,'kanake','c++');
select * from emp;
insert into emp(id,name,designation) values (103,'sangrash','c');
insert into emp(id,name,designation) values (104,'dipali','sql');
update  table emp set name="patil" where  id=102 ;