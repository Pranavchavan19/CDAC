use shop;
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
insert into employee(empId, empName, empSalary, did)values(1, "Ramesh", 45789, 102);

insert into employee(empId, empName, empSalary, did)values(2, "Ramesh", 35789, 101);

insert into employee(empId, empName, empSalary, did)values(3, "kailash", 55789, 103);

insert into employee(empId, empName, empSalary, did)
values(4, "Bhavesh", 75789, 102);

insert into employee(empId, empName, empSalary, did)
values(5, "Dinesh", 25789, 101);

insert into employee(empId, empName, empSalary, did)
values(6, "Ganesh", 35000, 103);

select * from Employee;
select * from Department;
select employee.empName,department.name from employee,Department where employee.did=Department.depid;
# copy structure of existing table to new table
create table deprt like department;
desc deprt;
