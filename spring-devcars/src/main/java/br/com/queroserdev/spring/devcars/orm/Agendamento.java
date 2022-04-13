package br.com.queroserdev.spring.devcars.orm;

import java.math.BigDecimal;
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
@Table(name="tb_agendamento")
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_agendamento", nullable = false)
	private Integer codAgendamento;
	
	@OneToMany
	@JoinColumn(name = "cod_veiculo", nullable = false)
	private Veiculo veiculo;
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente", nullable = false)
	private Cliente cliente;
	
	@Column(name="data_reserva", nullable = false)
	private Date dataReserva;
	
	@Column(name="taxa_agendamento" , nullable = false)
	private BigDecimal taxaAgendamento;
	
	@ManyToOne
	@JoinColumn(name = "cod_forma_pagamento", nullable = false)
	private FormaPagamento formaPagamento;
	
	@ManyToOne
	@JoinColumn(name = "cod_cartao", nullable = true)
	private Cartao cartao;
	
	@ManyToOne
	@JoinColumn(name = "cod_boleto", nullable = true)
	private Boleto boleto;
	
	@ManyToOne
	@JoinColumn(name = "cod_pix", nullable = true)
	private Pix pix;
	
	
	
	
	public Agendamento() {
		super();
	}
	
	
	
	public Integer getCodAgendamento() {
		return codAgendamento;
	}
	
	public void setCodAgendamento(Integer codAgendamento) {
		this.codAgendamento = codAgendamento;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	
	public BigDecimal getTaxaAgendamento() {
		return taxaAgendamento;
	}
	
	public void setTaxaAgendamento(BigDecimal taxaAgendamento) {
		this.taxaAgendamento = taxaAgendamento;
	}
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public Cartao getCartao() {
		return cartao;
	}
	
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	public Boleto getBoleto() {
		return boleto;
	}
	
	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	
	public Pix getPix() {
		return pix;
	}
	
	public void setPix(Pix pix) {
		this.pix = pix;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Agendamento [codAgendamento=" + this.getCodAgendamento() + ", Veículo: " + this.getVeiculo() + 
				"Cliente: " + this.getCliente() + ", dataReserva=" + this.getDataReserva() + 
				", taxaAgendamento=" + this.getTaxaAgendamento() + ", FormaPagamento: " + this.getFormaPagamento() +
				", Cartao: " + this.getCartao() + ", Boleto: " + this.getBoleto() +
				", Pix: " + this.getPix() +
				"]";
	}	
}
