package br.com.rd.queroserdev.devcars.controller.form;

import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.ModalidadeCartao;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.ModalidadeCartaoRepository;

public class CartaoCreditoForm {
	
	private Integer codCliente;
	private String nomeTitular;
	private Integer modalidadeCartao;
	private String numeroCartao;
	private String validadeCartao;
	private String cvv;
	
	public Cartao converter(ModalidadeCartaoRepository modalidadeCartaoRepository, ClienteRepository clienteRepository) {
		ModalidadeCartao modalidade = modalidadeCartaoRepository.findByCodModalidadeCartao(modalidadeCartao);
		Cliente cliente = clienteRepository.findByCodCliente(codCliente);
		
		return new Cartao(cliente, modalidade, nomeTitular, numeroCartao, validadeCartao, cvv);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Integer getModalidadeCartao() {
		return modalidadeCartao;
	}

	public void setModalidadeCartao(Integer modalidadeCartao) {
		this.modalidadeCartao = modalidadeCartao;
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
	
	
}
