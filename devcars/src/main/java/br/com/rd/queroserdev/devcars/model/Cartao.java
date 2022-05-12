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
	private ModalidadeCartao modalidadeCartao;
	
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
	
	

	public Cartao( Cliente cliente, ModalidadeCartao modalidadeCartao, String nomeTitular, String numeroCartao,
			String validadeCartao, String cvv) {
		super();
		this.modalidadeCartao = modalidadeCartao;
		this.cliente = cliente;
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
		return modalidadeCartao;
	}

	public void setCodModalidade(ModalidadeCartao codModalidade) {
		this.modalidadeCartao = codModalidade;
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

	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCartao == null) ? 0 : codCartao.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		if (codCartao == null) {
			if (other.codCartao != null)
				return false;
		} else if (!codCartao.equals(other.codCartao))
			return false;
		return true;
	}
	
	
	
}
