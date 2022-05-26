package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;

import br.com.rd.queroserdev.devcars.model.Frete;



public class FreteDTO {
	
	private Integer codFrete;
	private String unidadeFederativa;
	private BigDecimal valorFrete;
	
	
	
	public FreteDTO(Frete frete) {
		this.codFrete = frete.getCodFrete();
		this.unidadeFederativa = frete.getUnidadeFederativa();
		this.valorFrete = frete.getValorFrete();
	}

	

	public Integer getCodFrete() {
		return codFrete;
	}
	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}
	public BigDecimal getValorFrete() {
		return valorFrete;
	}
	
	
	
	
}
