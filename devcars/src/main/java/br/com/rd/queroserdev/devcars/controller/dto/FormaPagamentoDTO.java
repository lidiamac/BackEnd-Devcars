package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.FormaPagamento;

public class FormaPagamentoDTO {
	private Integer codFormaPagamento;
	private String descricaoFormaPagamento;
	
	
	
	public FormaPagamentoDTO(FormaPagamento formaPagamento) {
		this.codFormaPagamento = formaPagamento.getCodFormaPagamento();
		this.descricaoFormaPagamento = formaPagamento.getDescricaoFormaPagamento();
	}
	
	
	
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
	
	
	
	
	public static List<FormaPagamentoDTO> converter(List<FormaPagamento> topicos) {
		return topicos.stream().map(FormaPagamentoDTO::new).collect(Collectors.toList());
	}
	
	
}
