--liquibase formatted sql
--changeset jaceknowak:5

alter table person
    add column grave_id bigint not null