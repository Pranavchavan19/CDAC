create database shop;
use shop;
create table customer (c_id int primary key,firstName varchar(20),lastName varchar(20) ) ;
insert into customer values(101,"Ramesh","Solanki");
insert into customer values(102,"Suresh","Sharma");
insert into customer values(103,"Bhavesh","Roy");
insert into customer values(104,"Kailesh","Sharma");
select * from customer;

create table orders (o_id int primary key,c_id int,prod_Name varchar(20) ) ;
insert into  orders values(1,102,"laptop");
insert into  orders values(2,104,"mobile");
insert into  orders values(3,102,"camera");
insert into  orders values(4,106,"bike");
insert into  orders values(5,108,"chair");

select * from orders ;
select firstName,orders.prod_name from customer inner join orders on customer.c_id=orders.c_id
