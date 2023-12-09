drop schema if exists stamp_market;
create schema stamp_market;
use stamp_market;

create table user(
    id int auto_increment primary key,
    username varchar(32)
);

create table stamporder(
    id int auto_increment primary key,
    userid int, 
    tradedate varchar(32),
    stampid int,
    amount int
);

insert into user values (1, 'tom'), (2, 'jerry');
