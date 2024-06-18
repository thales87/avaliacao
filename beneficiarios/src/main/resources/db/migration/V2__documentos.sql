create table beneficiarios.documento (
    id bigserial primary key,
    beneficiario_id bigint,
    tipo_documento varchar(25) not null,
    descricao varchar(100) not null,
    data_inclusao timestamp not null,
    data_atualizacao timestamp not null,
    constraint fk_beneficiario
    	foreign key(beneficiario_id) 
    		REFERENCES beneficiarios.beneficiario(id)
);