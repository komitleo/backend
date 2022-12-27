--liquibase formatted sql
--changeset jaceknowak:6

alter table person
    modify column grave_number varchar(255)