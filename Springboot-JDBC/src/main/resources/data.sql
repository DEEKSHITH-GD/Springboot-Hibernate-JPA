create table person(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

Insert into person (id, name, location, birth_date) values(10010, 'Samson', 'Bengaluru', now());
Insert into person (id, name, location, birth_date) values(10011, 'Micheal', 'Hyderabad', now());
Insert into person (id, name, location, birth_date) values(10012, 'Sony', 'Chennai', now());