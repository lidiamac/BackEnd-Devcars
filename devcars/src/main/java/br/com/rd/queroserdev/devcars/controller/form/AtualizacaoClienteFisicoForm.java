package br.com.rd.queroserdev.devcars.controller.form;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotNull;

import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;

public class AtualizacaoClienteFisicoForm {
	
	@NotNull
	private String nomeCliente;
	
	@NotNull
	private LocalDate dataNascimento;
	
	@NotNull
	private String emailCliente;
	
	@NotNull
	private String telefoneCliente;
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente.toUpperCase();
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
	
	
	
	
	public Cliente atualizar(Integer id, ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.getById(id);
		cliente.setNomeCliente(nomeCliente);
		cliente.setDataNascimento(dataNascimento);
		cliente.setEmailCliente(emailCliente);
		cliente.setTelefoneCliente(telefoneCliente);
		
		return cliente;
	}
}
