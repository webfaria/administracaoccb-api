package com.farani.administracaoccbapi.financeiro.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.farani.administracaoccbapi.financeiro.model.Pessoa;
import com.farani.administracaoccbapi.financeiro.repository.PessoaRepository;

@Service
public class PessoaService {

	private PessoaRepository pessoaRepository;
	
	public PessoaService(PessoaRepository pessoaRepository){
		this.pessoaRepository = pessoaRepository;
	}
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa){
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		return pessoaRepository.save(pessoaSalva);

	}
	
	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);
	}
	
	private Pessoa buscarPessoaPeloCodigo(Long codigo) {
		Optional<Pessoa> pessoaOptional = pessoaRepository.findById(codigo);
		if(pessoaOptional.isPresent()){
			Pessoa pessoaSalva = pessoaOptional.get();
			pessoaRepository.save(pessoaSalva);
			return pessoaSalva;
		}else{
			throw new EmptyResultDataAccessException(1);
		}
	}

}
