
//package br.com.rd.queroserdev.spring.devcars.service;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Optional;
//import java.util.Scanner;
//
//import org.springframework.stereotype.Service;
//
//import br.com.rd.queroserdev.spring.devcars.orm.Agendamento;
//import br.com.rd.queroserdev.spring.devcars.orm.Cartao;
//import br.com.rd.queroserdev.spring.devcars.orm.ModalidadeCartao;
//import br.com.rd.queroserdev.spring.devcars.repository.AgendamentoRepository;
//import br.com.rd.queroserdev.spring.devcars.repository.ModalidadeCartaoRepository;
//
//@Service
//public class AgendamentoService {
//
//	private Boolean continuar = true;
//
//	private final AgendamentoRepository agendamentoRepository;
//
//	public AgendamentoService(AgendamentoRepository agendamentoRepository) {
//		this.agendamentoRepository = agendamentoRepository;
//	}
//
//	public void iniciar(Scanner sc) throws ParseException {
//		int acao;
//
//		while (continuar) {
//			System.out.println("Qual método deseja executar em agendamento?");
//			System.out.println("0 - Sair");
//			System.out.println("1 - Inserir Novo Agendamento");
//			System.out.println("2 - Buscar Agendamento por Nome de Cliente");
//			System.out.println("3 - Buscar Agendamento por Data de Reserva");
//			System.out.println("4 - Buscar Agendamento por Modelo de Veículo");
//
//
//			acao = sc.nextInt();
//
//			switch (acao) {
//			case 1:
//				criarAgendamento(sc);
//				break;
//			case 2:
//				buscarPorNome(sc);
//				break;
//			case 3:
//				buscarPorData(sc);
//				break;
//			case 4:
//				buscarPorModelo(sc);
//				break;
//			default:
//				continuar = false;
//				break;
//			}
//		}
//	}
//
//	private void buscarPorModelo(Scanner sc) {
//		// TODO Auto-generated method stub
//
//	}
//
//	private void buscarPorData(Scanner sc) {
//		// TODO Auto-generated method stub
//
//	}
//
//	private void buscarPorNome(Scanner sc) {
//		// TODO Auto-generated method stub
//
//	}
//
//	private void criarAgendamento(Scanner sc) {
//		
//		Agendamento agendamento = new Agendamento();
//		
//		System.out.println("Digite o nome do cliente: ");
//		String nome = sc.nextLine();
//		
//		System.out.println("Digite o modelo do veículo a ser agendado: ");
//		String modeloVeiculo = sc.nextLine();
//		
//		System.out.println("Digite a data da sua reserva: Ex:(yyyy/MM/dd)");
//		String data = sc.nextLine();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy/MM/dd");
//		Date dataReserva = sdf.parse(data);
//		
//		System.out.println("Digite o valor da taxa de agendamento: ");
//		String taxa = sc.nextLine();
//		
//		System.out.println("Qual será a forma de pagamento? ");
//		System.out.println("1 - Cartão ");
//		System.out.println("2 - Boleto ");
//		System.out.println("3 - Pix    ");
//		
//		int escolha = sc.nextInt();
//		
//		if (escolha == 1) {
//			System.out.println("O Pagamento será na função crédito ou débito? ");
//			System.out.println("1 - Crédito ");
//			System.out.println("2 - Débito  ");
//			
//			int escolhaPagamento = sc.nextInt();
//			
//			if (escolhaPagamento == 1) {
//				
//				Cartao cartao = new Cartao();
//				
//				System.out.println("Você escolheu a função crédito! ");
//				
//				System.out.println("Digite o Nome do Titular do Cartão: ");
//				String nomeTitular = sc.nextLine();
//				
//				System.out.println("Digite o número do cartão: ");
//				String numeroCartao = sc.nextLine();
//				
//				System.out.println("Digite a validade do cartão: Ex:MM/yy");
//				String validadeCartao = sc.nextLine();
//				
//				System.out.println("Digite a Chave de Segurança: (Ela se encontra no verso do seu cartão.)");
//				String cvv = sc.nextLine();
//				
//				cartao.setNomeTitular(nomeTitular);
//				cartao.setNumeroCartao(numeroCartao);
//				cartao.setValidadeCartao(validadeCartao);
//				cartao.setCvv(cvv);
//				
////				ModalidadeCartaoRepository modalidadeCartaoRepository;
////				Optional<ModalidadeCartao> modalidade = modalidadeCartaoRepository.findById(escolhaPagamento);
////				cartao.setCodModalidade(modalidade.get());
//				
//				
//				
//			}
//		}
//		
//		System.out.println("Digite a senha do cliente");
//		String senha = sc.nextLine();
//		
//		

