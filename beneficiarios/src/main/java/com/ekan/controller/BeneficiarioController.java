package com.ekan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ekan.dto.BeneficiarioDTO;
import com.ekan.services.BeneficiarioService;

@RestController
public class BeneficiarioController {

	@Autowired
	private BeneficiarioService beneficiarioService;
	
	@GetMapping("/beneficiarios")
	public List<BeneficiarioDTO> listarBeneficiarios() {
		List<BeneficiarioDTO> beneficiarios = beneficiarioService.listarTodos();
		return beneficiarios;
	}
	
	@GetMapping("/beneficiarios/{id}")
	public BeneficiarioDTO buscarBeneficiario(@PathVariable Long id) {
		BeneficiarioDTO beneficiario = beneficiarioService.buscarPorId(id);
		return beneficiario;
	}
	
	//Usar PUT para atualizacao total e patch para atualizacao parcial
	@PostMapping("/beneficiarios")
	public BeneficiarioDTO salvarBeneficiario(@RequestBody BeneficiarioDTO beneficiarioDTO) {
		return beneficiarioService.salvar(beneficiarioDTO);
	}
	
	@DeleteMapping("beneficiarios/{id}")
	public BeneficiarioDTO remover(@PathVariable Long id) {
		return beneficiarioService.remover(id);
	}
	
	
}
