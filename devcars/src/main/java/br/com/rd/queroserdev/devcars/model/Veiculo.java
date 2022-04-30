package br.com.rd.queroserdev.devcars.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codVeiculo;
	
	@Column(nullable = false)
	private String modeloVeiculo;
	
	@ManyToOne
	@JoinColumn(name = "cod_marca", nullable = false)
	private Marca marca;
	
	@Column(nullable = false)
	private String numeroChassi;
	
	@Column(nullable = false)
	private Integer anoVeiculo; //No banco está como smallint
	
	@Column(nullable = false)
	private BigDecimal precoVeiculo;
	
	@ManyToOne
	@JoinColumn(name = "cod_cor", nullable = false)
	private Cor cor;
	
	@ManyToOne
	@JoinColumn(name = "cod_motor", nullable = false)
	private Motor motor;
	
	@ManyToOne
	@JoinColumn(name = "cod_combustivel", nullable = false)
	private Combustivel combustivel;
	
	@ManyToOne
	@JoinColumn(name = "cod_cambio", nullable = false)
	private Cambio cambio;
	
	@ManyToOne
	@JoinColumn(name = "cod_fornecedor", nullable = false)
	private Fornecedor fornecedor;
	
	@Column(nullable = false)
	private Boolean estoque;
	
	@Column(nullable = false)
	private Boolean destaque;
	
	@Column(nullable = false)
	private Boolean seAtivo;
	
	@Column(nullable = false)
	private String imagem;
	
	@Column(nullable = false)
	private String descricao;

	public Integer getCodVeiculo() {
		return codVeiculo;
	}

	public void setCodVeiculo(Integer codVeiculo) {
		this.codVeiculo = codVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}

	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	public BigDecimal getPrecoVeiculo() {
		return precoVeiculo;
	}

	public void setPrecoVeiculo(BigDecimal precoVeiculo) {
		this.precoVeiculo = precoVeiculo;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Cambio getCambio() {
		return cambio;
	}

	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Boolean getEstoque() {
		return estoque;
	}

	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}

	public Boolean getDestaque() {
		return destaque;
	}

	public void setDestaque(Boolean destaque) {
		this.destaque = destaque;
	}

	public Boolean getSeAtivo() {
		return seAtivo;
	}

	public void setSeAtivo(Boolean seAtivo) {
		this.seAtivo = seAtivo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
