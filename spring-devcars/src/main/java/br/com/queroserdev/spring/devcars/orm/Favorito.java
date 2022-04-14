package br.com.queroserdev.spring.devcars.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="tb_favorito")
public class Favorito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_favorito", nullable = false)
	private Integer codFavorito;
	
	@Column(name="cod_cliente", nullable = false)
	private Cliente cliente;
	
	
	@ManyToMany
	@JoinTable(
			  name = "tb_favorito_veiculo", 
			  joinColumns = @JoinColumn(name = "cod_favorito"), 
			  inverseJoinColumns = @JoinColumn(name = "cod_veiculo"))
	private List<Veiculo> veiculos;
	
	
	
	public Favorito() {
		
	}



	public Integer getCodFavorito() {
		return codFavorito;
	}

	public void setCodFavorito(Integer codFavorito) {
		this.codFavorito = codFavorito;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}



	@Override
	public String toString() {
		return "Favorito [codFavorito=" + codFavorito + ", cliente=" + cliente + ", veiculos=" + veiculos + "]";
	}
	
}