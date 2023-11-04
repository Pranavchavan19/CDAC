use dac51;
select char (65, 71, 89, 122);
select concat ("anup", "pardhi");
select lower ("Softplyminal");#to make lower case all charater
select upper ("Softplyminal"); #to make upper case all charater
select trim ("  hello"); # remove the space before hellow word
select substr("Swapnil" , s, e); #for serach in string 
select instr("Swapnil is my friend", friend);
select length("your name ");

#******************************************************************************************************************************
delimiter //
 create function hellosir()
 
 returns  varchar(50)
  deterministic
 begin
 return"Hello sir";
 end //
 delimiter ;
 select hellosir();
 #******************************************************************************************************************************
 
 
 
delimiter //
create function addition(x int ,y int)
returns int
deterministic
begin
return (x+y);
end //
delimiter ;
 select addition(10 ,23);

#******************************************************************************************************************************
