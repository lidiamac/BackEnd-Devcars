package br.com.rd.queroserdev.devcars.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@Column(nullable = false)
	private BigDecimal valorTotalPedido;
	
	@Column(nullable = false)
	private LocalDateTime dataPedido = LocalDateTime.now();
	
	@Column
	private Integer previsaoEntrega;
	
	@Column
	private LocalDate dataEnvio;
	
	@ManyToOne
	@JoinColumn(name="cod_status", nullable = false)
	private Status status;
	

	public Pedido() {
	}

	public Pedido(Cliente cliente, Veiculo veiculo, Endereco endereco, FormaPagamento formaPagamento, Frete frete,
			BigDecimal valorTotalPedido, Status status) {
		super();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.endereco = endereco;
		this.formaPagamento = formaPagamento;
		this.frete = frete;
		this.valorTotalPedido = valorTotalPedido;
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPedido == null) ? 0 : codPedido.hashCode());
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
		Pedido other = (Pedido) obj;
		if (codPedido == null) {
			if (other.codPedido != null)
				return false;
		} else if (!codPedido.equals(other.codPedido))
			return false;
		return true;
	}

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

	public void setValorTotalPedido(BigDecimal valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
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
	
}
