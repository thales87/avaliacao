package com.ekan.modelo;

import java.time.LocalDate;

import com.ekan.dto.BeneficiarioDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Beneficiario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	@Column(name = "data_inclusao")
	private LocalDate dataInclusao;
	@Column(name = "data_atualizacao")
	private LocalDate dataAtualizacao;

	public static Beneficiario converter(BeneficiarioDTO beneficiarioDTO) {
		Beneficiario beneficiario = new Beneficiario();
		beneficiario.setId(beneficiarioDTO.getId());
		beneficiario.setNome(beneficiarioDTO.getNome());
		beneficiario.setTelefone(beneficiarioDTO.getTelefone());
		beneficiario.setDataNascimento(beneficiarioDTO.getDataNascimento());
		beneficiario.setDataInclusao(beneficiarioDTO.getDataInclusao());
		beneficiario.setDataAtualizacao(beneficiarioDTO.getDataAtualizacao());
		return beneficiario;
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
