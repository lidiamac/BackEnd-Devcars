package br.com.queroserdev.spring.devcars.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cambio")
public class Cambio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codCambio;
	
	@Column(nullable = false)
	private String cambio;
	
	@OneToMany(mappedBy = "cambio")
	private List<Veiculo> veiculo;

	
	//MÉTDO GETTERS AND SETTERS
	
	public Integer getCodCambio() {
		return codCambio;
	}

	public void setCodCambio(Integer codCambio) {
		this.codCambio = codCambio;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}

	//MÉTDO TOSTRING
	
	@Override
	public String toString() {
		return "Cambio [codCambio=" + this.codCambio + 
				", cambio=" + this.cambio +  
				"]";
	}	
	
}
