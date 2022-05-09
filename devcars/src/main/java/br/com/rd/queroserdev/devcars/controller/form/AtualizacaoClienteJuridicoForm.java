package br.com.rd.queroserdev.devcars.controller.form;

import javax.validation.constraints.NotNull;

import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;

public class AtualizacaoClienteJuridicoForm {

	@NotNull
	private String razaoSocial;

	@NotNull
	private String inscricaoEstadual;

	@NotNull
	private String emailCliente;

	@NotNull
	private String telefoneCliente;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial.toUpperCase();
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setIncricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
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

	public Cliente atualizar(Integer id, ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.getById(id);
		cliente.setRazaoSocial(razaoSocial);
		cliente.setInscricaoEstadual(inscricaoEstadual);
		cliente.setEmailCliente(emailCliente);
		cliente.setTelefoneCliente(telefoneCliente);

		return cliente;
	}
}
