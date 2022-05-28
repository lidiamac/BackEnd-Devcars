package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Marca;

public class MarcaDTO {
	
	private Integer codMarca;
	private String marcaVeiculo;

	public MarcaDTO(Marca marca) {
		this.codMarca = marca.getCod_marca();
		this.marcaVeiculo = marca.getMarca_veiculo();
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
	
	public Integer getCodMarca() {
		return codMarca;
	}

	public void setCodMarca(Integer codMarca) {
		this.codMarca = codMarca;
	}

	public static List<MarcaDTO> converter(List<Marca> marcas) {
		return marcas.stream().map(MarcaDTO::new).collect(Collectors.toList());
	}
	
	

}
