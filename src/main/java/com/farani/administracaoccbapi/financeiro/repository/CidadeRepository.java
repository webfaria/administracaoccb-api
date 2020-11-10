package com.farani.administracaoccbapi.financeiro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farani.administracaoccbapi.financeiro.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	List<Cidade> findByEstadoCodigo(Long estadoCodigo);

}