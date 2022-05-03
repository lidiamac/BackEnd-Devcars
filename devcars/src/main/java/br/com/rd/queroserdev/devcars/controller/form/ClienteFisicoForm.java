package br.com.rd.queroserdev.devcars.controller.form;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.service.Encriptar;

public class ClienteFisicoForm {
	private String numeroDocumento;
	private String nomeCliente;
	private LocalDate dataNascimento;
	private String emailCliente;
	private String telefoneCliente;
	private String senhaCliente;
	private Encriptar encriptar;
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
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
		return new Cliente("CPF",numeroDocumento, nomeCliente, dataNascimento, emailCliente, telefoneCliente, this.encriptar(senhaCliente));
	}
	
	
	public String encriptar(String senha) {
		String criptografada = BCrypt.withDefaults().hashToString(10, senha.toCharArray());
		return criptografada;
	}
	
}