//package br.com.rd.queroserdev.spring.devcars.service;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//import java.util.Scanner;
//
//import org.springframework.stereotype.Service;
//
//import br.com.queroserdev.spring.devcars.repository.ClienteRepository;
//import br.com.rd.queroserdev.spring.devcars.orm.Agendamento;
//import br.com.rd.queroserdev.spring.devcars.orm.Cartao;
//import br.com.rd.queroserdev.spring.devcars.orm.Cliente;
//import br.com.rd.queroserdev.spring.devcars.orm.ModalidadeCartao;
//import br.com.rd.queroserdev.spring.devcars.repository.AgendamentoRepository;
//import br.com.rd.queroserdev.spring.devcars.repository.CartaoRepository;
//import br.com.rd.queroserdev.spring.devcars.repository.ModalidadeCartaoRepository;
//
//@Service
//public class AgendamentoService {
//
//	private Boolean continuar = true;
//
//	private final AgendamentoRepository agendamentoRepository;
//	private final CartaoRepository cartaoRepository;
//	private final ModalidadeCartaoRepository modalidadeCartaoRepository;
//	private final ClienteRepository clienteRepository;
//
//	public AgendamentoService(AgendamentoRepository agendamentoRepository, CartaoRepository cartaoRepository,
//			ModalidadeCartaoRepository modalidadeCartaoRepository, ClienteRepository clienteRepository) {
//		this.agendamentoRepository = agendamentoRepository;
//		this.cartaoRepository = cartaoRepository;
//		this.modalidadeCartaoRepository = modalidadeCartaoRepository;
//		this.clienteRepository = clienteRepository;
//	}
//
//	public void iniciar(Scanner sc) throws ParseException {
//		int acao;
//
//		while (continuar) {
//			System.out.println("Qual método deseja executar em agendamento?");
//			System.out.println("0 - Sair");
//			System.out.println("1 - Inserir Novo Agendamento");
//			System.out.println("2 - Buscar Agendamento por Nome de Cliente");
//			System.out.println("3 - Buscar Agendamento por Data de Reserva");
//			System.out.println("4 - Buscar Agendamento por Modelo de Veículo");
//
//			acao = sc.nextInt();
//
//			switch (acao) {
//			case 1:
//				criarAgendamento(sc);
//				break;
//			case 2:
//				buscarPorNome(sc);
//				break;
//			case 3:
//				buscarPorData(sc);
//				break;
//			case 4:
//				buscarPorModelo(sc);
//				break;
//			default:
//				continuar = false;
//				break;
//			}
//		}
//	}
//
//	private void buscarPorModelo(Scanner sc) {
//		// TODO Auto-generated method stub
//
//	}
//
//	private void buscarPorData(Scanner sc) {
//		// TODO Auto-generated method stub
//
//	}
//
//	private void buscarPorNome(Scanner sc) {
		// TODO Auto-generated method stub

//	}
	
//	public List<Agendamento> buscarPorNome(Scanner sc) {
//
//		List<Cliente> clientes = this.clienteRepository.findAll();
//		clientes.forEach(c -> System.out.println(c));
//
//		System.out.println("INFORME O ID DO CLIENTE: ");
//		int id = sc.nextInt();
//
//		return this.clienteRepository.findAllByCliente(id);
//	}

