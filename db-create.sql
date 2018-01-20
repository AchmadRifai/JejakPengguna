create database jejak;
use jejak;
create table pengguna(kode varchar(25)primary key,pass varchar(20)not null,
nama varchar(40)not null,loggedin boolean not null);
create table jejak(pengguna varchar(25)not null,ket text not null,waktu timestamp not null);
alter table jejak add foreign key(pengguna)references pengguna(kode)on update cascade on delete cascade;
