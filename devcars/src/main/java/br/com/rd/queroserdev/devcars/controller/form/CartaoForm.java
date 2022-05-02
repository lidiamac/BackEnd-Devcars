package br.com.rd.queroserdev.devcars.controller.form;

import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.ModalidadeCartao;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.ModalidadeCartaoRepository;

public class CartaoForm {

//	private String nomeCliente;

	private Cliente cliente;
	private Integer codCliente;

	private String descricaoModalidade;
	private String nomeTitular;
	private String numeroCartao;
	private String validadeCartao;
	private String cvv;

//	public String getNomeCliente() {
//		return nomeCliente;
//	}
//	public void setNomeCliente(String nomeCliente) {
//		this.nomeCliente = nomeCliente;
//	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public Cartao converter(ClienteRepository clienteRepository, ModalidadeCartaoRepository modalidadeCartaoRepository) {
		Cliente cliente = clienteRepository.getById(getCodCliente());
		ModalidadeCartao modalidadeCartao = modalidadeCartaoRepository.findByDescricaoModalidadeCartao(descricaoModalidade);

		return new Cartao(cliente, modalidadeCartao, nomeTitular, numeroCartao, validadeCartao, cvv);
	}
}
