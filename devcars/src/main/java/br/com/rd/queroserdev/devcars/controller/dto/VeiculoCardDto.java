package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public class VeiculoCardDto {

	private Integer codVeiculo;
	private String Imagem;
	private BigDecimal precoVeiculo;
	private String modeloVeiculo;

	public VeiculoCardDto(Veiculo veiculo) {
		this.codVeiculo = veiculo.getCodVeiculo();
		this.Imagem = veiculo.getImagem();
		this.precoVeiculo = veiculo.getPrecoVeiculo();
		this.modeloVeiculo = veiculo.getModeloVeiculo();
		
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public Integer getCodVeiculo() {
		return codVeiculo;
	}

	public String getImagem() {
		return Imagem;
	}

	public BigDecimal getPrecoVeiculo() {
		return precoVeiculo;
	}

	public static List<VeiculoCardDto> converter(List<Veiculo> marcas) {
		return marcas.stream().map(VeiculoCardDto::new).collect(Collectors.toList());
	}
	
	
}
