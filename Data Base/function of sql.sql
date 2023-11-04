use dac51;
#---------------------------STRING FUNCTION----------------------------------------------

select char("pranav chavan");
select concat("Pranav"," ","Chavan");
select lower("PRANAV");
select upper("pranav");
select trim("    Pan");
select substr("pranav",1,3);
select instr("My name is pranav", "s");
select length("Pranav Chavan");

#---------------------------NUMERIC FUNCTION----------------------------------------------

select mod(10,2);
select power(10,2);
select round(193.25,1);
select truncate(193.222,2);

#---------------------------Date Function------------------------------------------------
select curdate();  # it gives currect date
select now();  # It gives  current date with time
select month(curdate()); #  it gives current month from current date
select year(curdate());  #  it gives current year from current date 
select day(curdate());   #  it gives current date from current date 
select month('2023-12-23 3:45:00');  # it gives current day from  given format
select day('2023-12-23 3:45:00');   # it gives current day from  given format

select sysdate();  # it gives current date and time

#--------------------------Stored Function----------------------------------------------
Delimiter //
create function hello_sir()
	returns varchar(50)
    deterministic
begin
	return "Hallo sir";
end //
delimiter ;

select hello_sir();

delimiter //
create function addition(x int, y int)
	returns int
    deterministic
begin
	return(x+y);
end //
delimiter ; 
select addition(10,23);