package com.ekan.modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.ekan.dto.BeneficiarioDTO;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Beneficiario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "documento", joinColumns = @JoinColumn(name = "beneficiario_id"))
	private List<Documento> documentos;
	
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
		beneficiario.setDocumentos(beneficiarioDTO
				.getDocumentos()
				.stream()
				.map(Documento::converter)
				.collect(Collectors.toList()));
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

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

}
