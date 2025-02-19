create database practice_3; 
use practice_3; 

create table dept (
   id int primary key , 
   name varchar(50)
);  

insert into dept values 
(101,"english"),
(102,"hindi");   
 
update dept 
set id=111
where id=101;

select * from dept  ;


create table teacher(
   id int primary key ,
   name varchar(50),
   dept_id int, 
   foreign key (dept_id) references dept(id) 
   on delete cascade 
   on update cascade 
);   


insert into teacher values 
(1,"nage",101),
(2,"sonar",102);

select * from teacher ; 








