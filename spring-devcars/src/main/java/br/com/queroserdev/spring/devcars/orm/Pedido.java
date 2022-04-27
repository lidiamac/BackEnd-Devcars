package br.com.queroserdev.spring.devcars.orm;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codPedido;
	
	@ManyToOne
	@JoinColumn(name="cod_cliente", nullable = false)
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name="cod_veiculo", nullable = false)
	private Veiculo veiculo;
	
	@ManyToOne
	@JoinColumn(name="cod_endereco", nullable = false)
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="cod_forma_pagamento", nullable = false)
	private FormaPagamento formaPagamento;
	
	@ManyToOne
	@JoinColumn(name="cod_frete", nullable = false)
	private Frete frete;
	
//	@OneToMany
//	@JoinColumn(name="tb_cabecalho_nf", nullable = false)
//	private CabecalhoNF cabecalhoNf;

	@Column(nullable = false)
	private BigDecimal valorTotalPedido;
	
	@Column(nullable = false)
	private LocalDate dataPedido;
	
	@Column(nullable = false)
	private Integer previsaoEntrega;
	
	@Column(nullable = false)
	private LocalDate dataEnvio;
	
	@ManyToOne
	@JoinColumn(name="cod_status", nullable = false)
	private Status status;
	
	
	
	//MÉTODO GETTERS AND SETTERS

	public Integer getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public BigDecimal getValorTotalPedido() {
		return valorTotalPedido;
	}
	
//	public CabecalhoNF getCabecalhoNf() {
//		return cabecalhoNf;
//	}
//
//	public void setCabecalhoNf(CabecalhoNF cabecalhoNf) {
//		this.cabecalhoNf = cabecalhoNf;
//	}

	public void setValorTotalPedido(BigDecimal valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Integer getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(Integer previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public LocalDate getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(LocalDate dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	//MÉTODO TOSTRING

	@Override
	public String toString() {
		return "Pedido [codPedido=" + this.codPedido + 
				", cliente=" + this.cliente + 
				", veiculo=" + this.veiculo + 
				", endereco=" + this.endereco + 
				", formaPagamento=" + this.formaPagamento + 
				", frete=" + this.frete + 
//				", cabecalhoNf=" + this.cabecalhoNf + 
				", valorTotalPedido=" + this.valorTotalPedido + 
				", dataPedido=" + this.dataPedido + 
				", previsaoEntrega=" + this.previsaoEntrega + 
				", dataEnvio=" + this.dataEnvio + 
				", status=" + this.status + 
				"]";
	}

}
