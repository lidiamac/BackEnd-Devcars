package br.com.queroserdev.spring.devcars.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
//	@OneToMany
//	@JoinColumn(name = "cod_cartao", nullable = false)
//	private List<Cartao> cartoes;
	
	public ModalidadeCartao() {
	
	}

	

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
	public String toString() {
		return "ModalidadeCartao [codModalidadeCartao=" + codModalidadeCartao + ", descricaoModalidadeCartao="
				+ descricaoModalidadeCartao + "]";
	}
	
}
