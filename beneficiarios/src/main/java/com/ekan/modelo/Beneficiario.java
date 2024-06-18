package com.ekan.modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.ekan.dto.BeneficiarioDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Beneficiario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	
	@OneToMany (fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "beneficiario_id")
	private List<Documento> documentos;
	
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	@Column(name = "data_inclusao")
	private LocalDate dataInclusao;
	@Column(name = "data_atualizacao")
	private LocalDate dataAtualizacao;

	//trocar por algum mecanismo de dto transformation
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

}
