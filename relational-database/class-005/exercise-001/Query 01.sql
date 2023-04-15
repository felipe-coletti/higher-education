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

desc `client`;

show tables;

INSERT INTO client (
	name,
	cpf,
	street,
	number,
	neighborhood,
	city,
	federativeUnit,
	zipCode
) VALUES (
	'GILBERTO',
	'12345678901',
	'AV. Astronautas',
	'1333',
	'Cidade Jardim',
	'S. J. Dos Campos',
	'SP', '12227-220'
);

INSERT INTO client (
	name,
	cpf,
	street,
	number,
	neighborhood,
	city,
	federativeUnit,
	zipCode
) VALUES (
	'EDUARDO',
	'12345678902',
	'AV. X', '1456',
	'Vila',
	'Rio de Janeiro',
	'RJ',
	'35000000'
);
