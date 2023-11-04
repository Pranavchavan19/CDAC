SELECT * FROM dac51.employees;
#*************************************************************************************************************
Delimiter //
# terminate after//
create procedure getAllEmployee()
begin

select emp_name from employees;

end //  # creating procudure delimiter close
delimiter ;
call  getAllEmployee();  # for calling upper method


#*********************************************************************************************************************************
Delimiter //
create procedure getAllEmployee1()
begin
select emp_name from employees;
select count(*) from employees;



end//
delimiter ;
call  getAllEmployee1();  # for calling upper method



#**********************************************************************************************************
SELECT * FROM dac51.employees;

Delimiter //
create procedure findMaxSalary(out highestSalary decimal(10,2))
begin

select max(salary)  into highestSalary from employees; 

end//
delimiter ;
call findMaxSalary(@m);
select @m as Highest;
#*****************************************************************************************
Delimiter //
create procedure findMaxSalary(in id int ,out salary decimal(10,2))
begin

select salary  into   emp_id   from employees where emp_id=103; 

end//
delimiter ;
call findMaxSalary(103,@m);
select @m as neww;

#******************************************************************************************************************************************

Delimiter //
create procedure updateSalary (inout sal decimal(10,2),in id int)
begin
select salary into sal from employees where emp_id=id;
 set sal=sal*2.10;
 
 update employees set salary=sal where emp_id=id;
 
end //
delimiter ;

call updateSalary(@s,102);
select @s;
#*************************************************************************************************************


