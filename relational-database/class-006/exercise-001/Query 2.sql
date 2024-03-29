use college;

insert into student values (1, 'Primeiro exemplo', 1, 'gender', 1.0);
insert into student values (2, 'Segundo exemplo', 1, 'gender', 2.0);
insert into student values (3, 'Terceiro exemplo', 1, 'gender', 3.0);

select * from student;

select id, name, age from student where id = 1;
select id, name, age from student where id > 1;
select id, name, age from student where id < 1;
select id, name, age from student where id <> 1;
select id, name, age from student where id >= 1;
select id, name, age from student where id <= 1;
select id, name, age from student where id >= 0 and id <= 2;
select id, name, age from student where id = 0 or id <= 2;
select id, name, age from student where name like binary 'Primeiro%';
select id, name, age from student where name like binary '% exemplo';
select id, name, age from student where name like binary '%Primeiro%';
select id, name, age from student where name like 'Primeiro';
select id, name, age from student where name in ('Primeiro', 'exemplo');

select id, name, age, average from student where average between 3.0 and 6.0;

select sum(average) from student;

select count(average) from student;

select max(average) from student;

select min(average) from student;

select avg(average) from student;

select sum(average) from student group by average;

select avg(average) from student group by average;

select gender, avg(average) from student group by gender, average;
select gender, avg(average) from student group by gender, average having avg(average) = 5;

select distinct name from student;

select now();

select * from aluno where name is not null;
select * from aluno where name is null;

select lower(name) from student;

select upper(name) from student;

select round(average, 1) from student;

select sqrt(average) from student;

select truncate(average, 1) from student;

select * from student order by name asc;
select * from student order by name desc;
select * from student order by id asc;
select * from student order by id desc;
