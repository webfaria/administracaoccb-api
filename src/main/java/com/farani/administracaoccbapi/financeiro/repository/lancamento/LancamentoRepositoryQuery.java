package com.farani.administracaoccbapi.financeiro.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.farani.administracaoccbapi.financeiro.model.Lancamento;
import com.farani.administracaoccbapi.financeiro.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
 