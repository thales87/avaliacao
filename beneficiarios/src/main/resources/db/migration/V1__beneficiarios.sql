create schema if not exists beneficiarios;

create table beneficiarios.beneficiario (
    id bigserial primary key,
    nome varchar(100) not null,
    telefone varchar(100) not null,
    data_nascimento timestamp not null,
    data_inclusao timestamp not null,
    data_atualizacao timestamp not null
);