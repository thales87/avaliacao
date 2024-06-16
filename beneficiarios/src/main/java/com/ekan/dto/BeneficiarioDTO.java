package com.ekan.dto;

import java.time.LocalDate;

import com.ekan.modelo.Beneficiario;

public class BeneficiarioDTO {

	private Long id;
	private String nome;
	private String telefone;
	private LocalDate dataNascimento;
	private LocalDate dataInclusao;
	private LocalDate dataAtualizacao;

	public static BeneficiarioDTO converter(Beneficiario beneficiario) {
		BeneficiarioDTO beneficiarioDTO = new BeneficiarioDTO();
		beneficiarioDTO.setId(beneficiario.getId());
		beneficiarioDTO.setNome(beneficiario.getNome());
		beneficiarioDTO.setTelefone(beneficiario.getTelefone());
		beneficiarioDTO.setDataNascimento(beneficiario.getDataNascimento());
		beneficiarioDTO.setDataInclusao(beneficiario.getDataInclusao());
		beneficiarioDTO.setDataAtualizacao(beneficiario.getDataAtualizacao());
		return beneficiarioDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
