package com.farani.administracaoccbapi.financeiro.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.farani.administracaoccbapi.financeiro.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);
	
}