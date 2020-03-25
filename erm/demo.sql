SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS game_caracter;
DROP TABLE IF EXISTS game_review;
DROP TABLE IF EXISTS game_work;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE game_caracter
(
	cara_id int NOT NULL AUTO_INCREMENT,
	cara_name text NOT NULL,
	cara_overview text,
	cara_image_url text,
	registration_date datetime NOT NULL,
	appearance_work varchar(200),
	PRIMARY KEY (cara_id),
	game_id int NOT NULL
);


CREATE TABLE game_review
(
	review_id int NOT NULL AUTO_INCREMENT,
	review_title varchar(200),
	review text,
	evaluation int,
	PRIMARY KEY (review_id),
	game_id int NOT NULL
);


CREATE TABLE game_work
(
	game_id int NOT NULL AUTO_INCREMENT,
	image_url text,
	story text,
	title varchar(100) NOT NULL,
	release_date date NOT NULL,
	selling_agency varchar(200),
	game_model varchar(200),
	registration_date datetime NOT NULL,
	register_id int NOT NULL,
	PRIMARY KEY (game_id)
);


CREATE TABLE user
(
	user_id int NOT NULL AUTO_INCREMENT,
	user_name varchar(70) NOT NULL,
	master int NOT NULL,
	registration_date datetime NOT NULL,
	password varchar(100) NOT NULL,
	e_mail varchar(255),
	PRIMARY KEY (user_id)
);



