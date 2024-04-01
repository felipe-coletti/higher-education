create database if not exists test;

use test;

create table client (
	id int auto_increment,
	name varchar(50),
	cpf varchar(14),
	street varchar(50),
	number varchar(5),
	neighborhood varchar(50),
	city varchar(50),
	federativeUnit varchar(2),
	zipCode varchar(9),
	primary key (id)
);

desc client;

show tables;

insert into client (
	name,
	cpf,
	street,
	number,
	neighborhood,
	city,
	federativeUnit,
	zipCode
) values (
	'Primeiro exemplo',
	'CPF',
	'Rua',
	'Número',
	'Bairro',
	'Cidade',
	'UF',
	'CEP'
);
insert into client (
	name,
	cpf,
	street,
	number,
	neighborhood,
	city,
	federativeUnit,
	zipCode
) values (
	'Segundo exemplo',
	'CPF',
	'Rua',
	'Número',
	'Bairro',
	'Cidade',
	'UF',
	'CEP'
);

select * from client;

delete from client;
delete from client where id = 1;

update client set name = 'Exemplo';

update client set name = 'Exemplo', cpf = 'CPF', street = 'Rua', number = 'Número', neighborhood = 'Bairro', city = 'Cidade', federativeUnit = 'UF', zipCode = 'CEP' where id = 1;
