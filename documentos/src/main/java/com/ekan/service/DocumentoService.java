package com.ekan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekan.dto.DocumentoDTO;
import com.ekan.modelo.Documento;
import com.ekan.repository.DocumentoRepository;

@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;
	
	public List<DocumentoDTO> listarTodos(){
		List<Documento> documentos = documentoRepository.findAll();
		return documentos
				.stream()
				.map(DocumentoDTO::converter)
				.toList();
	}
	
	public DocumentoDTO buscarPorId(Long id) {
		Optional<Documento> documento = documentoRepository.findById(id);
		if(documento.isPresent()) {
			return DocumentoDTO.converter(documento.get());
		}
		return null;
	}
	
	public DocumentoDTO salvar(DocumentoDTO documentoDTO) {
		Documento documento = documentoRepository.save(Documento.converter(documentoDTO));
		return DocumentoDTO.converter(documento);
	}
	
	public DocumentoDTO remover(Long id) {
		Optional<Documento> documento = documentoRepository.findById(id);
		if(documento.isPresent()) {
			documentoRepository.delete(documento.get());
		}
		return null;
	}
	
}
