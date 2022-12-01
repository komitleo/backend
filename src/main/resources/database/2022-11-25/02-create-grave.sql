--liquibase formatted sql
--changeset jaceknowak:4

create table grave (
    id bigint not null auto_increment PRIMARY KEY,
    rrow_number varchar(255) not null,
    grave_number varchar(255) not null,
    place_in_rrow varchar(255) not null,
    sector varchar(255) not null
);
