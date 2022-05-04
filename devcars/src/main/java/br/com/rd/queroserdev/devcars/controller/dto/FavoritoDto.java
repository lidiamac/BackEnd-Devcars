package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Favorito;

public class FavoritoDto {

	private Integer cliente;
	private Integer codFavorito;
	
	public FavoritoDto(Favorito favorito) {
		this.codFavorito = favorito.getCodFavorito();
		this.cliente = favorito.getCliente().getCodCliente();
		
	}

	public Integer getCodFavorito() {
		return codFavorito;
	}

	

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public static List<FavoritoDto> converter(List<Favorito> favorito) {
		return favorito.stream().map(FavoritoDto::new).collect(Collectors.toList());
	}
	
	
}
