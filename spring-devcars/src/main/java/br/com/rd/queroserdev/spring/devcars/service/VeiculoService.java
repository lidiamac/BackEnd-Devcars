package br.com.rd.queroserdev.spring.devcars.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import br.com.rd.queroserdev.spring.devcars.orm.Marca;
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
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			System.out.println("+ --------------------------------- +");
			System.out.println("|           Digite abaixo:          |");
			acao = Integer.parseInt(sc.nextLine());
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			
			
			switch(acao) {
				case 1:
					visualizarVeiculo(sc);
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
				default:
					sistema = false;
					break;
			}

		}
		
	}


	private void visualizarVeiculo(Scanner sc) {
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
		System.out.println("Qual a marca que deseja encontrar?");
		String brand = sc.nextLine();
		
		List<Marca> marcas = marcaRepository.getByBrand(brand);
		marcas.forEach(System.out::println);	
		
	}
	
	private void buscarPorModelo(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	private void buscarPorAno(Scanner sc) {
		// TODO Auto-generated method stub
		
	}


	
}
