package br.com.rd.queroserdev.devcars.controller.dto;

import br.com.rd.queroserdev.devcars.model.Cliente;

public class AlterarSenhaDTO {
	private String senhaCliente;
	

	public AlterarSenhaDTO(Cliente cliente) {
		this.senhaCliente = cliente.getSenhaCliente();
	}
	
	
	
	public String getSenhaCliente() {
		return senhaCliente;
	}

	
	
}
