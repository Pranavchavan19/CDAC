use dac51;
use pranav;
delimiter //
create procedure EvenOdd()
begin
declare n int ;
declare c varchar(50);
set n= 5;
if(n%2=0) then
set c="number is even";
else
set c="number is odd";
end if;
select c as result;


end //
delimiter ;
drop procedure EvenOdd; # drop 
call EvenOdd();

