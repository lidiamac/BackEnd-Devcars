package br.com.rd.queroserdev.devcars.controller.dto;


import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public class VeiculoDto {
	
	private Integer codVeiculo;
	private String modeloVeiculo;
	private String imagem;
	private String descricao;
	
	public VeiculoDto(Veiculo veiculo) {
		this.codVeiculo = veiculo.getCodVeiculo();
		this.modeloVeiculo = veiculo.getModeloVeiculo();
		this.imagem = veiculo.getImagem();
		this.descricao = veiculo.getDescricao();
	}
	
	
	
	public Integer getCodVeiculo() {
		return codVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public String getImagem() {
		return imagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public static List<VeiculoDto> converter(List<Veiculo> veiculos) {
		return veiculos.stream().map(VeiculoDto::new).collect(Collectors.toList());
	}
	
	
}
