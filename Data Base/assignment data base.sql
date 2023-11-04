create database  pranav;
use pranav;
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
select * from orders;
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70009,270.65,"2012-09-10",3001,5005);
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70002,65.26,"2012-10-05",3002,5001);
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70005,2400.6,"2012-07-27",3007,5001);
insert into orders(ord_no,purch_amt,ord_date,customer_id,salesman_id)values(70008,5760,"2012-09-10",3002,5001);
SELECT count(distinct( salesman_id))FROM orders;
# 1.the average purchase amount of all orders




