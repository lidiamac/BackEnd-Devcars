package br.com.queroserdev.spring.devcars.orm;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cartao")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_cartao", nullable = false)
	private Integer cod_cartao;
	
	
	@OneToMany
	@JoinColumn(name = "cod_modalidade", nullable = false)
	private modalidadeCartao cod_modalidade;
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente", nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "cod_cliente", nullable = false)
	private Cliente cliente;
	
	@Column(name="nome_titular", nullable = false)
	private String nome_titular;
	
	@Column(name="numero_cartao", nullable = false)
	private Integer numero_cartao;
	
	@Column(name="validade_cartao", nullable = false)
	private Date validade_cartao;
	
	@Column(name="cvv", nullable = false)
	private Integer cvv;

	public Integer getCod_cartao() {
		return cod_cartao;
	}

	public void setCod_cartao(Integer cod_cartao) {
		this.cod_cartao = cod_cartao;
	}

	public modalidadeCartao getCod_modalidade() {
		return cod_modalidade;
	}

	public void setCod_modalidade(modalidadeCartao cod_modalidade) {
		this.cod_modalidade = cod_modalidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	public Integer getNumero_cartao() {
		return numero_cartao;
	}

	public void setNumero_cartao(Integer numero_cartao) {
		this.numero_cartao = numero_cartao;
	}

	public Date getValidade_cartao() {
		return validade_cartao;
	}

	public void setValidade_cartao(Date validade_cartao) {
		this.validade_cartao = validade_cartao;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Cartao [cod_cartao=" + cod_cartao + ", cliente=" + cliente + ", nome_titular=" + nome_titular
				+ ", numero_cartao=" + numero_cartao + ", validade_cartao=" + validade_cartao + ", cvv=" + cvv + "]";
	}
	
	
}
