SELECT * FROM sakila.actor;
use sakila;
select *from  actor  where actor_id<4;
create index first_name on actor (first_name);
#*******************************************************************************************
#tempray table
#1 without using existing table 
create temporary table table1(tID int ,tName varchar(20));
desc table1;

#2 temporary table with structure of existing table
create temporary table table2 like city;
desc city;
select * from table2;
#temporaray table with structure and data of existing table
create temporary table table3 select * from city;
desc table3;
select * from table3;
create temporary table table4 select * from city;
desc table4;
