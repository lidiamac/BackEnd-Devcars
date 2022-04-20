package br.com.rd.queroserdev.spring.devcars.orm;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_item_nf")
public class ItemNF {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_iten_nf;

	@Column(name = "preco_veiculo", nullable = false)
	private BigDecimal precoVeiculo;

	@Column(name = "percentual_icms", nullable = false)
	private BigDecimal percentualIcms;

	@Column(name = "valor_icms", nullable = false)
	private BigDecimal valorIcms;

	@ManyToOne
	@JoinColumn(name = "cod_nota", nullable = false)
	private CabecalhoNF cabecalhonf;

	public Integer getCod_iten_nf() {
		return cod_iten_nf;
	}

	public void setCod_iten_nf(Integer cod_iten_nf) {
		this.cod_iten_nf = cod_iten_nf;
	}


	public BigDecimal getPrecoVeiculo() {
		return precoVeiculo;
	}

	public void setPrecoVeiculo(BigDecimal precoVeiculo) {
		this.precoVeiculo = precoVeiculo;
	}

	public BigDecimal getPercentualIcms() {
		return percentualIcms;
	}

	public void setPercentualIcms(BigDecimal percentualIcms) {
		this.percentualIcms = percentualIcms;
	}

	public BigDecimal getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(BigDecimal valorIcms) {
		this.valorIcms = valorIcms;
	}

	public CabecalhoNF getCabecalhonf() {
		return cabecalhonf;
	}

	public void setCabecalhonf(CabecalhoNF cabecalhonf) {
		this.cabecalhonf = cabecalhonf;
	}

	@Override
	public String toString() {
		return "CabecalhoNF [cod_iten_nf=" + cod_iten_nf + ", precoVeiculo=" + precoVeiculo
				+ ", percentualIcms=" + percentualIcms + ", valorIcms=" + valorIcms + ", cabecalhonf=" + cabecalhonf
				+ "]";
	}

}
