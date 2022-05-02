package br.com.rd.queroserdev.devcars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cor")
public class Cor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_cor;
	
	@Column(nullable = false)
	private String nome_cor;

	public Integer getCod_cor() {
		return cod_cor;
	}

	public void setCod_cor(Integer cod_cor) {
		this.cod_cor = cod_cor;
	}

	public String getNome_cor() {
		return nome_cor;
	}

	public void setNome_cor(String nome_cor) {
		this.nome_cor = nome_cor;
	}
	
	
}
