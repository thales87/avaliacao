package com.ekan.modelo;

import java.time.LocalDate;

import com.ekan.dto.DocumentoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="tipo_documento")
	@Enumerated(EnumType.STRING)
	private TipoDocumento tipoDocumento;
	
	private String descricao;
	
	@Column(name="data_inclusao")
	private LocalDate dataInclusao;
	
	@Column(name="data_atualizacao")
	private LocalDate dataAtualizacao;
	
	//trocar por algum mecanismo de dto transformation
	public static Documento converter(DocumentoDTO documentoDTO) {
		Documento documento = new Documento();
		documento.setId(documentoDTO.getId());
		documento.setTipoDocumento(documentoDTO.getTipoDocumento());
		documento.setDescricao(documentoDTO.getDescricao());
		documento.setDataInclusao(documentoDTO.getDataInclusao());
		documento.setDataAtualizacao(documentoDTO.getDataAtualizacao());
		return documento;
	}
	
}
