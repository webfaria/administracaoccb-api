package com.farani.administracaoccbapi.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farani.administracaoccbapi.financeiro.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
