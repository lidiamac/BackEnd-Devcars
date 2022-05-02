package br.com.rd.queroserdev.devcars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cartao")
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codCartao;
	
	
	@ManyToOne
	@JoinColumn(name = "cod_modalidade", nullable = false)
	private ModalidadeCartao codModalidade;
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente", nullable = false)
	private Cliente cliente;

		
	@Column(name="nome_titular", nullable = false)
	private String nomeTitular;
	
	@Column(name="numero_cartao", nullable = false)
	private String numeroCartao;
	
	@Column(name="validade_cartao", nullable = false)
	private String validadeCartao;
	
	@Column(name="cvv", nullable = false)
	private String cvv;
	
	
	public Cartao() {}
	
	

	public Cartao(Cliente cliente, ModalidadeCartao codModalidade, String nomeTitular, String numeroCartao,
			String validadeCartao, String cvv) {
		
		this.cliente = cliente;
		this.codModalidade = codModalidade;
		this.nomeTitular = nomeTitular;
		this.numeroCartao = numeroCartao;
		this.validadeCartao = validadeCartao;
		this.cvv = cvv;
		
	}

	public Integer getCodCartao() {
		return codCartao;
	}

	public void setCodCartao(Integer codCartao) {
		this.codCartao = codCartao;
	}

	public ModalidadeCartao getCodModalidade() {
		return codModalidade;
	}

	public void setCodModalidade(ModalidadeCartao codModalidade) {
		this.codModalidade = codModalidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	
	
}
