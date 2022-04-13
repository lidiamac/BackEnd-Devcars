package br.com.queroserdev.spring.devcars.orm;

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
@Table(name = "tb_cabecalho_nf")
public class CabecalhoNF {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codNota;
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "cod_loja", nullable = false)
	private Loja loja;
	
	@ManyToOne
	@JoinColumn(name = "cod_natureza_operacao", nullable = false)
	private NaturezaOperacao naturezaOperacao ;
	
	@Column(name="numero_nota", nullable = false)
	private String numeroNota;
	
	@Column(name="chave_acesso", nullable = false)
	private String chaveAcesso;
	
	@Column(name="numero_serie", nullable = false)
	private String numeroSerie;
	
	@Column(name="valor_total_nf", nullable = false)
	private BigDecimal valorTotalNF;
	
	@Column(name="data_emissao_nf", nullable = false)
	private Date dataEmissaoNF;
	
	@OneToOne
	@JoinColumn(name = "cod_pedido", nullable = false)
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "cod_frete", nullable = false)
	private Frete frete;
	
	
	
	public CabecalhoNF () {
		
	}
	
	
	
	
	public Integer getCodNota() {
		return codNota;
	}
	
	public void setCodNota(Integer codNota) {
		this.codNota = codNota;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Loja getLoja() {
		return loja;
	}
	
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	public NaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}
	
	public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}
	
	public String getNumeroNota() {
		return numeroNota;
	}
	
	public void setNumeroNota(String numeroNota) {
		this.numeroNota = numeroNota;
	}
	
	public String getChaveAcesso() {
		return chaveAcesso;
	}
	
	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}
	
	public String getNumeroSerie() {
		return numeroSerie;
	}
	
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	public BigDecimal getValorTotalNF() {
		return valorTotalNF;
	}
	
	public void setValorTotalNF(BigDecimal valorTotalNF) {
		this.valorTotalNF = valorTotalNF;
	}
	
	public Date getDataEmissaoNF() {
		return dataEmissaoNF;
	}
	
	public void setDataEmissaoNF(Date dataEmissaoNF) {
		this.dataEmissaoNF = dataEmissaoNF;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public Frete getFrete() {
		return frete;
	}
	
	public void setFrete(Frete frete) {
		this.frete = frete;
	}




	@Override
	public String toString() {
		return "CabecalhoNF [codNota=" + codNota + ", cliente=" + cliente + ", loja=" + loja + ", numeroNota="
				+ numeroNota + ", chaveAcesso=" + chaveAcesso + ", numeroSerie=" + numeroSerie + ", valorTotalNF="
				+ valorTotalNF + ", dataEmissaoNF=" + dataEmissaoNF + ", pedido=" + pedido + ", frete=" + frete + "]";
	}
	
	
}
