package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public class VeiculoModalDto {
	
	private Integer codVeiculo;
	
	private String marcaVeiculo;
	
	private String modeloVeiculo;
	private Integer anoVeiculo;
	private BigDecimal precoVeiculo;
	
	private String cor;
	private String motor;
	private String potencia;
	private String cambio;
	private String combustivel;
	
	private String imagem;
	private String descricao;
	
	
	
	public VeiculoModalDto (Veiculo veiculo) {
		this.codVeiculo = veiculo.getCodVeiculo();
		
		this.marcaVeiculo = veiculo.getMarca().getMarca_veiculo();
		
		this.modeloVeiculo = veiculo.getModeloVeiculo();
		this.anoVeiculo = veiculo.getAnoVeiculo();
		this.precoVeiculo = veiculo.getPrecoVeiculo();
		
		this.cor =  veiculo.getCor().getNome_cor();
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

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}

	public BigDecimal getPrecoVeiculo() {
		return precoVeiculo;
	}

	public String getImagem() {
		return imagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCor() {
		return cor;
	}

	public String getMotor() {
		return motor;
	}

	public String getPotencia() {
		return potencia;
	}

	public String getCambio() {
		return cambio;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public static List<VeiculoModalDto> converter(List<Veiculo> veiculos) {
		return veiculos.stream().map(VeiculoModalDto::new).collect(Collectors.toList());
	}

}
