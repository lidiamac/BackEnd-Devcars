package br.com.rd.queroserdev.devcars.controller.form;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.controller.dto.FavoritoDto;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.Favorito;
import br.com.rd.queroserdev.devcars.model.Veiculo;
import br.com.rd.queroserdev.devcars.repository.FavoritoRepository;

public class FavoritoForm {

	private Integer idFavorito;
	private Integer idCliente;
	private Integer idVeiculos;
	
	public Integer getIdFavorito() {
		return idFavorito;
	}
	
	public void setIdFavorito(Integer idFavorito) {
		this.idFavorito = idFavorito;
	}
	
	public Integer getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	public Integer getIdVeiculos() {
		return idVeiculos;
	}
	
	public void setIdVeiculos(Integer idVeiculos) {
		this.idVeiculos = idVeiculos;
	}
	
	
		
	
	
}
