package com.ekan.dto;

import java.time.LocalDate;

import com.ekan.modelo.Documento;
import com.ekan.modelo.TipoDocumento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentoDTO {

	private Long id;
	
	@NotNull
	private TipoDocumento tipoDocumento;
	
	@NotBlank
	private String descricao;
	
	@NotNull
	private LocalDate dataInclusao;
	
	@NotNull
	private LocalDate dataAtualizacao;
	
	//trocar por algum mecanismo de dto transformation
	public static DocumentoDTO converter(Documento documento) {
		DocumentoDTO documentoDTO = new DocumentoDTO();
		documentoDTO.setId(documento.getId());
		documentoDTO.setTipoDocumento(documento.getTipoDocumento());
		documentoDTO.setDescricao(documento.getDescricao());
		documentoDTO.setDataInclusao(documento.getDataInclusao());
		documentoDTO.setDataAtualizacao(documento.getDataAtualizacao());
		return documentoDTO;
	}
	
}
