--liquibase formatted sql
--changeset jaceknowak:11

alter table grave change rrow_number rowNumber varchar(255) not null;
alter table grave change grave_number graveNumber varchar(255) not null;
alter table grave change place_in_row placeInRow varchar(255) not null;

alter table person change last_name lastName varchar(255) null;
alter table person change date_of_death dateOfDeath date null;