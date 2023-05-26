show databases;

create database myshop;
use myshop;

create table SampleDTO (field1 text, field2 text, field3 text);
commit;

show tables;
select * from notice;
drop table notice;

create table notice(no int primary key auto_increment, 
title varchar(200),
content varchar(1000),
author varchar(20),
resdate datetime default current_timestamp ,
readcnt int default 0 );

insert into notice(title, content, author) values ("제목1" , "첫번째 공지사항입니다" , "admin");