package br.com.rd.queroserdev.spring.devcars.dto;

import br.com.rd.queroserdev.spring.devcars.orm.Cliente;


public class RequisicaoClienteJuridico extends RequisicaoCliente{
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
		Cliente cliente = new Cliente();
		cliente.setTipoDocumento("CPF");
		cliente.setNumeroDocumento(getNumeroDocumento()); 
		cliente.setEmailCliente(getEmailCliente());
		cliente.setTelefoneCliente(getTelefoneCliente()); 
		cliente.setSenhaCliente(getSenhaCliente());
		cliente.setInscricaoEstadual(inscricaoEstadual);
		cliente.setRazaoSocial(razaoSocial);
		return cliente;
	}
}
