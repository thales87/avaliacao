package com.ekan.usuario.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekan.usuario.dto.UsuarioDTO;
import com.ekan.usuario.modelo.Usuario;
import com.ekan.usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioDTO buscarPorId(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if(usuario.isPresent()) {
			return UsuarioDTO.converter(usuario.get());
		}
		return null;
	}
	
	public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
		usuarioDTO.setChave(UUID.randomUUID().toString());
		Usuario usuario = usuarioRepository.save(Usuario.converter(usuarioDTO));
		return UsuarioDTO.converter(usuario);
	}
	
	public UsuarioDTO buscarPorChave(String chave) {
		Usuario usuario = usuarioRepository.findByChave(chave);
		if(usuario != null) {
			return UsuarioDTO.converter(usuario);
		}
		return null;
	}
	
}
