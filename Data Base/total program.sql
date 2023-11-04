
# For creation of database
create database dac51;
#For selecting the databases
use dac51;
create table employees(
emp_id int,
emp_name varchar(50),
emp_post varchar(50));

show tables;
select * from employees;
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
where emp_id='104';

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


create table voter(
voterId Int,
voterName varchar(50) not null,
age int check(age>=18),
aadhar varchar(12) unique,
income decimal(10,2)default 0.00,
primary key(voterId)
);
desc voter;
Insert into voter(voterId,voterName,age,aadhar,income)values(101,"Ramesh",21,"380007819376",25000);
Insert into voter(voterId,voterName,age,aadhar,income)values(102,"Ramesh",21,"880007819376",000);
Insert into voter(voterId,voterName,age,aadhar,income)values(103,"suresh",23,"888007819376",3000);
Insert into voter(voterId,voterName,age,aadhar,income)values(104,"dinesh",29,"888007819976",3300);
Insert into voter(voterId,voterName,age,aadhar,income)values(105,"ganesh",30,"888007919976",3900);
select * from voter;
#aggreagate function
Select max(income)as "Highest Income"from voter;
Select min(income)as "Lowest Income"from voter;
Select sum(income)as "Total Income"from voter;
Select count(*)as "Total Record"from voter;
Select avg(income)as "Average Income"from voter;

#clauses

select voterName,age from voter;
select voterName as Name,age as Age from voter;
select voterName as Name,age as Age from voter where income>20000;
select voterName as Name,age as Age from voter where income=3900;
select voterName as Name, income from voter where income in(3000,3300,3900);
select voterName as Name, income from voter where income between 0 and 5000;
select voterName as Name, income from voter where age>25 and income>3800;
select * from voter limit 3 offset 3;
select * from voter where voterName like 'D%';
select * from voter where voterName like '%sh';
select * from voter where voterName like 'g%';
select * from voter where voterName like '%re%';

select voterName,income from voter order by income;
select voterName,income from voter order by income desc;


select age, sum(income)from voter group by(age);
select age, sum(income)from voter group by(age) having age>21;

select * from voter where aadhar is null;
select * from voter where aadhar is not null;

select distinct(voterName) from voter;
/*
DDL
1.Show databases;
create database databaseName;
use databaseName(
co11 datatype(size) constraint,  */


create table  orders(
ord_no bigInt not null,
purch_amt decimal(8,2)default 0.00,
ord_date varchar(12) ,
customer_id  int not null,
salesman_id  int not null,
primary key(ord_no)
);
desc orders;
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70001,150.5,"2012-10-05",3005,5002);
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70009,270.5,"2012-09-10",3001,5005);
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70002,65.26,"2012-10-05",3002,5001);
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70005,2400.6,"2012-07-27",3007,5001);
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70008,5760,"2012-09-10",3002,5001);
select * from orders;
select avg(purch_amt) as "avg orders" from orders;

select count(distinct (salesman_id)) from orders;

create table customer(
customer_id Int,
first_name varchar(20),
last_name varchar(20)
);
Insert into customer(customer_Id,first_name,last_name)values(101,"ramesh","solanki");
Insert into customer(customer_Id,first_name,last_name)values(102,"suresh","sharma");
Insert into customer(customer_Id,first_name,last_name)values(103,"bhavesh","roy");
Insert into customer(customer_Id,first_name,last_name)values(104,"kailash","gupta");
Insert into customer(customer_Id,first_name,last_name)values(105,"mahesh","sharma");

select * from customer;

create table orders(
order_Id Int,
customer_Id Int,
product_name varchar(20)
);


Insert into orders(order_Id,customer_Id,product_name)values(1,102,"laptop");
Insert into orders(order_Id,customer_Id,product_name)values(2,104,"mobile");
Insert into orders(order_Id,customer_Id,product_name)values(3,102,"camera");
Insert into orders(order_Id,customer_Id,product_name)values(4,106,"bike");
Insert into orders(order_Id,customer_Id,product_name)values(5,108,"chair");

select * from orders;

select customer.first_name,orders.product_name from customer inner join orders on customer.customer_Id=orders.customer_Id;
#Select customer names and product names using INNER JOIN
SELECT customer.first_name, orders.product_name
FROM customer
INNER JOIN orders ON customer.customer_Id = orders.customer_Id;

create table Department(
depId int primary key,
Name varchar(50) not null
);

insert into Department(depId,Name) values(101,"Account"),(102,"Developer"),(103,"Admin");
select * from Department;

create table Employee(
empId int primary key,
empName varchar(50) not null,
empSalary decimal(15,2),
did int ,
foreign key(did) references Department (depId)
);
select * from Employee;
# copy structure of existing table to new table
create table deprt like department;
desc deprt;

insert into department(department_id,name)values(101,"Account"),(102,"developer")

create table Department(
depId int primary key,
Name varchar(50) not null
);


insert into Department(depId,Name) values(101,"Account"),(102,"Developer"),(103,"Admin");
select * from Department;
create table Employee(
empId int primary key,
empName varchar(50) not null,
empSalary decimal(15,2),
did int ,
foreign key(did) references Department (depId)
);
select * from  Department;
insert into employee(empId,empName,empSalary,did)
values (3,"Kailashsh",55789,103),(4,"Bhavesh",45789,106),(5,"Ramesh",45789,107),(6,"Ramesh",45789,108);
select employee.did,empName,department.name from employee,department where employee.did=department.deptid;

# copy structure of existing table to new table
create table deprt like department;
desc deprt;

insert into department(dept_id,name)values(101,"Account"),(102,"Developer"),(103,"admin");
select*from department;

create table employee(
emp_id int primary key,
emp_name varchar(20)not null,
emp_salary decimal(15,2),
did int,
foreign key(did) references department(dept_id)
);
insert into employee(emp_id,emp_name,emp_salary,did)values(1,"Ramesh",45000,102),(2,"suresh",34562,101),(3,"kailash",35000,103),(4,"bhavesh",45000,101);
select * from employee;

select employee.did,employee.emp_name,depart.name fromemployee,department where employee.did=department.dept_id;
select employee.did,employee.emp_name,department.name,max(employee.emp_salary)fromemployee,department where employee. did=department.dept_id;

create database feb;
use feb;
create table Department(
depId int primary key,
Name varchar(50) not null
);
start transaction;
select*from department;
insert into department values(105,"finance");
update department set name="marketting" where deptId=105;
insert into department values(104,"marketing"); 

update department set name="Hr" where deptId=104;
rollback;
commit;