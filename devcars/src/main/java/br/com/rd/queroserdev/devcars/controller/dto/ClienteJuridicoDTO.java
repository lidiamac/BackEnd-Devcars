package br.com.rd.queroserdev.devcars.controller.dto;

import br.com.rd.queroserdev.devcars.model.Cliente;

public class ClienteJuridicoDTO {


	private String inscricaoEstadual;
	private String razaoSocial;
	private String tipoDocumento;
	private String numeroDocumento;
	private String emailCliente;
	private String telefoneCliente;
	

	
	
	public ClienteJuridicoDTO(Cliente cliente) {
		super();
		this.inscricaoEstadual = cliente.getInscricaoEstadual();
		this.razaoSocial = cliente.getRazaoSocial();
		this.tipoDocumento = cliente.getTipoDocumento();
		this.numeroDocumento = cliente.getNumeroDocumento();
		this.emailCliente = cliente.getEmailCliente();
		this.telefoneCliente = cliente.getTelefoneCliente();
	}




	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public String getEmailCliente() {
		return emailCliente;
	}


	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	
	
	

	




}
