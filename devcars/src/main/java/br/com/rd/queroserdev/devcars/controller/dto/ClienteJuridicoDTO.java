package br.com.rd.queroserdev.devcars.controller.dto;

import br.com.rd.queroserdev.devcars.model.Cliente;

public class ClienteJuridicoDTO extends ClienteDTO
								implements ITransformDTO{
	private String inscricaoEstadual;  
	private String razaoSocial;
	
	
	
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}



	public Cliente toCliente() {
		return new Cliente(getNumeroDocumento(), getEmailCliente(), getTelefoneCliente(), 
							getSenhaCliente(),inscricaoEstadual, razaoSocial);
		
	}
}
