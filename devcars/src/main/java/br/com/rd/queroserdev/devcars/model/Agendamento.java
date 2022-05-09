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
@Table(name="tb_agendamento")
public class Agendamento {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="cod_agendamento", nullable = false)
		private Integer codAgendamento;
		
		@OneToOne
		@JoinColumn(name = "cod_veiculo", nullable = false)
		private Veiculo veiculo;
		
		@ManyToOne
		@JoinColumn(name = "cod_cliente", nullable = false)
		private Cliente cliente;
		
		@Column(name="data_reserva", nullable = false)
		private LocalDate dataReserva;
		
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

		
		public Agendamento() {}

		public Agendamento(Veiculo veiculo, Cliente cliente, BigDecimal taxaAgendamento, FormaPagamento formaPagamento,
				Cartao cartao, Boleto boleto, Pix pix, LocalDate dataReserva) {
			this.veiculo = veiculo;
			this.cliente = cliente;
			this.taxaAgendamento = taxaAgendamento;
			this.formaPagamento = formaPagamento;
			this.cartao = cartao;
			this.boleto = boleto;
			this.pix = pix;
			this.dataReserva = dataReserva;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((codAgendamento == null) ? 0 : codAgendamento.hashCode());
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
			Agendamento other = (Agendamento) obj;
			if (codAgendamento == null) {
				if (other.codAgendamento != null)
					return false;
			} else if (!codAgendamento.equals(other.codAgendamento))
				return false;
			return true;
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

		public LocalDate getDataReserva() {
			return dataReserva;
		}

		public void setDataReserva(LocalDate dataReserva) {
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
				
		
}
