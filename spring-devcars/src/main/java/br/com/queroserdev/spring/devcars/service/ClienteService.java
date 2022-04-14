package br.com.queroserdev.spring.devcars.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.queroserdev.spring.devcars.repository.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	private Boolean continuar = true;
	
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	
	public void iniciar(Scanner sc) {
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
//				salvarCliente(sc);
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
	
	
	
//	salvarCliente(){
//				
//	}
	
	
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
