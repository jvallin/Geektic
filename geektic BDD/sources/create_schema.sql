drop table spectacle if exists cascade;
drop sequence spectacle_seq if exists;
drop sequence representation_seq if exists;

create table spectacle (
	id numeric not null,
	titre varchar(255) not null,
	artiste varchar(255) not null,
	type varchar(255) not null,
	primary key (id)
);

create table representation (
	id numeric not null,
	date_representation timestamp not null,
	id_spectacle numeric not null,
	primary key (id),
	foreign key (id_spectacle) references spectacle(id)
);

create sequence spectacle_seq start with 1000;
create sequence representation_seq start with 1000;