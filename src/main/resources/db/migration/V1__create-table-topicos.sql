create table topicos(
    id bigint primary key auto_increment not null,
    titulo varchar(20) not null ,
    mensaje varchar(200) not null ,
    fecha_creacion date not null ,
    status_topico tinyint default 1,
    autor varchar(100) not null ,
    curso varchar(100) not null
)