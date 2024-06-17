package com.ekan.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekan.usuario.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Usuario findByChave(String chave);
	
}
