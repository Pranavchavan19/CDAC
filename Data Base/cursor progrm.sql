use dac51;
delimiter //
create procedure cursor44414()
begin
declare practice int default 0;
declare name varchar(50);
declare salary1 decimal(15,2);
declare cursor1 cursor for select ord_no,customer_id from orders;   # declaration of cursor
declare  continue handler for not found set practice=1;

open cursor1;
loop1:loop
if practice then
leave loop1;
end if;
fetch cursor1 into name,salary1;
select name,salary1;
end loop;
close cursor1;


end //
delimiter ;
call cursor44414() ;

#############################################################################################################################
SELECT * FROM dac51.orders;