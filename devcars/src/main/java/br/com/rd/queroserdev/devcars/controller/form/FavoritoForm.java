package br.com.rd.queroserdev.devcars.controller.form;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.controller.dto.FavoritoDto;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.Favorito;

public class FavoritoForm {

	private Integer codFavorito;
	private Cliente cliente;
	
	
	public Integer getCodFavorito() {
		return codFavorito;
	}
		
	
	public Cliente getCliente() {
		return cliente;
	}
	
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public void setCodFavorito(Integer codFavorito) {
		this.codFavorito = codFavorito;
	}
	
	
	
	

//	public Favorito converter() {
//		return new Favorito(codFavorito,cliente);
//	}
	

//	public Cliente converter() {
//		return new Cliente("CPF",numeroDocumento, nomeCliente, dataNascimento, emailCliente, telefoneCliente, this.encriptar(senhaCliente));
//	}

	
	
}
