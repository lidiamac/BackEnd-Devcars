package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.Date;

import br.com.rd.queroserdev.devcars.model.Cliente;

public class ClienteFisicoDTO {

	private String nomeCliente;
	private Date dataNascimento;
	private String tipoDocumento;
	private String numeroDocumento;
	private String emailCliente;
	private String telefoneCliente;
	
	
	
	public ClienteFisicoDTO(Cliente cliente) {
		super();
		this.dataNascimento = cliente.getDataNascimento();
		this.nomeCliente = cliente.getNomeCliente();
		this.tipoDocumento = cliente.getTelefoneCliente();
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