//	private void criarAgendamento(Scanner sc) {
//
//		Agendamento agendamento = new Agendamento();
//
//		System.out.println("Digite o id do cliente: ");
//		Integer idCliente = Integer.parseInt(sc.nextLine());
//
//		System.out.println("Digite o modelo do veículo a ser agendado: ");
//		String modeloVeiculo = sc.nextLine();
//
//		System.out.println("Digite a data da sua reserva: Ex:(yyyy/MM/dd)");
//		String data = sc.nextLine();
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		Date dataReserva = sdf.parse(data);
//
//		System.out.println("Digite o valor da taxa de agendamento: ");
//		String taxa = sc.nextLine();
//
//		System.out.println("Qual será a forma de pagamento? ");
//		System.out.println("1 - Cartão ");
//		System.out.println("2 - Boleto ");
//		System.out.println("3 - Pix    ");
//
//		int escolhaP = sc.nextInt();
//
//		if (escolhaP == 1) {
//			System.out.println("Você escolheu Cartão!");
//			System.out.println("1 - Cadastrar um novo cartão.");
//			System.out.println("2 - Listar seus cartões cadastrados.");
//
//			int escolhaCartao = sc.nextInt();
//
//			if (escolhaCartao == 1) {
//				System.out.println("O Cadastro de Cartão será na função crédito ou débito? ");
//				System.out.println("1 - Crédito ");
//				System.out.println("2 - Débito  ");
//
//				int escolhaCadastro = sc.nextInt();
//
//				if (escolhaCadastro == 1) {
//
//					Cartao cartao = new Cartao();
//
//					System.out.println("Você escolheu a função crédito! ");
//
//					System.out.println("Digite o Nome do Titular do Cartão: ");
//					String nomeTitular = sc.nextLine();
//
//					System.out.println("Digite o número do cartão: ");
//					String numeroCartao = sc.nextLine();
//
//					System.out.println("Digite a validade do cartão: Ex:MM/yy");
//					String validadeCartao = sc.nextLine();
//
//					System.out.println("Digite a Chave de Segurança: (Ela se encontra no verso do seu cartão.)");
//					String cvv = sc.nextLine();
//
//					cartao.setNomeTitular(nomeTitular);
//					cartao.setNumeroCartao(numeroCartao);
//					cartao.setValidadeCartao(validadeCartao);
//					cartao.setCvv(cvv);
//
//					Optional<ModalidadeCartao> modalidade = modalidadeCartaoRepository.findById(escolhaCadastro);
//					cartao.setCodModalidade(modalidade.get());
//
//				} else if (escolhaCadastro == 2) {
//
//					Cartao cartao = new Cartao();
//
//					System.out.println("Você escolheu a função débito! ");
//
//					System.out.println("Digite o Nome do Titular do Cartão: ");
//					String nomeTitular = sc.nextLine();
//
//					System.out.println("Digite o número do cartão: ");
//					String numeroCartao = sc.nextLine();
//
//					System.out.println("Digite a validade do cartão: Ex:MM/yy");
//					String validadeCartao = sc.nextLine();
//
//					System.out.println("Digite a Chave de Segurança: (Ela se encontra no verso do seu cartão.)");
//					String cvv = sc.nextLine();
//
//					cartao.setNomeTitular(nomeTitular);
//					cartao.setNumeroCartao(numeroCartao);
//					cartao.setValidadeCartao(validadeCartao);
//					cartao.setCvv(cvv);
//					Optional<ModalidadeCartao> modalidade = modalidadeCartaoRepository.findById(escolhaCadastro);
//					cartao.setCodModalidade(modalidade.get());
//
//				}
//
//			} else if (escolhaP == 2) {
//
////				cartaoRepository.findByCliente(idCliente);
////				System.out.println("Digite o código do cartão que deseja utilizar: ");
////				int codCartao = sc.nextInt();
//				
//				Optional<Cliente> cliente = clienteRepository.findById(idCliente);
//				
//				List<Cartao> cartoes = new ArrayList<>();
//				
//				cartoes.forEach(c -> System.out::println(f))
//				
//				
//			}
//		}
//
////		System.out.println("Digite a senha do cliente");
////		String senha = sc.nextLine();
////
//>>>>>>> 3c4050012b534f7d58700d69bfea9e0d81998bb7
////		cliente.setNomeCliente(nome);
////		cliente.setNumeroDocumento(cpf);
////		cliente.setDataNascimento(dataNasc);
////		cliente.setEmailCliente(email);
////		cliente.setTelefoneCliente(telefone);
////		cliente.setSenhaCliente(senha);
//<<<<<<< HEAD
////		
////		
////		this.clienteRepository.save(cliente);
////
////	}
////
////}

////
////		this.clienteRepository.save(cliente);
//		
//		Optional<Cliente> cliente = clienteRepository.findById(idCliente);
//		agendamento.setCliente(cliente.get()); 
//		
//		agendamento.setCliente(nome);
//		agendamento.setVeiculo();
//		agendamento.setDataReserva(data);
//		agendamento.setTaxaAgendamento();
//		agendamento.setFormaPagamento();
//		
//		this.agendamentoRepository.save(agendamento);
//
//	}
//
//}

