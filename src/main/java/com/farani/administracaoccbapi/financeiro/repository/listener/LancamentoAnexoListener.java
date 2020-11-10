package com.farani.administracaoccbapi.financeiro.repository.listener;

import javax.persistence.PostLoad;

import org.springframework.util.StringUtils;

import com.farani.administracaoccbapi.AdministracaoccbApiApplication;
import com.farani.administracaoccbapi.storage.S3;
import com.farani.administracaoccbapi.financeiro.model.Lancamento;

public class LancamentoAnexoListener {
	
	@PostLoad
	public void postLoad(Lancamento lancamento) {
		if (StringUtils.hasText(lancamento.getAnexo())) {
			S3 s3 = AdministracaoccbApiApplication.getBean(S3.class);
			lancamento.setUrlAnexo(s3.configurarUrl(lancamento.getAnexo()));
		}
	}

}
