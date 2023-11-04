use dac51;
SELECT * FROM dac51.employees;

                       ################################## CURSOR ##################################
                       
delimiter //
create procedure cursordemo1()
begin
declare name varchar(50);
declare salary1 decimal(15,2);

declare cursor1 cursor for select emp_name,salary from employees;   # declaration of cursor

open cursor1;
fetch cursor1 into name,salary1;
close cursor1;
select name,salary1;

end //
delimiter ;
call cursordemo1();

                       ##################################  END CURSOR ##################################



            ######################################### CURSOR WITH LOOP #########################################
            
delimiter //
create procedure cursordemo2()
begin
declare finished int default 0;
declare name varchar(50);
declare salary1 decimal(15,2);

declare cursor2 cursor for select emp_name,salary from employees;   # declaration of cursor
declare continue handler for not found set finished=1;
open cursor2;
loop1:loop
if finished then
leave loop1;
end if;


fetch cursor2 into name,salary1;
select name,salary1;
end loop;
close cursor2;


end //
delimiter ;
call cursordemo2();

              #########################################  END CURSOR WITH LOOP #########################################

#############################################################################################################################

delimiter //
create procedure cursor41()
begin
declare practice int default 0;
declare name varchar(50);
declare salary1 decimal(15,2);
end //
delimiter ;
call cursor41() ;

#############################################################################################################################
SELECT * FROM dac51.orders;