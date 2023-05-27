create database if not exists parking;

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
	primary key(id),
	constraint vehicleId foreign key (id) references vehicle (id)
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
	primary key(renavam),
	constraint clientId foreign key (id) references client (id)
);
create table clientReport (
	id int not null auto_increment,
	problem varchar(255),
	date date,
	primary key(id),
	constraint vehicleId foreign key (id) references vehicle (id)
);
create table productItem (
	constraint productId foreign key (id) references product (id),
	constraint budgetId foreign key (id) references budget (id),
	cost float(6, 2),
	situation varchar(255),
	quantity int
);
create table serviceItem (
	constraint servicetId foreign key (id) references service (id),
	constraint budgetId foreign key (id) references budget (id),
	cost float(6, 2),
	situation varchar(255)
);

alter table client change column name fullName varchar(255);

alter table vehicle add column year int(4);

drop table product;
drop table service;
drop table budget;
drop table client;
drop table vehicle;
drop table clientReport;
drop table productItem;
drop table serviceItem;
