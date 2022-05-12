package br.com.rd.queroserdev.devcars.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_modalidade_cartao")
public class ModalidadeCartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_modalidade", nullable = false)
	private Integer codModalidadeCartao;
	
	@Column(name="descricao_modalidade", nullable = false)
	private String descricaoModalidadeCartao;

	public Integer getCodModalidadeCartao() {
		return codModalidadeCartao;
	}

	public void setCodModalidadeCartao(Integer codModalidadeCartao) {
		this.codModalidadeCartao = codModalidadeCartao;
	}

	public String getDescricaoModalidadeCartao() {
		return descricaoModalidadeCartao;
	}

	public void setDescricaoModalidadeCartao(String descricaoModalidadeCartao) {
		this.descricaoModalidadeCartao = descricaoModalidadeCartao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codModalidadeCartao, descricaoModalidadeCartao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModalidadeCartao other = (ModalidadeCartao) obj;
		return Objects.equals(codModalidadeCartao, other.codModalidadeCartao)
				&& Objects.equals(descricaoModalidadeCartao, other.descricaoModalidadeCartao);
	}
	
	
	
	
	
	
}
