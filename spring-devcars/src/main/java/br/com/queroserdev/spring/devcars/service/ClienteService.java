package br.com.queroserdev.spring.devcars.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.queroserdev.spring.devcars.orm.Cliente;
import br.com.queroserdev.spring.devcars.repository.ClienteRepository;


@Service
public class ClienteService {  
	private final ClienteRepository clienteRepository;
	private Boolean sistema = true;
	
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	private void listagemCartoes() { // Metodo Listagem de cartões 
		Iterable<Cliente> clientes = clienteRepository.findAll();
		clientes.forEach(cliente -> System.out.println(cliente));
	}
	                              
	
	private void altDadosCliente(Scanner sc) { // Método que altera dados do cliente
		int id;
		String descricao;
		
		System.out.println("Informe o Id do registro a ser atualizado");
		id = sc.nextInt();
		
		System.out.println("Informe a nova descrição para o Cargo");
		descricao = sc.next();
		
		Cliente cliente = new Cliente();
	//	cliente.setId(id);
	//	cliente.setDescricao(descricao);
		
		clienteRepository.save(cliente);
		
		System.out.println("Cargo Atualizado com Sucesso");

	}

	
	
	
	
	
	
	
	
}
