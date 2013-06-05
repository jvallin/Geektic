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
	foreign key (id_spectacle) references spectacle(id_spectacle)
);

create sequence spectacle_seq start with 1000;
create sequence representation_seq start with 1000;

insert into spectacle values (1,'Balckangel', 'VALLIN', 'M', 'Jeremy');
insert into spectacle values (2,'Rafoufoun', 'PANOYAN', 'M', 'Rafi');
insert into spectacle values (3,'SebLaChaude', 'CHANAL', 'M', 'Sebastien');
insert into spectacle values (4,'Bibiche', 'PEREAU', 'F', 'Clara');
insert into spectacle values (5,'Loulou', 'DUPONTAI', 'F', 'Louise');
insert into spectacle values (6,'Robert', 'SAIRIEN', 'M', 'Jean');
insert into spectacle values (7,'Boobs', 'BAR', 'M', 'Leny');
insert into spectacle values (8,'Doremi', 'DEAU', 'M', 'Remy');
insert into spectacle values (9,'Juju', 'DUFRANC', 'F', 'Justine');
insert into spectacle values (10,'Tounu', 'NIPANTALON', 'F', 'Sandra');
insert into spectacle values (11,'Pamoi', 'PAFAISA', 'F', 'Jenna');