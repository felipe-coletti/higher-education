create database teste;
use teste;
create table cadfun (
	CODFUN integer primary key not null,
	NOME varchar(40) not null,
	DEPTO char(2),
	FUNCAO char(20),
	SALARIO decimal(10, 2)
);
show tables;
describe cadfun;
describe cadfun CODFUN;