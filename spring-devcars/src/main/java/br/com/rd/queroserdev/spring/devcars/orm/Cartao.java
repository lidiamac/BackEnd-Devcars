package br.com.rd.queroserdev.spring.devcars.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cartao")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codCartao;

	@Column(name="nome_titular", nullable = false)
	private String nomeTitular;

	
	@Column(name="numero_cartao", nullable = false)
	private String numeroCartao;
	
	@Column(name="validade_cartao", nullable = false)
	private String validadeCartao;

	@Column(name="cvv", nullable = false)
	private String cvv;
	
	@ManyToOne
	@JoinColumn(name = "cod_modalidade", nullable = false)
	private ModalidadeCartao codModalidade;
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente", nullable = false)
	private Integer codCliente;
	
	@ManyToMany(mappedBy="cartoes",fetch = FetchType.EAGER)
	private List<Cliente> clientes;
	
	public Cartao() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Integer getCodCartao() {
		return codCartao;
	}




	public void setCodCartao(Integer codCartao) {
		this.codCartao = codCartao;
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




	public ModalidadeCartao getCodModalidade() {
		return codModalidade;
	}




	public void setCodModalidade(ModalidadeCartao codModalidade) {
		this.codModalidade = codModalidade;
	}


	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}




	@Override
	public String toString() {
		return "Cartao [codCartao=" + codCartao + ", nomeTitular=" + nomeTitular + ", numeroCartao=" + numeroCartao
				+ ", validadeCartao=" + validadeCartao + ", cvv=" + cvv + ", codModalidade=" + codModalidade
				+ ", clientes=" + clientes + "]";
	}



	
}
