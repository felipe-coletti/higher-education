create database musicApp;

use musicApp;

create table recordLabel (
	id int not null auto_increment,
	name varchar(255),
  address varchar(255),
	primary key(id)
);

create table album (
	id int not null auto_increment,
	name varchar(255),
	value float,
  releaseDate date,
  constraint recordLabelId foreign key (id) references recordLabel (id),
	primary key(id)
);

create table music (
	id int not null auto_increment,
	name varchar(255),
  playtime time,
  track longBlob,
	primary key(id)
);

create table author (
	id int not null auto_increment,
	name varchar(255),
	primary key(id)
);

create table musicAlbum (
	constraint musicId foreign key (id) references music (id),
	constraint albumId foreign key (id) references album (id)
);

create table musicAuthor (
	constraint musicId foreign key (id) references music (id),
	constraint authorId foreign key (id) references author (id)
);
