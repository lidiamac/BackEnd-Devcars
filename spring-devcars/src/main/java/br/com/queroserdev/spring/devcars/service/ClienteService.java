package br.com.queroserdev.spring.devcars.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.queroserdev.spring.devcars.orm.Cliente;
import br.com.queroserdev.spring.devcars.repository.ClienteRepository;


@Service
<<<<<<< HEAD
public class ClienteService {  
	private final ClienteRepository clienteRepository;
=======
public class ClienteService {
>>>>>>> 73dc109631a8258c667fc1bca2ba77083d103b3f
	
	private Boolean continuar = true;

	
    @Autowired
	ClienteRepository clienteRepository;
	
	private void listarCartoes() { // Metodo Listagem de cartões 
		Iterable<Cliente> clientes = clienteRepository.findAll();
		clientes.forEach(cliente -> System.out.println(cliente));
	}
	                              

	private void dadosPedido() {// Metodo dadosPedido
		
	}
	
	private void salvarCliente(Scanner sc) { // Método salvarCliente
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

	
	
	
	
	
	
	
	public void iniciar(Scanner sc) throws ParseException {
		int acao;

		while (continuar) {
			System.out.println("QUAL MÉTODO DESEJA EXECUTAR EM CLIENTE?");
			System.out.println("0 - Sair");
			System.out.println("1 - INSERIR NOVO");
			System.out.println("2 - LISTAR CARTÕES");
			System.out.println("3 - LISTAR ENDEREÇOS");
			System.out.println("4 - DADOS DE UM CLIENTE EM UM AGENDAMENTO");
			System.out.println("5 - DADOS DE UM CLIENTE EM UM PEDIDO");
			System.out.println("6 - ALTERAR DADOS DE UM CLIENTE");


			acao = sc.nextInt();

			switch (acao) {
			case 1:
				salvarCliente(sc);
				break;
			case 2:
//				listarCartoes(sc);
				break;
			case 3:
//				listarEnderecos(sc);
				break;
			case 4:
//				dadosAgendamento(sc);
				break;
			case 5:
//				dadosPedido(sc);
				break;
			case 6:
//				alterarCliente(sc);
				break;
			default:
				continuar = false;
				break;
			}
		}
	}
	
	
	
	public void salvarCliente(Scanner sc) throws ParseException{
		System.out.println("Que tipo de cliente deseja cadastrar?");
		System.out.println("1 - PF");
		System.out.println("2 - PJ");
		
		
		int escolha = sc.nextInt();
		
		if(escolha == 1) {
			Cliente cliente = new Cliente();
			cliente.setTipoDocumento("CPF");
			
			System.out.println("Digite o nome do cliente");
			String nome = sc.nextLine();
			
			System.out.println("Digite o CPF do cliente");
			String cpf = sc.nextLine();
			
			System.out.println("Digite a data de nascimento do cliente (yyyy/MM/dd)");
			String data = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat ("yyyy/MM/dd");
			Date dataNasc = sdf.parse(data);
			
			
			System.out.println("Digite email do cliente");
			String email = sc.nextLine();
			
			System.out.println("Digite o telefone do cliente");
			String telefone = sc.nextLine();
			
			System.out.println("Digite a senha do cliente");
			String senha = sc.nextLine();
			
			
			cliente.setNomeCliente(nome);
			cliente.setNumeroDocumento(cpf);
			cliente.setDataNascimento(dataNasc);
			cliente.setEmailCliente(email);
			cliente.setTelefoneCliente(telefone);
			cliente.setSenhaCliente(senha);
			
			
			this.clienteRepository.save(cliente);
			
		} else{
			Cliente cliente = new Cliente();
			cliente.setTipoDocumento("CNPJ");
			
			System.out.println("Digite a razão social do cliente");
			String nome = sc.nextLine();
			
			System.out.println("Digite o CNPJ do cliente");
			String cnpj = sc.nextLine();
			
			System.out.println("Digite email do cliente");
			String email = sc.nextLine();
			
			System.out.println("Digite o telefone do cliente");
			String telefone = sc.nextLine();
			
			System.out.println("Digite a senha do cliente");
			String senha = sc.nextLine();
			
			System.out.println("Digite a inscrição estadual do cliente");
			String inscEstadual = sc.nextLine();
			
			
			cliente.setNomeCliente(nome);
			cliente.setNumeroDocumento(cnpj);
			cliente.setEmailCliente(email);
			cliente.setTelefoneCliente(telefone);
			cliente.setSenhaCliente(senha);
			cliente.setInscricaoEstadual(inscEstadual);
			
			
			
			this.clienteRepository.save(cliente);
		}
		
		
		
		System.out.println("CLIENTE CADASTRADO!");
		
		
	}
	
	
//	listarCartoes(){
//			
//	}
	
	
//	listarEnderecos(){
//		
//	}
	
	
//	dadosAgendamento(){
//		
//	}
	
	
//	dadosPedido(){
//		
//	}
	
	
//	alterarCliente(){
//		
//	}
	
}
