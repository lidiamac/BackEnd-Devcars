package br.com.rd.queroserdev.spring.devcars.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

<<<<<<< HEAD
import antlr.collections.List;
=======
import br.com.rd.queroserdev.spring.devcars.orm.Cambio;
>>>>>>> e1938c8230813a1e8d1eb3774f52d62c4baff1df
import br.com.rd.queroserdev.spring.devcars.orm.Marca;
import br.com.rd.queroserdev.spring.devcars.orm.Motor;
import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;
import br.com.rd.queroserdev.spring.devcars.repository.CambioRepository;
import br.com.rd.queroserdev.spring.devcars.repository.MarcaRepository;
import br.com.rd.queroserdev.spring.devcars.repository.MotorRepository;
import br.com.rd.queroserdev.spring.devcars.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	private Boolean sistema = true;
	
	private final VeiculoRepository veiculoRepository;
	private final CambioRepository cambioRepository;
	private final MotorRepository motorRepository;
	private final MarcaRepository marcaRepository;
	
	public VeiculoService(VeiculoRepository veiculoRepository, CambioRepository cambioRepository,
		MotorRepository motorRepository, MarcaRepository marcaRepository) {
	this.veiculoRepository = veiculoRepository;
	this.cambioRepository = cambioRepository;
	this.motorRepository = motorRepository;
	this.marcaRepository = marcaRepository;
}


	public void iniciar(Scanner sc) {
		int acao;
		
		while(sistema) {
			System.out.println("");
			System.out.println("+ --------------------------------- +");
			System.out.println("|        GESTÃO DE VEÍCULOS:        |");
			System.out.println("|                                   |");
			System.out.println("|           0 = Sair                |");
			System.out.println("|           1 = Visualizar          |");
			System.out.println("|           2 = Buscar por Marca    |");
			System.out.println("|           3 = Buscar por Modelo   |");
			System.out.println("|           4 = Buscar por Ano      |");
			System.out.println("|           5 = Buscar por Motor    |");
			System.out.println("|           6 = Buscar por Câmbio   |");
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			System.out.println("+ --------------------------------- +");
			System.out.println("|           Digite abaixo:          |");
			acao = Integer.parseInt(sc.nextLine());
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			
			
			switch(acao) {
				case 1:
					visualizarVeiculo();
					break;
				case 2:
					buscarPorMarca(sc);
					break;
				case 3:
					buscarPorModelo(sc);
					break;
				case 4:
					buscarPorAno(sc);
					break;
//				case 5:
//					buscarPorMotor(sc);
//					break;
//				case 6:
//					buscarPorCambio(sc);
//					break;
				default:
					sistema = false;
					break;
			}

		}
		
	}


	private void visualizarVeiculo() {
//		System.out.println("Qual a página deseja visualizar?");
//		Integer page = Integer.parseInt(sc.nextLine());
//		
//		Pageable pageable = PageRequest.of(page, 1, Sort.by(Sort.Direction.ASC));
//		Page<Veiculo> veiculos = veiculoRepository.findAll(pageable);
//		System.out.println("Página atual: " + veiculos.getNumber());
//		System.out.println("Total de páginas: " + veiculos.getTotalElements());
//		
//		veiculos.forEach(veiculo -> System.out.println(veiculo));
		
		Iterable<Veiculo> veiculos = veiculoRepository.findAll();
		veiculos.forEach(veiculo -> System.out.println(veiculo));
		
	}
	
//	private void buscarPorMarca(Scanner sc) {
//		// TODO Auto-generated method stub
//	
//	}
	
	private void buscarPorMarca(Scanner sc) {	
		
	}
	
//	private void buscarPorMotor(Scanner sc) {
//		System.out.println("Qual o motor que deseja encontrar?");
//		String motor = sc.nextLine();
//		
//		List<Motor> motores = motorRepository.getByMotor(motor);
//		motores.forEach(System.out::println);
//	}
//	
//	private void buscarPorCambio(Scanner sc) {
//		System.out.println("Qual o câmbio que deseja encontrar?");
//		String cambio = sc.nextLine();
//		
//		List<Cambio> cambios = cambioRepository.getByCambio(cambio);
//		cambios.forEach(System.out::println);
//	}
			
	private void buscarPorModelo(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	private void buscarPorAno(Scanner sc) {
		// TODO Auto-generated method stub
		
	}


	
}
