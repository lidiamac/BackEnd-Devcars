package br.com.rd.queroserdev.devcars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_forma_pagamento")
public class FormaPagamento {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codFormaPagamento;
	
	@Column(nullable = false)
	private String descricaoFormaPagamento;

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
		
}
