create database dac_sep_23;
use dac_sep_23;
create table voter(
voterId int ,
voterName varchar(50) not null,
age int check(age>=18),
aadhar varchar(12) unique,
income decimal(10,2) default 0.00,
primary key(voterId)

);
desc voter;
insert into voter(voterId,voterName,age,aadhar,income) values(101,"ramesh",33,"123456789123",25000);
insert into voter(voterId,voterName,age,aadhar) values(102,"ramesh",34,"123456777787");
select * from voter;
show tables;
insert into voter(voterId,voterName,age,aadhar,income) values(103,"ramesh",23,"123456789623",25700);

