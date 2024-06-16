package com.ekan.modelo;

import java.time.LocalDate;

import com.ekan.dto.DocumentoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class Documento {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * 
	 * @Column(name="documento_id") private Long id;
	 */
	@Column(name="tipo_documento")
	@Enumerated(EnumType.STRING)
	private TipoDocumento tipoDocumento;
	
	private String descricao;
	
	@Column(name="data_inclusao")
	private LocalDate dataInclusao;
	
	@Column(name="data_atualizacao")
	private LocalDate dataAtualizacao;
	
	public static Documento converter(DocumentoDTO documentoDTO) {
		Documento documento = new Documento();
		//documento.setId(documentoDTO.getId());
		documento.setTipoDocumento(documentoDTO.getTipoDocumento());
		documento.setDescricao(documentoDTO.getDescricao());
		documento.setDataInclusao(documentoDTO.getDataInclusao());
		documento.setDataAtualizacao(documentoDTO.getDataAtualizacao());
		return documento;
	}
	
	/*
	 * public Long getId() { return id; } public void setId(Long id) { this.id = id;
	 * }
	 */
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
}
