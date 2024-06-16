create schema if not exists beneficiarios;

create table beneficiarios.beneficiario (
    id bigserial primary key,
    nome varchar(100) not null,
    telefone varchar(100) not null,
    data_nascimento timestamp not null,
    data_inclusao timestamp not null,
    data_atualizacao timestamp not null
);

create table beneficiarios.documento (
    beneficiario_id bigserial references beneficiarios.beneficiario(id),
    tipo_documento varchar(25) not null,
    descricao varchar(100) not null,
    data_inclusao timestamp not null,
    data_atualizacao timestamp not null
);