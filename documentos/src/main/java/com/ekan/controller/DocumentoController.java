package com.ekan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ekan.dto.DocumentoDTO;
import com.ekan.service.DocumentoService;

@RestController
public class DocumentoController {

	@Autowired
	private DocumentoService documentoService;
	
	@GetMapping("/documentos")
	public List<DocumentoDTO> listarDocumentos() {
		List<DocumentoDTO> documentos = documentoService.listarTodos();
		return documentos;
	}
	
	@GetMapping("/documentos/{id}")
	public DocumentoDTO buscarBeneficiario(@PathVariable Long id) {
		DocumentoDTO documento = documentoService.buscarPorId(id);
		return documento;
	}
	
	@PostMapping("/documentos")
	public DocumentoDTO salvarDocumento(@RequestBody DocumentoDTO documentoDTO) {
		return documentoService.salvar(documentoDTO);
	}
	
	@DeleteMapping("documentos/{id}")
	public DocumentoDTO remover(@PathVariable Long id) {
		return documentoService.remover(id);
	}
	
}
