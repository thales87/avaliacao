package com.ekan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekan.dto.BeneficiarioDTO;
import com.ekan.modelo.Beneficiario;
import com.ekan.repository.BeneficiarioRepository;

@Service
public class BeneficiarioService {

	@Autowired
	private BeneficiarioRepository beneficiarioRepository;
	
	public List<BeneficiarioDTO> listarTodos(){
		List<Beneficiario> beneficiarios = beneficiarioRepository.findAll();
		return beneficiarios
				.stream()
				.map(BeneficiarioDTO::converter)
				.toList();
	}
	
	public BeneficiarioDTO buscarPorId(Long id) {
		Optional<Beneficiario> beneficiario = beneficiarioRepository.findById(id);
		if(beneficiario.isPresent()) {
			return BeneficiarioDTO.converter(beneficiario.get());
		}
		return null;
	}
	
	public BeneficiarioDTO salvar(BeneficiarioDTO beneficiarioDTO) {
		Beneficiario beneficiario = beneficiarioRepository.save(Beneficiario.converter(beneficiarioDTO));
		return BeneficiarioDTO.converter(beneficiario);
	}
	
	public BeneficiarioDTO remover(Long id) {
		Optional<Beneficiario> beneficiario = beneficiarioRepository.findById(id);
		if(beneficiario.isPresent()) {
			beneficiarioRepository.delete(beneficiario.get());
		}
		return null;
	}
	
}
