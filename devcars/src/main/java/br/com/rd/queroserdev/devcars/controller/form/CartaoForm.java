package br.com.rd.queroserdev.devcars.controller.form;

import javax.validation.constraints.NotNull;

import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.ModalidadeCartao;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.ModalidadeCartaoRepository;

public class CartaoForm {

	
	@NotNull
	private Integer codModalidadeCartao;

	@NotNull
	private Integer codCliente;

	@NotNull
	private String nomeTitular;
	
	@NotNull
	private String numeroCartao;

	@NotNull
	private String validadeCartao;
	
	@NotNull
	private String cvv;
	
	

	public Integer getCodModalidadeCartao() {
		return codModalidadeCartao;
	}

	public void setCodModalidadeCartao(Integer codModalidadeCartao) {
		this.codModalidadeCartao = codModalidadeCartao;
	}
	
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





	public Cartao converter(ClienteRepository clienteRepository, ModalidadeCartaoRepository modalidadeRepository) {
		Cliente cliente = clienteRepository.findByCodCliente(codCliente);
		ModalidadeCartao modalidade = modalidadeRepository.findByCodModalidadeCartao(codModalidadeCartao);
		
		return new Cartao(cliente, modalidade, nomeTitular, numeroCartao, validadeCartao, cvv);
	}
	

	
}
