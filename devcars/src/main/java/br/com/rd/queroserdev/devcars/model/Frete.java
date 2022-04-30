package br.com.rd.queroserdev.devcars.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_frete")
public class Frete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_frete;
			
	@Column(name="unidade_federativa", nullable = false)
	private String unidadeFederativa;
	
	@Column(name="valor_frete", nullable = false)
	private BigDecimal valorFrete;

	public Integer getCod_frete() {
		return cod_frete;
	}

	public void setCod_frete(Integer cod_frete) {
		this.cod_frete = cod_frete;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}
	
}
