create schema if not exists usuarios;

create table usuarios.usuario (
    id bigserial primary key,
    nome varchar(100) not null,
    chave varchar(100) not null
);