package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.ModalidadeCartao;

public class CartaoDTO {
	
//	private String nomeCliente;
	
	private Integer modalidadeCartao;
	private String nomeTitular;
	private String numeroCartao;
	private String validadeCartao;
	private String cvv;
	
	
	public CartaoDTO() {}
	
	
	public CartaoDTO(Cartao cartao) {
		
//		this.nomeCliente = cartao.getCliente().getNomeCliente();
		this.modalidadeCartao = cartao.getCodModalidade().getCodModalidadeCartao();
		this.nomeTitular = cartao.getNomeTitular();
		this.numeroCartao = cartao.getNumeroCartao();
		this.validadeCartao = cartao.getValidadeCartao();
		this.cvv = cartao.getCvv();
	}

//	public String getNomeCliente() {
//		return nomeCliente;
//	}

	public Integer getModalidadeCartao() {
		return modalidadeCartao;
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
	
	
	public List<CartaoDTO> converter(List<Cartao> topicos) {
		return topicos.stream().map(CartaoDTO::new).collect(Collectors.toList());
	}
	
	
}
