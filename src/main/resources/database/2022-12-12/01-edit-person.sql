--liquibase formatted sql
--changeset jaceknowak:7

alter table person drop column grave_id;