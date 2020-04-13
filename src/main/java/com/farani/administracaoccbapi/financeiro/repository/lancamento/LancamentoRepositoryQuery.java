package com.farani.administracaoccbapi.financeiro.repository.lancamento;

import java.util.List;

import com.farani.administracaoccbapi.financeiro.model.Lancamento;
import com.farani.administracaoccbapi.financeiro.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
