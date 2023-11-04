create database dac_sept_23;
use dac_sept_23;

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
#Aggregate Function
select max(income) as "Highest Income" from voter;
select min(income) as "Lowest Income" from voter;
select sum(income) as "Total Income" from voter;
select count(*) as "Total Record" from voter;
select avg(income) as "Average Income" from voter;
#clauses

select * from voter;
select voterName,age from voter;
select voterName as Name ,age as Age from voter;
#clauses
select * from voter;
select voterName as Name ,age as Age from voter  where income>20000;
select voterName as Name ,age as Age from voter  where income=3900;
select voterName as Name ,income from  voter  where income in(25000,3900,000);
select voterName as Name ,income from  voter  where income  between 0 and 3900;
select voterName as Name ,income from  voter  where  age >25 and  income>3000;
select voterName as Name ,income from  voter  where  age <25 and  income>3000;
select voterName as Name ,income from  voter  where income between 3300 and 25000;
select voterName as Name ,income from  voter  where  age >25 and  income>3000;
select  * from voter limit 2;
select  * from voter limit 2 offset 2; 
select  * from voter  where voterName like 'D%';
select  * from voter  where voterName like 'gan%';
select  * from voter  where voterName like '%_re_%';
select voterName,income from  voter  order by income desc;
select voterName,income from  voter  order by income asc;
select voterName,income from  voter  order by income ;
select age ,sum(income)  from  voter  group by (age);
select age ,sum(income)  from  voter  group by (age) having age>26;
select  * from voter where  aadhar is null;
select  * from voter where  aadhar is  not null;
select distinct(voterName) from voter;









