drop database if exists shiro;
create database shiro charset utf8;
use shiro;

create table t_user(
    id int primary key auto_increment,
    login_name varchar(200) not null unique ,
    password varchar(200)
)engine=Innodb charset utf8;

insert into t_user(login_name, password) values ("admin","123");
insert into t_user(login_name,password) values ("tom","456");