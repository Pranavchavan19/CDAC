use dac51;
create table user(
id int primary key auto_increment,
name varchar(50),
email varchar (100)

);
create table audit_log(
event_type varchar(50),
event_discription varchar(150)

);
  #user is table name
##################################### INSERT QQUERRY #####################################
delimiter //
create trigger after_user_insert
after insert on user 
for each row
begin
insert into audit_log(event_type,event_discription)
values('insert',concat('new user inserted : Id ',new.id,',name',new.name,',email',new.email));

end //
delimiter ;
insert into user(name,email) values("ramesh","ram@gamil.com");
insert into user(name,email) values("suresh","suresh@gamil.com");
insert into user(name,email) values("pranav","pranav@gamil.com");

select * frmom user;
select * from  audit_log;

############################################### END ###############################################

############################################### DELETE ###############################################

delimiter //
create trigger before_user_delete
before delete on user 
for each row 
begin
insert into audit_log(event_type,event_discription)
values('delete',concat('old user deleted : Id ',old.id,',name',old.name,',email',old.email));
end //
delimiter ;
 delete from user where id =3;
 
 ############################################### END ###############################################
############################################### UPDATE ###############################################
delimiter //
create trigger after_user_update
after update on user
for each row
begin
insert into audit_log(event_type,event_discription)
values('update',concat('user updated  : Id ',new.id,',name',new.name,',email',new.email));

end //
delimiter ;

update user  set  email="ramesh@gmail.com" where id =1;

############################################### END ###############################################

delimiter //
create trigger before_salary_insert
before insert on employees 
for each row
begin
if new.salary<0 then
set new.salary=5000;
end if;
end //
delimiter ;
insert into employees values (6,"rutuja","Manager",-12000,102);
delete from  employees
where emp_id=6;

select * from user;
select * from  audit_log;
 drop trigger after_user;
select * from employees;
