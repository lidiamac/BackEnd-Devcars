package br.com.rd.queroserdev.devcars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_natureza_operacao")
public class NaturezaOperacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_natureza_operacao;
	
	@Column(nullable = false)
	private String descricao_natureza_operacao;

	public Integer getCod_natureza_operacao() {
		return cod_natureza_operacao;
	}

	public void setCod_natureza_operacao(Integer cod_natureza_operacao) {
		this.cod_natureza_operacao = cod_natureza_operacao;
	}

	public String getDescricao_natureza_operacao() {
		return descricao_natureza_operacao;
	}

	public void setDescricao_natureza_operacao(String descricao_natureza_operacao) {
		this.descricao_natureza_operacao = descricao_natureza_operacao;
	}
	
}
