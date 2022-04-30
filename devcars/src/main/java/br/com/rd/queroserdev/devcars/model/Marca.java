package br.com.rd.queroserdev.devcars.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_marca;
	
	@Column(nullable = false)
	private String marca_veiculo;
	
	@OneToMany(mappedBy = "marca")
	private List<Veiculo> veiculo;

	public Integer getCod_marca() {
		return cod_marca;
	}

	public void setCod_marca(Integer cod_marca) {
		this.cod_marca = cod_marca;
	}

	public String getMarca_veiculo() {
		return marca_veiculo;
	}

	public void setMarca_veiculo(String marca_veiculo) {
		this.marca_veiculo = marca_veiculo;
	}

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
