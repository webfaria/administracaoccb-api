package com.farani.administracaoccbapi.financeiro.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farani.administracaoccbapi.financeiro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);

	public List<Usuario> findByPermissoesDescricao(String permissaoDescricao);

}