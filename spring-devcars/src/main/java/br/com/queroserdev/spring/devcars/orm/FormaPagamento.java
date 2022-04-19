package br.com.queroserdev.spring.devcars.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_forma_pagamento")
public class FormaPagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codFormaPagamento;
	
	@Column(nullable = false)
	private String descricaoFormaPagamento;
	
//	@OneToMany(mappedBy = "formaPagamento")
//	private List<Agendamento> agendamento;
//	
//	@OneToMany(mappedBy = "formaPagamento")
//	private List<Pedido> pedido;
	
	//MÉTODO GETTERS AND SETTERS

	public Integer getCodFormaPagamento() {
		return codFormaPagamento;
	}

	public void setCodFormaPagamento(Integer codFormaPagamento) {
		this.codFormaPagamento = codFormaPagamento;
	}

	public String getDescricaoFormaPagamento() {
		return descricaoFormaPagamento;
	}

	public void setDescricaoFormaPagamento(String descricaoFormaPagamento) {
		this.descricaoFormaPagamento = descricaoFormaPagamento;
	}

//	public List<Agendamento> getAgendamento() {
//		return agendamento;
//	}
//
//	public void setAgendamento(List<Agendamento> agendamento) {
//		this.agendamento = agendamento;
//	}
//
//	public List<Pedido> getPedido() {
//		return pedido;
//	}
//
//	public void setPedido(List<Pedido> pedido) {
//		this.pedido = pedido;
//	}

	//MÉTODO TOSTRING
	
	@Override
	public String toString() {
		return "FormaPagamento [codFormaPagamento=" + this.codFormaPagamento + 
				", descricaoFormaPagamento=" + this.descricaoFormaPagamento + 
//				", agendamento=" + this.agendamento + 
//				", pedido=" + this.pedido + 
				"]";
	}
	
}