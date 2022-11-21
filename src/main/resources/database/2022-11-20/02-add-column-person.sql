--liquibase formatted sql
--changeset jaceknowak:2

alter table person
	add grave_number int not null;
