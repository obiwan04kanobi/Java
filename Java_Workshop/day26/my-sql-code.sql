create database db;
use db;
create table mytable(
name varchar(255),
age int,
gender char);
insert into mytable(name,age,gender)
values("Mayank",19,'M');
insert into mytable(name,age,gender)
values("Khalid",19,'M');
insert into mytable(name,age,gender)
values("Pranay",19,'M');
select *from mytable;
select name from mytable where age = 19;