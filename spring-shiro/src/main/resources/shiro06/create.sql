drop database if exists shiro;
create database shiro charset utf8;
use shiro;

create table t_user
(
    id         int primary key auto_increment,
    login_name varchar(200) not null unique,
    password   varchar(200)
) engine = Innodb charset utf8;

create table t_role
(
    id         int primary key auto_increment,
    role_name  varchar(200) not null unique
) engine = Innodb charset utf8;

create table t_permission
(
    id         int primary key auto_increment,
    permission_name  varchar(200) not null unique
) engine = Innodb charset utf8;

create table user_role(
    id int primary key auto_increment,
    user_id int,
    role_id int,
    foreign key (user_id) references  t_user(id),
    foreign key (role_id) references  t_role(id)
) engine = Innodb charset utf8;

create table user_permission(
    id int primary key auto_increment,
    user_id int,
    permission_id int,
    foreign key (user_id) references t_user(id),
    foreign key (permission_id) references t_permission(id)
) engine = Innodb charset utf8;