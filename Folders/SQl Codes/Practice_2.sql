create database practice_2; 
use practice_2;  
 
 create table student ( 
 rollno int primary key,
 name varchar(50),
 marks int not null,
 grade varchar(1),
 city varchar(20)
 );
 
 select * from student; 
 
 insert into student values 
(101, "anil", 78, "C", "Pune"),
(102, "bhumika", 93, "A", "Mumbai"),
(103, "chetan", 85, "B", "Mumbai"),
(104, "dhruv", 96, "A", "Delhi"),
(105, "emanuel", 12, "F", "Delhi"),
(106, "farah", 82, "B", "Delhi"); 

select city from student ; 
select distinct city  from student;
select * from student where city="delhi"; 	 
select * from student where marks>80;
 select * from student where marks>80 and city="delhi";
select * from student where marks+10 >100; 
select * from student where marks between 80 and 100;
select * from student where city in ("mumbai","delhi"); 
select * from student where city not in ("mumbai","delhi"); 
select * from student limit  3;
select * from student order by marks asc;
select * from student order by marks desc limit 3;
select max(marks) from student ; 
select min(marks) from student ; 
select sum(marks) from student ; 
select avg(marks) from student ;
select count(rollno) from student ;

select city,count(name)
from student group by city;

select city,avg(marks) 
from student 
group by city order by avg(marks) asc; 

select grade,count(rollno)
from student  
group by grade 
order by grade asc;

select city,count(name) 
from student 
group by city
having max(marks)>90;


/*  General order  
SELECT columns 
FROM table name 
WHERE condition   denote condtion on the rows
GROUP BY columns 
HAVING conditon    denotes condition on the groups
ORDER BY columns(s) ASC */  
 
set sql_safe_updates=0;

update city
SET grade = "O" 
where grade = "A";
  
delete from student  
where marks < 33;
 
select * from student ;  

-- Table related Query 

alter table student 
add column age int;

 select * from student ;

alter table student 
drop column age ;

alter table student 
rename to students; 
 

alter table student 
change column rollno srollno int;

truncate table student; -- it will delete the student table data

alter table student 
change name full_name varchar(50); 

delete from student 
where marks < 80;
   
alter table student 
drop column grade;




