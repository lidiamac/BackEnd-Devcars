package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public class VeiculoModalDto {
	
	private Integer codVeiculo;
	private String modeloVeiculo;
	private Integer anoVeiculo;
	private BigDecimal precoVeiculo;
	private String imagem;
	private String descricao;
	
	public VeiculoModalDto (Veiculo veiculo) {
		this.codVeiculo = veiculo.getCodVeiculo();
		this.modeloVeiculo = veiculo.getModeloVeiculo();
		this.anoVeiculo = veiculo.getAnoVeiculo();
		this.precoVeiculo = veiculo.getPrecoVeiculo();
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

	public static List<VeiculoModalDto> converter(List<Veiculo> veiculos) {
		return veiculos.stream().map(VeiculoModalDto::new).collect(Collectors.toList());
	}

}
