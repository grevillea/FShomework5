drop table if exists t_user;

create table t_user(
    id bigint ,
    userName varchar(50),
    password varchar(50),
    name varchar(50),
    mail varchar(50),
    primary key (id)
);