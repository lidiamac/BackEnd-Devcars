package br.com.queroserdev.spring.devcars.orm;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_frete")
public class Frete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_frete;
			
	@Column(name="unidade_federetiva", nullable = false)
	private String unidadeFederetiva;
	
	@Column(name="valor_frete", nullable = false)
	private BigDecimal valorFrete;
	
//	@OneToMany(mappedBy = "frete")
//	private List<Pedido> pedidos;
//	
//	@OneToMany(mappedBy = "frete")
//	private List<CabecalhoNF> cabecalhos;
//
//	
	
	
	public Frete() {
		super();
	}
	
	
	
	

	public Integer getCod_frete() {
		return cod_frete;
	}

	public void setCod_frete(Integer cod_frete) {
		this.cod_frete = cod_frete;
	}

	public String getUnidadeFederetiva() {
		return unidadeFederetiva;
	}

	public void setUnidadeFederetiva(String unidadeFederetiva) {
		this.unidadeFederetiva = unidadeFederetiva;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

//	public List<Pedido> getPedidos() {
//		return pedidos;
//	}
//
//	public void setPedidos(List<Pedido> pedidos) {
//		this.pedidos = pedidos;
//	}
//
//	public List<CabecalhoNF> getCabecalhos() {
//		return cabecalhos;
//	}
//
//	public void setCabecalhos(List<CabecalhoNF> cabecalhos) {
//		this.cabecalhos = cabecalhos;
//	}

	
	
	@Override
	public String toString() {
		return "Frete [cod_frete=" + cod_frete + ", unidadeFederetiva=" + unidadeFederetiva + ", valorFrete="
				+ valorFrete + "]";
	}
	
}
