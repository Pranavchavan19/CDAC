create database employee;
use employee;
create table employees(
emp_id int,
emp_name varchar(50),
emp_post varchar(50));

show tables;
desc employees;

insert into employees(emp_id,emp_name,emp_post)
      values(101,"raman","ceo");
 
 insert into employees(emp_id,emp_name,emp_post)
      values(102,"dev","manager");
      
      insert into employees(emp_id,emp_name,emp_post)
      values(103,"pranav","tester");
      
      insert into employees(emp_id,emp_name,emp_post)
      values(104,"ganesh","HR");
      
       insert into employees(emp_id,emp_name,emp_post)
      values(105,"suresh","developer");

select * from employees;

DELETE from employees
where emp_id='105';

alter table employees
add column salary decimal(10,2)after emp_post;

update employees
set salary = 10008
where emp_id =103;

update employees
set salary = 10
where emp_id =102;

update employees
set salary = 100000
where emp_id =101;

update employees
set salary = 100055
where emp_id =104;

update employees
set salary = 10044
where emp_id =105;

select * from employees;
alter table employees
add column phno varchar (10) after salary;
update employees set salary=1232.44 where emp_id=104;
update employees set salary=7658.4 where emp_id=101;
update employees set salary=123 where emp_id=105;