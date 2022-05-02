package br.com.rd.queroserdev.devcars.controller.form;

import javax.validation.constraints.NotNull;

import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.ModalidadeCartao;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.ModalidadeCartaoRepository;

public class CartaoForm {

	
//	private Cliente cliente;
	@NotNull
	private Integer codCliente;
	
	
//	private ModalidadeCartao modalidadeCartao;
	@NotNull
	private Integer codModalidade;

	
	@NotNull
	private String nomeTitular;
	
	@NotNull
	private String numeroCartao;
	
	@NotNull
	private String validadeCartao;
	
	@NotNull
	private String cvv;

	
	
	
//	public Cliente getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
	
	public Integer getCodCliente() {
		return codCliente;
	}
	
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
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

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	
	
	

	public Cartao converter(ClienteRepository clienteRepository, ModalidadeCartaoRepository modalidadeCartaoRepository) {
		
		Cliente cliente = clienteRepository.getById(codCliente);
		ModalidadeCartao modalidadeCartao = modalidadeCartaoRepository.findByCodModalidadeCartao(codModalidade);

		return new Cartao(cliente, modalidadeCartao, cvv, nomeTitular, numeroCartao, validadeCartao);
	}
	
}
