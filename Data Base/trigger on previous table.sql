SELECT * FROM dac51.voter;
delimiter //
create trigger before_salary_insert1
before insert on voter 
for each row
begin
if new.age<18 then
set new.age=44;
end if;
end //
delimiter ;
insert into voter values (106,"rutuja",12,444412000,177777);
insert into voter values (107,"raj",72,444412,1777);
select * from voter;