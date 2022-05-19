package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Favorito;
import br.com.rd.queroserdev.devcars.model.Veiculo;

public class FavoritoDto {

	private Integer idFavorito;
	private Integer idCliente;
	private List<Veiculo> veiculo;
	
	

//	public FavoritoDto() {
//		this.idFavorito = fav.getCodFavorito();
//		this.idCliente = fav.getCliente().getCodCliente();
//		this.veiculo = new ArrayList<>();
//		this.veiculo.addAll(fav.getVeiculos().stream().map(VeiculoDto::new).collect(Collectors.toList()));;
//	}
	
	
	public Integer getIdFavorito() {
		return idFavorito;
	}



	public Integer getIdCliente() {
		return idCliente;
	}



	public List<Veiculo> getVeiculo() {
		return veiculo;
	}


	public static List<FavoritoDto> converter(List<Favorito> favorito) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
//	this.veiculo.addAll(fav.getVeiculos().stream().map(VeiculoCardDto::new).collect(Collectors.toList()));

	
	
}
