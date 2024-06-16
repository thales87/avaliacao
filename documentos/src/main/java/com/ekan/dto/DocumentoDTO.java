package com.ekan.dto;

import java.time.LocalDate;

import com.ekan.modelo.Documento;
import com.ekan.modelo.TipoDocumento;

public class DocumentoDTO {

	private Long id;
	private TipoDocumento tipoDocumento;
	private String descricao;
	private LocalDate dataInclusao;
	private LocalDate dataAtualizacao;
	
	public static DocumentoDTO converter(Documento documento) {
		DocumentoDTO documentoDTO = new DocumentoDTO();
		documentoDTO.setId(documento.getId());
		documentoDTO.setTipoDocumento(documento.getTipoDocumento());
		documentoDTO.setDescricao(documento.getDescricao());
		documentoDTO.setDataInclusao(documento.getDataInclusao());
		documentoDTO.setDataAtualizacao(documento.getDataAtualizacao());
		return documentoDTO;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
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
	
}
