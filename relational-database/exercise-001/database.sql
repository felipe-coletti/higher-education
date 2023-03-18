create database database if not exists;

use database;

create table student (
	ra int primary key not null auto_increment,
	name varchar(255) not null,
	birthday date,
	email varchar(255) not null,
	telephone varchar(19)
);

create table discipline (
	id int primary key not null auto_increment,
	name varchar(255) not null,
	module varchar(255) not null,
	constraint studentRa foreign key (ra) references student (ra)
);

create table grade (
	id int primary key not null auto_increment,
	value decimal(2, 2) not null check (value between 0 and 10),
	constraint studentRa foreign key (ra) references student(ra),
	constraint disciplineId foreign key (id) references discipline (id)
);
