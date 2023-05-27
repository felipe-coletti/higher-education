create database database;

use database;

create table tableA (
	name varchar(255)
);

create table tableB (
	name varchar(255)
);

insert into tableA values('Primeiro exemplo');
insert into tableB values('Segundo exemplo');

select * from tableA as a, tableB as b;
select * from tableA as a, tableB as b where a.name = b.name;

select * from tableA as a inner join tableB as b on a.name = b.name; 

select * from tableA as a left join tableB as b on a.name = b.name; 

select * from tableA as a right join tableB as b on a.name = b.name; 

select * from tableA as a left join tableB as b on a.name = b.name where b.name is null; 

select * from tableA as a right join tableB as b on a.name = b.name where a.name is null; 

select * from tableA as a left join tableB as b on a.name = b.name where b.name is null union select * from tableA as a right join tableB as b on a.name = b.name where a.name is null; 
select * from tableA as a left join tableB as b on a.name = b.name union select * from tableA as a right join tableB as b on a.name = b.name; 


