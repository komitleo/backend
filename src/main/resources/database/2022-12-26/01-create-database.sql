--liquibase formatted sql
--changeset jaceknowak:1

create table grave
(
    id bigint auto_increment primary key,
    rrow_number   varchar(255) not null,
    grave_number  varchar(255) not null,
    place_in_rrow varchar(255) not null,
    sector  varchar(255) not null
);