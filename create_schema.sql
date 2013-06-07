drop table interet if exists cascade;
drop table geek if exists cascade;
drop sequence geek_seq if exists;
drop sequence interet_seq if exists;

create table geek (
	id numeric not null,
	pseudo varchar(255) not null,
	nom varchar(255) not null,
	prenom varchar(255) not null,
	sexe varchar(1) not null,
	nbvus numeric default 0,
	primary key (id)
);

create table interet (
	id numeric not null,
	id_geek numeric not null,
	libelle varchar(255) not null,
	primary key (id),
	foreign key (id_geek) references geek(id)
);

create sequence geek_seq start with 1000;
create sequence interet_seq start with 1000;

insert into geek values (1,'Balckangel', 'VALLIN', 'Jeremy', 'H', 100);
insert into geek values (2,'Rafoufoun', 'PANOYAN', 'Rafi', 'H', 0);
insert into geek values (3,'SebLaChaude', 'CHANAL', 'Sebastien', 'H', 0);
insert into geek values (4,'Bibiche', 'PEREAU', 'Clara', 'F', 0);
insert into geek values (5,'Loulou', 'DUPONTAI', 'Louise', 'F', 0);
insert into geek values (6,'Robert', 'SAIRIEN', 'Jean', 'H', 0);
insert into geek values (7,'Boobs', 'BAR', 'Leny', 'H', 0);
insert into geek values (8,'Doremi', 'DEAU', 'Remy', 'H', 0);
insert into geek values (9,'Juju', 'DUFRANC', 'Justine', 'F', 0);
insert into geek values (10,'Tounu', 'NIPANTALON', 'Sandra', 'F', 0);
insert into geek values (11,'Pamoi', 'PAFAISA', 'Jenna', 'F', 0);
insert into geek values('12', 'Acrepet', 'CREPET', 'Agnes', 'F', 100);
insert into geek values('13', 'Cexbrayat', 'EXBRAYAT', 'Cedric', 'H', 100);
insert into geek values('14', 'Clacote', 'LACOTE', 'Cyril', 'H', 100);
insert into geek values('15', 'Jnizet', 'NIZET', 'JeanBaptiste', 'H', 100);

insert into interet values (1, 1, 'JAVA');
insert into interet values (2, 1, 'JUnit');
insert into interet values (3, 2, 'HTML');
insert into interet values (4, 2, 'CSS');
insert into interet values (5, 2, 'PHP');
insert into interet values (6, 2, 'JS');
insert into interet values (7, 3, 'JUnit');
insert into interet values (8, 3, 'C#');
insert into interet values (9, 4, 'HTML');
insert into interet values (10, 4, 'CSS');
insert into interet values (11, 5, 'PHP');
insert into interet values (12, 5, 'JS');
insert into interet values (13, 5, 'JUnit');
insert into interet values (14, 6, 'C');
insert into interet values (15, 6, 'C++');
insert into interet values (16, 6, 'Mockito');
insert into interet values (17, 7, 'C');
insert into interet values (18, 8, 'HTML');
insert into interet values (19, 8, 'CSS');
insert into interet values (20, 9, 'JS');
insert into interet values (21, 9, 'JUnit');
insert into interet values (22, 10, 'C');
insert into interet values (23, 10, 'C++');
insert into interet values (24, 11, 'JUnit');
insert into interet values (25, 11, 'Mockito');
insert into interet values (26, 12, 'C#');
insert into interet values (27, 12, 'HTML');
insert into interet values (28, 13, 'CSS');
insert into interet values (29, 13, 'PHP');
insert into interet values (30, 14, 'JS');
insert into interet values (31, 14, 'JUnit');
insert into interet values (32, 15, 'C');
insert into interet values (33, 15, 'C++');
insert into interet values (34, 15, 'Mockito');