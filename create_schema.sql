drop table spectacle if exists cascade;
drop sequence spectacle_seq if exists;
drop sequence representation_seq if exists;

create table geek (
	id numeric not null,
	pseudo varchar(255) not null,
	nom varchar(255) not null,
	prenom varchar(255) not null,
	sexe varchar(1) not null,
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

insert into geek values (1,'Balckangel', 'VALLIN', 'Jeremy', 'M');
insert into geek values (2,'Rafoufoun', 'PANOYAN', 'Rafi', 'M');
insert into geek values (3,'SebLaChaude', 'CHANAL', 'Sebastien', 'M');
insert into geek values (4,'Bibiche', 'PEREAU', 'Clara', 'F');
insert into geek values (5,'Loulou', 'DUPONTAI', 'Louise', 'F');
insert into geek values (6,'Robert', 'SAIRIEN', 'Jean', 'M');
insert into geek values (7,'Boobs', 'BAR', 'Leny', 'M');
insert into geek values (8,'Doremi', 'DEAU', 'Remy', 'M');
insert into geek values (9,'Juju', 'DUFRANC', 'Justine', 'F');
insert into geek values (10,'Tounu', 'NIPANTALON', 'Sandra', 'F');
insert into geek values (11,'Pamoi', 'PAFAISA', 'Jenna', 'F');