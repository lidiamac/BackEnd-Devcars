package br.com.rd.queroserdev.devcars.controller.form;

import java.util.Optional;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;

public class AlterarSenhaForm {
	
	private String senhaCliente;
	
	public AlterarSenhaForm() {}
	

	public AlterarSenhaForm(Cliente cliente) {
		this.senhaCliente = cliente.getSenhaCliente();
	}


	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}




	public Cliente converter(Integer id, ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.getById(id);
		cliente.setSenhaCliente(encriptar(senhaCliente));
		return cliente;
	}

	
	public String encriptar(String senha) {
		String criptografada = BCrypt.withDefaults().hashToString(10, senha.toCharArray());
		return criptografada;
	}
	
}
