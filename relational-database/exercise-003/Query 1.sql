create database parking if not exists;

use parking;

create table product (
	id int not null auto_increment,
	cost float(6, 2),
	description varchar(255),
	primary key(id)
);

create table service (
	id int not null auto_increment,
	cost float(6, 2),
	time time,
	description varchar(255),
	primary key(id)
);

create table budget (
	id int not null auto_increment,
	value float(6, 2),
	situation varchar(255),
	date date,
	entryForecast datetime,
	paymentMethod varchar(255),
	constraint vehicleId foreign key (id) references vehicle (id),
	primary key(id)
);

create table client (
	cpf varchar(14) not null,
	name varchar(255),
	telephone varchar(19),
	address varchar(255),
	primary key(cpf)
);

create table vehicle (
	renavam int(11) not null,
	chassis varchar(255),
	model varchar(255),
	color varchar(255),
	constraint clientId foreign key (id) references client (id),
	primary key(renavam)
);

create table clientReport (
	id int not null auto_increment,
	problem varchar(255),
	date date,
	constraint vehicleId foreign key (id) references vehicle (id),
	primary key(id)
);

alter table client modify column name completName varchar(255);

alter table vehicle add column year int(4);
