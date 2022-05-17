package br.com.rd.queroserdev.devcars.controller.dto;

import br.com.rd.queroserdev.devcars.model.Cartao;

public class CadastrarCartaoDTO {
	
	private Integer codCartao;
	private String nomeTitular;
	private String numeroCartao;
	private String validadeCartao;
	private String cvv;
	
	public CadastrarCartaoDTO(Cartao cartao) {
		this.codCartao = cartao.getCodCartao();
		this.nomeTitular = cartao.getNomeTitular();
		this.numeroCartao = cartao.getNumeroCartao();
		this.validadeCartao = cartao.getValidadeCartao();
		this.cvv = cartao.getCvv();
	}
	
	public Integer getCodCartao() {
		return codCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public String getValidadeCartao() {
		return validadeCartao;
	}
	public String getCvv() {
		return cvv;
	}
	
	
}
