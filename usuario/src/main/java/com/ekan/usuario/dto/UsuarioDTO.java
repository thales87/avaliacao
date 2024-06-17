package com.ekan.usuario.dto;

import com.ekan.usuario.modelo.Usuario;

public class UsuarioDTO {

	private Long id;
	private String nome;
	private String chave;
	
	public static UsuarioDTO converter(Usuario usuario) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setId(usuario.getId());
		usuarioDTO.setNome(usuario.getNome());
		usuarioDTO.setChave(usuario.getChave());
		return usuarioDTO;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	
}
