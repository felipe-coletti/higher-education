create database if not exists college;

use college;

create table student (
	id int not null auto_increment,
	cpf int(11) not null,
	email varchar(70) not null,
	name varchar(255) not null,
	telephone varchar(19),
	primary key (id),
	unique (cpf)
);

alter table student add column gender varchar(255);

alter table student drop column gender;

alter table student modify column cpf varchar(14);

alter table student change column name fullName varchar(255);

drop table student;
