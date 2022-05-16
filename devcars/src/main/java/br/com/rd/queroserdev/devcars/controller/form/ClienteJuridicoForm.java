package br.com.rd.queroserdev.devcars.controller.form;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.rd.queroserdev.devcars.model.Cliente;

public class ClienteJuridicoForm {
	
	private String numeroDocumento;
	private String razaoSocial;
	private String inscricaoEstadual;
	private String emailCliente;
	private String telefoneCliente;
	private String senhaCliente;
	
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial.toUpperCase();
	}
	
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento.replace("-", "").replace(".", "");
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
		this.telefoneCliente = telefoneCliente.replace("-", "").replace("(", "").replace(")", "");
	}
	
	
	public String getSenhaCliente() {
		return senhaCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = this.encriptar(senhaCliente);
	}
	
	
	public Cliente converter() {
		return new Cliente("CNPJ", numeroDocumento, emailCliente, telefoneCliente, senhaCliente, inscricaoEstadual, razaoSocial);
	}
	
	
	public String encriptar(String senha) {
		String criptografada = BCrypt.withDefaults().hashToString(10, senha.toCharArray());
		return criptografada;
	}
	
}
