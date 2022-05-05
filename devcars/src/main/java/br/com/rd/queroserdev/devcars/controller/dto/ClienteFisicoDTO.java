package br.com.rd.queroserdev.devcars.controller.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.rd.queroserdev.devcars.model.Cliente;

public class ClienteFisicoDTO {

	private String nomeCliente;
	private LocalDate dataNascimento;
	private String tipoDocumento;
	private String numeroDocumento;
	private String emailCliente;
	private String telefoneCliente;
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public ClienteFisicoDTO(Cliente cliente) {
		super();
		this.dataNascimento = cliente.getDataNascimento();
		this.nomeCliente = cliente.getNomeCliente();
		this.tipoDocumento = cliente.getTipoDocumento();
		this.numeroDocumento = cliente.getNumeroDocumento();
		this.emailCliente = cliente.getEmailCliente();
		this.telefoneCliente = cliente.getTelefoneCliente();
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
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
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



	

}
