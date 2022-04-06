package br.com.queroserdev.spring.devcars.orm;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.queroserdev.spring.devcars.orm.Boleto;
import br.com.queroserdev.spring.devcars.orm.Cartao;
import br.com.queroserdev.spring.devcars.orm.Cliente;
import br.com.queroserdev.spring.devcars.orm.FormaPagamento;
import br.com.queroserdev.spring.devcars.orm.Pix;
import br.com.queroserdev.spring.devcars.orm.Veiculo;


@Entity
@Table(name="tb_agendamento")
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_agendamento")
	private Integer codAgendamento;
	
	@Column
	private Veiculo veiculo;
	
	@Column
	private Cliente cliente;
	
	@Column(name="data_reserva")
	private Date dataReserva;
	
	@Column(name="taxa_agendamento")
	private BigDecimal taxaAgendamento;
	
	@Column
	private FormaPagamento formaPagamento;
	
	@Column
	private Cartao cartao;
	
	@Column
	private Boleto boleto;
	
	@Column
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
