package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Cartao;

public class CartaoDTO {
	
	private Integer codCartao;
	private Integer codCliente;
	private String descricaoModalidade;
	private String nomeTitular;
	private String numeroCartao;
	private String validadeCartao;
	
	
	
	public CartaoDTO() {}
	
	
	public CartaoDTO(Cartao cartao) {
		this.codCartao = cartao.getCodCartao();
		this.codCliente = cartao.getCliente().getCodCliente();
		this.descricaoModalidade = cartao.getCodModalidade().getDescricaoModalidadeCartao();
		this.nomeTitular = cartao.getNomeTitular();
		this.numeroCartao = cartao.getNumeroCartao();
		this.validadeCartao = cartao.getValidadeCartao();
	}




	public Integer getCodCartao() {
		return codCartao;
	}

	public void setCodCartao(Integer codCartao) {
		this.codCartao = codCartao;
	}
	
	
	public Integer getCodCliente() {
		return codCliente;
	}


	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}


	public String getDescricaoModalidade() {
		return descricaoModalidade;
	}


	public void setDescricaoModalidade(String descricaoModalidade) {
		this.descricaoModalidade = descricaoModalidade;
	}


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



	
	public List<CartaoDTO> converter(List<Cartao> topicos) {
		return topicos.stream().map(CartaoDTO::new).collect(Collectors.toList());
	}
	
	
}
