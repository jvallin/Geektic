drop table geek if exists cascade;
drop table interet if exists cascade;
drop table association if exists cascade;
drop sequence geek_seq if exists;
drop sequence interet_seq if exists;

create table geek (
	id numeric not null,
	pseudo varchar(255) unique not null,
	nom varchar(255) not null,
	prenom varchar(255) not null,
	sexe varchar(255) not null,
	inscription date not null,
	primary key (id)
);

create table interet (
	id numeric not null,
	libelle varchar(255) not null,
	primary key (id)
);

create table association (
	id_geek numeric not null,
	id_ci numeric not null,
	primary key (id_geek, id_ci),
	foreign key (id_geek) references geek(id),	
	foreign key (id_ci) references interet(id)
);

create sequence geek_seq start with 100;
create sequence interet_seq start with 100;

insert into geek values (1,'Balckangel', 'VALLIN', 'Jeremy', 'M', to_date('23-04-2013', 'DD-MM-YYYY'));
insert into geek values (2,'Rafoufoun', 'PANOYAN', 'Rafi', 'M', to_date('24-04-2013', 'DD-MM-YYYY'));
insert into geek values (3,'SebLaChaude', 'CHANAL', 'Sebastien', 'M', to_date('25-04-2013', 'DD-MM-YYYY'));
insert into geek values (4,'Bibiche', 'PEREAU', 'Clara', 'F', to_date('04-05-2013', 'DD-MM-YYYY'));
insert into geek values (5,'Loulou', 'DUPONTAI', 'Louise', 'F', to_date('09-05-2013', 'DD-MM-YYYY'));
insert into geek values (6,'Robert', 'SAIRIEN', 'Jean', 'M', to_date('12-05-2013', 'DD-MM-YYYY'));
insert into geek values (7,'Boobs', 'BAR', 'Leny', 'M', to_date('13-05-2013', 'DD-MM-YYYY'));
insert into geek values (8,'Doremi', 'DEAU', 'Remy', 'M', to_date('13-05-2013', 'DD-MM-YYYY'));
insert into geek values (9,'Juju', 'DUFRANC', 'Justine', 'F', to_date('13-05-2013', 'DD-MM-YYYY'));
insert into geek values (10,'Tounu', 'NIPANTALON', 'Sandra', 'F', to_date('28-05-2013', 'DD-MM-YYYY'));
insert into geek values (11,'Pamoi', 'PAFAISA', 'Jenna', 'F', to_date('30-05-2013', 'DD-MM-YYYY'));


insert into interet values (1, 'HTML');
insert into interet values (2, 'CSS');
insert into interet values (3, 'PHP');
insert into interet values (4, 'JS');
insert into interet values (5, 'JAVA');
insert into interet values (6, 'C');
insert into interet values (7, 'C++');
insert into interet values (8, 'C#');
insert into interet values (9, 'JUnit');
insert into interet values (10, 'Mockito');


insert into association values (1, 5);
insert into association values (1, 9);
insert into association values (2, 1);
insert into association values (2, 2);
insert into association values (2, 3);
insert into association values (2, 4);
insert into association values (3, 9);
insert into association values (3, 10);
insert into association values (4, 1);
insert into association values (4, 2);
insert into association values (5, 3);
insert into association values (5, 4);
insert into association values (5, 9);
insert into association values (6, 6);
insert into association values (6, 7);
insert into association values (6, 10);
insert into association values (7, 6);
insert into association values (8, 1);
insert into association values (8, 2);
insert into association values (9, 4);
insert into association values (9, 9);
insert into association values (10, 6);
insert into association values (10, 7);
insert into association values (11, 9);
insert into association values (11, 10);