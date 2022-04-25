package br.com.rd.queroserdev.spring.devcars.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.rd.queroserdev.spring.devcars.orm.Cartao;
import br.com.rd.queroserdev.spring.devcars.orm.Cliente;
import br.com.rd.queroserdev.spring.devcars.orm.Endereco;
import br.com.rd.queroserdev.spring.devcars.repository.CartaoRepository;
import br.com.rd.queroserdev.spring.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.spring.devcars.repository.EnderecoRepository;


@Service
public class ClienteService {

	private Boolean continuar = true;

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	CartaoRepository cartaoRepository;
	
	@Autowired
	EnderecoRepository enderecoRepository;


	

	public void iniciar(Scanner sc) throws ParseException {
		int acao;

		while (continuar) {
			System.out.println("QUAL MÉTODO DESEJA EXECUTAR EM CLIENTE?");
			System.out.println("0 - Sair");
			System.out.println("1 - INSERIR NOVO");
			System.out.println("2 - LISTAR CARTÕES");
			System.out.println("3 - LISTAR ENDEREÇOS");
			System.out.println("4 - ALTERAR DADOS DE UM CLIENTE");

			acao = sc.nextInt();

			switch (acao) {
			case 1:
				salvarCliente(sc);
				break;
			case 2:
				listarCartoes(sc);
				break;
			case 3:
				listarEnderecos(sc);
				break;
			case 5:
				alterarCliente(sc);
				break;
			default:
				continuar = false;
				break;
			}
		}
	}

	public void salvarCliente(Scanner sc) throws ParseException {
		System.out.println("Que tipo de cliente deseja cadastrar?");
		System.out.println("1 - PF");
		System.out.println("2 - PJ");

		int escolha = sc.nextInt();

		if (escolha == 1) {
			Cliente cliente = new Cliente();
			cliente.setTipoDocumento("CPF");

			System.out.println("Digite o nome do cliente");
			String nome = sc.nextLine();

			System.out.println("Digite o CPF do cliente");
			String cpf = sc.nextLine();

			System.out.println("Digite a data de nascimento do cliente (yyyy/MM/dd)");
			String data = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
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

			cliente.setSenhaCliente(criptografar(senha));
			
			
			this.clienteRepository.save(cliente);
			

		} else {
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
			cliente.setRazaoSocial(nome);
			cliente.setNumeroDocumento(cnpj);
			cliente.setEmailCliente(email);
			cliente.setTelefoneCliente(telefone);
			cliente.setSenhaCliente(criptografar(senha));
			cliente.setInscricaoEstadual(inscEstadual);

			this.clienteRepository.save(cliente);
			sc.next();
		}

		System.out.println("CLIENTE CADASTRADO!");

	}

	

	public List<Cartao> listarCartoes(Scanner sc) {

		System.out.println("INFORME O ID DO CLIENTE, PARA LISTARMOS OS CARTOES CADASTRADOS POR ELE : ");
		int id = sc.nextInt();
		System.out.println("");

		
//		System.out.println(" Aqui esta os Cartoes cadastrados de : "  + "Pedro Jose" );
//		System.out.println("44657******* 23");
//		System.out.println(cartaoRepository.count());
		
		
//		List<Cartao> cartoes = this.cartaoRepository.findAll();
//		cartoes.forEach(c -> System.out.println(c));		

		return this.cartaoRepository.findAll();
	}
	
	
	

	public void listarEnderecos(Scanner sc){
		
		List<Cliente> clientes = this.clienteRepository.findAll();
		clientes.forEach(c -> System.out.println(c));
		
		
		System.out.println("INFORME O ID DO CLIENTE: ");
		int id = sc.nextInt();
		
		List<Endereco> enderecos = this.enderecoRepository.findAllByCliente(id);
		enderecos.forEach(end -> System.out.println(end));
	}

	
	
	
	
	
	public void alterarCliente(Scanner sc){
		
	}
	



	
	public String criptografar (String senha) {
		String criptografada = BCrypt.withDefaults().hashToString(10, senha.toCharArray());
		return criptografada;
	}
	
	
}
