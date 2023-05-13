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
