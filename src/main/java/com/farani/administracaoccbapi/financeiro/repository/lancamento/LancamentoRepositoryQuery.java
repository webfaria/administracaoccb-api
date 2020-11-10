package com.farani.administracaoccbapi.financeiro.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.farani.administracaoccbapi.dto.LancamentoEstatisticaCategoria;
import com.farani.administracaoccbapi.dto.LancamentoEstatisticaDia;
import com.farani.administracaoccbapi.dto.LancamentoEstatisticaPessoa;
import com.farani.administracaoccbapi.financeiro.model.Lancamento;
import com.farani.administracaoccbapi.financeiro.repository.filter.LancamentoFilter;
import com.farani.administracaoccbapi.financeiro.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public List<LancamentoEstatisticaPessoa> porPessoa(LocalDate inicio, LocalDate fim);
	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	public List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
 