--liquibase formatted sql
--changeset jaceknowak:10

alter table grave change place_in_rrow place_in_row varchar(255) not null;