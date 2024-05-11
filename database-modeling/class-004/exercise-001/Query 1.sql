create database empresa;
create table funcionario (
	codigo int(8) unsigned zerofill primary key not null,
	primeiro_nome varchar(64) not null,
	segundo_nome varchar(64) not null,
	ultimo_nome varchar(64) not null,
	data_de_nascimento date,
	cpf varchar(14) not null,
	rg varchar(14) not null,
	endereco varchar(14) not null,
	cep varchar(14) not null,
	cidade varchar(14) not null,
	numero_de_telefone varchar(19) not null,
	codigo_do_departamento int,
	foreign key(codigo_de_departamento) references departamento(codigo)
	funcao varchar(14) not null,
	salario float(10.2) not null
);
create table departamento (
	codigo int(8) unsigned zerofill primary key not null,
	nome varchar(64) not null,
	localizacao varchar(64) not null,
	codigo_de_funcionario int,
	foreign key(codigo_de_funcionario) references funcionario(codigo)
)