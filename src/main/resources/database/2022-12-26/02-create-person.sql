--liquibase formatted sql
--changeset jaceknowak:2

create table person
(
    id bigint auto_increment primary key,
    name varchar(255) null,
    last_name varchar(255) null,
    date_of_death date null,
    age varchar(255) null,
    admin_grave_id bigint not null,
    constraint person_grave_id_fk
        foreign key (admin_grave_id) references grave (id)
);