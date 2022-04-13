package br.com.queroserdev.spring.devcars.service;

import java.util.Scanner;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.queroserdev.spring.devcars.orm.Veiculo;
import br.com.queroserdev.spring.devcars.repository.CambioRepository;
import br.com.queroserdev.spring.devcars.repository.MotorRepository;
import br.com.queroserdev.spring.devcars.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	private Boolean sistema = true;
	
	private final VeiculoRepository veiculoRepository;
	private final CambioRepository cambioRepository;
	private final MotorRepository motorRepository;
	
	public VeiculoService(VeiculoRepository veiculoRepository, 
						  CambioRepository cambioRepository, 
						  MotorRepository motorRepository) {
		
		this.veiculoRepository = veiculoRepository;
		this.cambioRepository = cambioRepository;
		this.motorRepository = motorRepository;	
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
					visualizar(sc);
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


	private void visualizar(Scanner sc) {
		System.out.println("Qual a página deseja visualizar?");
		Integer page = Integer.parseInt(sc.nextLine());
		
		Pageable pageable = PageRequest.of(page, 1, Sort.by(Sort.Direction.ASC));
		Page<Veiculo> veiculos = veiculoRepository.findAll(pageable);
		System.out.println("Página atual: " + veiculos.getNumber());
		System.out.println("Total de páginas: " + veiculos.getTotalElements());
		
		veiculos.forEach(veiculo -> System.out.println(veiculo));
		
	}
	
	private void buscarPorMarca(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	private void buscarPorModelo(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	private void buscarPorAno(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
