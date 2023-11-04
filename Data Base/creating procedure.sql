SELECT * FROM dac51.employees;

Delimiter //
# terminate after//
create procedure getAllEmployee()
begin

select emp_name from employees;
select * from employees;

end //  # creating procudure delimiter close
delimiter ;
call  getAllEmployee();  # for calling upper method

Delimiter //
create procedure getAllEmployee()
begin
select emp_name from employees;
select count(*) from employees;



end//
call  getAllEmployee();  # for calling upper method



#**********************************************************************************************************
SELECT * FROM dac51.employees;

Delimiter //
create procedure findMaxSalary(out highestSalary decimal(10,2))
begin

select max(salary)  into highestSalary from employees; 

end//
call findMaxSalary(@m);
select @m as Highest;
#*****************************************************************************************