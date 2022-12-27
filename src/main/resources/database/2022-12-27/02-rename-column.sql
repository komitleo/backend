--liquibase formatted sql
--changeset jaceknowak:9

alter table grave change rowNumber rrow_number varchar(255) not null;
alter table grave change graveNumber grave_number varchar(255) not null;
alter table grave change  placeInRow place_in_rrow varchar(255) not null;

alter table person change  lastName last_name varchar(255) null;
alter table person change  dateOfDeath date_of_death date null;
alter table person change  adminGraveId admin_grave_id bigint not null;