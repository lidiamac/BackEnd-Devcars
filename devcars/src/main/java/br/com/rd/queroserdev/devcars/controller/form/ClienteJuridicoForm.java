package br.com.rd.queroserdev.devcars.controller.form;


import br.com.rd.queroserdev.devcars.model.Cliente;

public class ClienteJuridicoForm {
	
	private String numeroDocumento;
	private String razaoSocial;
	private String inscricaoEstadual;
	private String emailCliente;
	private String telefoneCliente;
	private String senhaCliente;
	
	
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getSenhaCliente() {
		return senhaCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	public Cliente converter() {
		return new Cliente("CNPJ",numeroDocumento, razaoSocial, inscricaoEstadual, emailCliente, telefoneCliente, senhaCliente);
	}
	
}
