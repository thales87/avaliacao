package com.ekan.dto;

import java.time.LocalDate;

import com.ekan.modelo.Documento;
import com.ekan.modelo.TipoDocumento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DocumentoDTO {

	@NotNull
	private TipoDocumento tipoDocumento;
	
	@NotBlank
	private String descricao;
	
	@NotNull
	private LocalDate dataInclusao;
	
	@NotNull
	private LocalDate dataAtualizacao;
	
	public static DocumentoDTO converter(Documento documento) {
		DocumentoDTO documentoDTO = new DocumentoDTO();
		documentoDTO.setTipoDocumento(documento.getTipoDocumento());
		documentoDTO.setDescricao(documento.getDescricao());
		documentoDTO.setDataInclusao(documento.getDataInclusao());
		documentoDTO.setDataAtualizacao(documento.getDataAtualizacao());
		return documentoDTO;
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
