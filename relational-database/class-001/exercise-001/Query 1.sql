create database if not exists college;

use college;

create table student (
	ra int not null auto_increment,
	name varchar(255) not null,
	birthdate date,
	email varchar(70) not null,
	telephone varchar(19),
	primary key (ra)
);
create table discipline (
	id int not null auto_increment,
	name varchar(255) not null,
	module int(1) not null,
	primary key (id),
	constraint studentRa foreign key (ra) references student (ra)
);
create table grade (
	id int not null auto_increment,
	value decimal(2, 2) not null check (value between 0 and 10),
	primary key (id),
	constraint studentRa foreign key (ra) references student (ra),
	constraint disciplineId foreign key (id) references discipline (id)
);
