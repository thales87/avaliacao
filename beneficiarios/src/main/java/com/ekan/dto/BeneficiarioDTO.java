package com.ekan.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.ekan.modelo.Beneficiario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiarioDTO {

	private Long id;
	private String nome;
	private String telefone;
	private List<DocumentoDTO> documentos;
	private LocalDate dataNascimento;
	private LocalDate dataInclusao;
	private LocalDate dataAtualizacao;
	
	//trocar por algum mecanismo de dto transformation
	public static BeneficiarioDTO converter(Beneficiario beneficiario) {
		BeneficiarioDTO beneficiarioDTO = new BeneficiarioDTO();
		beneficiarioDTO.setId(beneficiario.getId());
		beneficiarioDTO.setNome(beneficiario.getNome());
		beneficiarioDTO.setTelefone(beneficiario.getTelefone());
		beneficiarioDTO.setDataNascimento(beneficiario.getDataNascimento());
		beneficiarioDTO.setDataInclusao(beneficiario.getDataInclusao());
		beneficiarioDTO.setDataAtualizacao(beneficiario.getDataAtualizacao());
		beneficiarioDTO.setDocumentos(beneficiario
				.getDocumentos()
				.stream()
				.map(DocumentoDTO::converter)
				.collect(Collectors.toList()));
		return beneficiarioDTO;
	}

}
