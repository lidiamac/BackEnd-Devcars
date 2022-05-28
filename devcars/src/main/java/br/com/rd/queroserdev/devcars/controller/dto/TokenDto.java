package br.com.rd.queroserdev.devcars.controller.dto;

import br.com.rd.queroserdev.devcars.model.Cliente;

public class TokenDto {

	private String token;
	private String tipo;
	
	private Integer id;
	private String nome;
	

	public TokenDto(String token, String tipo, Cliente cliente) {
		this.token = token;
		this.tipo = tipo;
		this.id = cliente.getCodCliente();
		this.nome = cliente.getNomeCliente();
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
