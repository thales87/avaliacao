package com.ekan.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ekan.usuario.dto.UsuarioDTO;
import com.ekan.usuario.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/usuario")
	public UsuarioDTO salvarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		return usuarioService.salvar(usuarioDTO);
	}
	
	@GetMapping("/usuario/{id}")
	public UsuarioDTO obterPorId(@PathVariable Long id) {
		return usuarioService.buscarPorId(id);
	}
	
	@GetMapping("/usuario/chave/{chave}")
	public UsuarioDTO obterPorId(@PathVariable String chave) {
		return usuarioService.buscarPorChave(chave);
	}
}
