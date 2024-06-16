create schema if not exists documentos;

create table documentos.documento (
    id bigserial primary key,
    tipo_documento varchar(25) not null,
    descricao varchar(100) not null,
    data_inclusao timestamp not null,
    data_atualizacao timestamp not null
);