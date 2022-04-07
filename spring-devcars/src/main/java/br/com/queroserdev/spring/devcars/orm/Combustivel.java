package br.com.queroserdev.spring.devcars.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_combustivel")
public class Combustivel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_combustivel;
	
	@Column(nullable = false)
	private String tipo_combustivel;

	public Integer getCod_combustivel() {
		return cod_combustivel;
	}

	public void setCod_combustivel(Integer cod_combustivel) {
		this.cod_combustivel = cod_combustivel;
	}

	public String getTipo_combustivel() {
		return tipo_combustivel;
	}

	public void setTipo_combustivel(String tipo_combustivel) {
		this.tipo_combustivel = tipo_combustivel;
	}

	@Override
	public String toString() {
		return "Combustivel [cod_combustivel=" + cod_combustivel + ", tipo_combustivel=" + tipo_combustivel + "]";
	}
	
	
	
}
