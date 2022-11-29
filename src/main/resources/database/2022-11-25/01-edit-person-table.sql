--liquibase formatted sql
--changeset jaceknowak:3

alter table person
    drop column place_in_rrow,
    drop column rrow,
    drop column sector
