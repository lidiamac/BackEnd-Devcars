package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.Date;

import br.com.rd.queroserdev.devcars.model.Cliente;

public class ClienteDTO {

	private String nomeCliente;
	private Date dataNascimento;

	private String inscricaoEstadual;
	private String razaoSocial;

//	private String tipoDocumento;
	private String numeroDocumento;
	private String emailCliente;
	private String telefoneCliente;
	private String senhaCliente;

	public ClienteDTO(Cliente cliente) {

		if (cliente.getNumeroDocumento().length() == 11) {
			this.nomeCliente = cliente.getNomeCliente();
			this.dataNascimento = cliente.getDataNascimento();
//			this.tipoDocumento = cliente.getTipoDocumento();
			this.numeroDocumento = cliente.getNumeroDocumento();
			this.emailCliente = cliente.getEmailCliente();
			this.telefoneCliente = cliente.getTelefoneCliente();
			this.senhaCliente = cliente.getSenhaCliente();
			System.out.println("Cliente Físico OK");
		} else {
			this.inscricaoEstadual = cliente.getInscricaoEstadual();
			this.razaoSocial = cliente.getRazaoSocial();
//			this.tipoDocumento = cliente.getTipoDocumento();
			this.numeroDocumento = cliente.getNumeroDocumento();
			this.emailCliente = cliente.getEmailCliente();
			this.telefoneCliente = cliente.getTelefoneCliente();
			this.senhaCliente = cliente.getSenhaCliente();
			System.out.println("Cliente Jurídico OK");
		}

	}

//	public Cliente toCliente() {
//
//		if (this.getNumeroDocumento().length() == 11) {
//			
//			System.out.println("Método PF");
//			return new Cliente(getNumeroDocumento(), getNomeCliente(), getDataNascimento(), getEmailCliente(),
//					getTelefoneCliente(), getSenhaCliente());
//			
//		} else {
//			System.out.println("Método PJ");
//			return new Cliente(getNumeroDocumento(), getRazaoSocial(), getInscricaoEstadual(), getEmailCliente(),
//				getTelefoneCliente(), getSenhaCliente());
//		}
//
//	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
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

	public String getSenhaCliente() {
		return senhaCliente;
	}

}
