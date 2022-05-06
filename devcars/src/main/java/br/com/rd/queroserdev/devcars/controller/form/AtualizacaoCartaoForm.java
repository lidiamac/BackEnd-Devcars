package br.com.rd.queroserdev.devcars.controller.form;

import javax.validation.constraints.NotNull;

import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.repository.CartaoRepository;

public class AtualizacaoCartaoForm {
	
//	@NotNull
//	private Integer codModalidadeCartao;

	@NotNull
	private String nomeTitular;
	
	@NotNull
	private String numeroCartao;

	@NotNull
	private String validadeCartao;
	
	
	

//	public Integer getCodModalidadeCartao() {
//		return codModalidadeCartao;
//	}
//
//	public void setCodModalidadeCartao(Integer codModalidadeCartao) {
//		this.codModalidadeCartao = codModalidadeCartao;
//	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	
	
	public Cartao atualizar(Integer id, CartaoRepository cartaoRepository) {
		Cartao cartao = cartaoRepository.getById(id);
		cartao.setNomeTitular(nomeTitular.toUpperCase());
		cartao.setNumeroCartao(numeroCartao);
		cartao.setValidadeCartao(validadeCartao);
		
		return cartao;
	}
	
	
	
	
	
	
}
