package br.com.rd.queroserdev.spring.devcars.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.rd.queroserdev.spring.devcars.orm.Cliente;
import br.com.rd.queroserdev.spring.devcars.orm.Marca;
import br.com.rd.queroserdev.spring.devcars.orm.Pedido;
import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;
import br.com.rd.queroserdev.spring.devcars.repository.CambioRepository;
import br.com.rd.queroserdev.spring.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.spring.devcars.repository.MarcaRepository;
import br.com.rd.queroserdev.spring.devcars.repository.MotorRepository;
import br.com.rd.queroserdev.spring.devcars.repository.PedidoRepository;
import br.com.rd.queroserdev.spring.devcars.repository.VeiculoRepository;

@Service
public class PedidoService {

	private Boolean pedido = true;

	private final CambioRepository cambioRepository;
	private final ClienteRepository clienteRepository;
	private final MarcaRepository marcaRepository;
	private final MotorRepository motorRepository;
	private final PedidoRepository pedidoRepository;
	private final VeiculoRepository veiculoRepository;

	public PedidoService(CambioRepository cambioRepository, ClienteRepository clienteRepository,
			
			
			 MarcaRepository marcaRepository,
			MotorRepository motorRepository, PedidoRepository pedidoRepository,
			VeiculoRepository veiculoRepository) {
		super();
		this.cambioRepository = cambioRepository;
		this.clienteRepository = clienteRepository;
		this.marcaRepository = marcaRepository;
		this.motorRepository = motorRepository;
		this.pedidoRepository = pedidoRepository;
		this.veiculoRepository = veiculoRepository;
	}

	public void iniciar(Scanner sc) {
		int acao;

		while (pedido) {
			System.out.println("");
			System.out.println("+ --------------------------------- +");
			System.out.println("|        GESTÃO DE PEDIDOS:        |");
			System.out.println("|                                   |");
			System.out.println("|           0 = Sair                |");
			System.out.println("|           1 = Visualizar          |");
			System.out.println("|           2 = Deletar             |");
			System.out.println("|           2 = Buscar por Cambio   |");
			System.out.println("|           3 = Buscar por Cep      |");
			System.out.println("|           4 = Buscar por Cidade   |");
			System.out.println("|           5 = Buscar por Cliente  |");
			System.out.println("|           6 = Buscar por Data     |");
			System.out.println("|           7 = Buscar por Descricao|");
			System.out.println("|           8 = Buscar por Marca    |");
			System.out.println("|           9 = Buscar por Motor    |");
			System.out.println("|           10 = Buscar por Cor     |");
			System.out.println("|           11 = Buscar por Pedido  |");
			System.out.println("|           12 = Buscar por Status  |");
			System.out.println("|           13 = Buscar por Combustivel |");
			System.out.println("|           14 = Buscar por Frete   |");
			System.out.println("|           15 = Buscar por Veiculo |");
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			System.out.println("+ --------------------------------- +");
			System.out.println("|           Digite abaixo:          |");
			acao = Integer.parseInt(sc.nextLine());
			System.out.println("+ --------------------------------- +");
			System.out.println("");

			switch (acao) {
			case 1:
				visualizarVeiculo(sc);
				break;
			case 2:
				buscarPorCambio(sc);
				break;
			
			case 3:
				buscarPorCidade(sc);
				break;
			case 4:
				buscarPorCidade(sc);
				break;
			case 5:
				buscarPorCliente(sc);
				break;
			case 6:
				buscarPorData(sc);
				break;
			case 7:
				buscarPorDescricao(sc);
				break;
			case 8:
				buscarPorMarca(sc);
				break;
			case 9:
				buscarPorMotor(sc);
				break;
			case 10:
				buscarPorCor(sc);
				break;
			case 11:
				buscarPorPedido(sc);
				break;
			case 12:
				buscarPorStatus(sc);
				break;
			case 13:
				buscarPorCombustivel(sc);
				break;
			case 14:
				buscarPorFrete(sc);
				break;
			case 15:
				buscarPorVeiculo(sc);
				break;
			default:
				pedido = false;
				break;
			}

		}

	}
	
	private void visualizarVeiculo(Scanner sc) {
		System.out.println("Digite o id do veiculo que está buscando!");
		Integer id = Integer.parseInt(sc.nextLine());
		//Optional<Veiculo> veiculo = this.veiculoRepository.findById(id);
		List<Pedido> pedidos = this.pedidoRepository.findByIdVeiculo(id);
		pedidos.forEach(p -> System.out.println(p));
		
		
		Optional<Veiculo> veiculo = veiculoRepository.findById(id);
		((Pedido) pedidos).setVeiculo(veiculo.get());

		
		
	}
	
	private void deletarPedido(Pedido pedido) {
		
	Pedido[] lista = null;
	for(Pedido pedido1 : lista) {
		Cliente cliente = null;
		if(pedido1.getCliente() == cliente) {
			
			
		}
	}
	
		
		
		
		
	}

	private void buscarPorVeiculo(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorFrete(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorCombustivel(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorStatus(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorPedido(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorCor(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorMotor(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorMarca(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorDescricao(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorData(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorCliente(Scanner sc) {
		// TODO Auto-generated method stub

	}

	private void buscarPorCidade(Scanner sc) {
		// TODO Auto-generated method stub

	}

	
	private void buscarPorCambio(Scanner sc) {
		// TODO Auto-generated method stub

	}


}
