use college;

insert into student values (1, "name", 1, "gender", 1.0);
insert into student values (2, "name", 1, "gender", 2.0);
insert into student values (3, "name", 1, "gender", 3.0);

select * from student;

select id, name, age from student where id = 1;

select id, name, age from student where name like binary "% name";

select id, name, age, average from student where average between 3.0 and 6.0;

select sum(average) from student;

select count(average) from student;

select max(average) from student;

select min(average) from student;

select avg(average) from student;

select sum(average) from student group by average;

select sum(average) from student group by average having sum(average) < 2;

select avg(average) from student group by average having avg(average) = 5;

select distinct name from student;

select now();

select * from aluno where name is null;

select upper(name) from student;

select lower(name) from student;

select round(average, 2) from student;

select sqrt(average) from student;

select truncate(average, 1) from student;

select * from student order by name asc;

select * from student order by name desc;

select * from student order by id asc;

select * from student order by id desc;
