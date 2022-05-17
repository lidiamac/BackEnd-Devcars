package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public class DestaquesDTO {
	private Integer codVeiculo;
	private BigDecimal precoVeiculo;
	private String modeloVeiculo;
	private String nomeMarca;
	private Integer anoVeiculo;
	private String cor;
	private String motor;
	private String potencia;
	private String cambio;
	private String combustivel;
	private String imagem;
	private String descricao;
	
	
	public DestaquesDTO(Veiculo veiculo) {
		this.codVeiculo = veiculo.getCodVeiculo();
		this.precoVeiculo = veiculo.getPrecoVeiculo();
		this.modeloVeiculo = veiculo.getModeloVeiculo();
		this.nomeMarca = veiculo.getMarca().getMarca_veiculo();
		this.anoVeiculo = veiculo.getAnoVeiculo();
		this.cor = veiculo.getCor().getNome_cor();
		this.motor = veiculo.getMotor().getMotorVeiculo();
		this.potencia = veiculo.getMotor().getPotenciaCv();
		this.cambio = veiculo.getCambio().getCambio();
		this.combustivel = veiculo.getCombustivel().getTipo_combustivel();
		this.imagem = veiculo.getImagem();
		this.descricao = veiculo.getDescricao();
	}
	
	
	
	
	public Integer getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(Integer codVeiculo) {
		this.codVeiculo = codVeiculo;
	}

	public BigDecimal getPrecoVeiculo() {
		return precoVeiculo;
	}
	public void setPrecoVeiculo(BigDecimal precoVeiculo) {
		this.precoVeiculo = precoVeiculo;
	}
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public String getNomeMarca() {
		return nomeMarca;
	}
	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}
	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
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
	
	
	
	public static List<DestaquesDTO> converter(List<Veiculo> destaques) {
		return destaques.stream().map(DestaquesDTO::new).collect(Collectors.toList());
	}

	
}
