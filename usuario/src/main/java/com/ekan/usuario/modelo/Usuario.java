package com.ekan.usuario.modelo;

import com.ekan.usuario.dto.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String chave;
	
	public static Usuario converter(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setId(usuarioDTO.getId());
		usuario.setNome(usuarioDTO.getNome());
		usuario.setChave(usuarioDTO.getChave());
		return usuario;
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
