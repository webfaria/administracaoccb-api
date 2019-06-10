package com.farani.administracaoccbapi.financeiro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farani.administracaoccbapi.financeiro.model.Lancamento;
import com.farani.administracaoccbapi.financeiro.model.Pessoa;
import com.farani.administracaoccbapi.financeiro.repository.LancamentoRepository;
import com.farani.administracaoccbapi.financeiro.repository.PessoaRepository;
import com.farani.administracaoccbapi.financeiro.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
		if (!pessoa.isPresent() || pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}

}
