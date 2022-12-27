--liquibase formatted sql
--changeset jaceknowak:7

alter table grave change rrow_number rowNumber varchar(255) not null;
alter table grave change grave_number graveNumber varchar(255) not null;
alter table grave change place_in_rrow placeInRow varchar(255) not null;

alter table person change last_name lastName varchar(255) null;
alter table person change date_of_death dateOfDeath date null;
alter table person change grave_number graveNumber varchar(255) null;
alter table person change admin_grave_id adminGraveId bigint not null;