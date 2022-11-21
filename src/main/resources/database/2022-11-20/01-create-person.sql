--liquibase formatted sql
--changeset jaceknowak:1

create table person(
    id bigint not null auto_increment PRIMARY KEY ,
    name varchar(255) null,
    last_name varchar(255) null,
    rrow varchar(255) null,
    place_in_rrow varchar(255) null,
    sector varchar(255) null,
    date_of_death date null,
    age int null
);