package br.com.rd.queroserdev.spring.devcars;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.queroserdev.spring.devcars.service.VeiculoService;

@EnableJpaRepositories
@SpringBootApplication
public class SpringDevcarsApplication implements CommandLineRunner {
	
	private Boolean sistema = true;
	
	private final VeiculoService veiculoService;
	
	public SpringDevcarsApplication (VeiculoService veiculoService) {
		this.veiculoService = veiculoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDevcarsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int acao;
		
		while(sistema) {
			System.out.println("");
			System.out.println("+ --------------------------------- +");
			System.out.println("|     Qual a ação será executada?   |");
			System.out.println("|                                   |");
			System.out.println("|      0 - Sair                     |");
			System.out.println("|      1 - Veículos                 |");
			System.out.println("|      2 -                          |");
			System.out.println("|      3 -                          |");
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			System.out.println("+ --------------------------------- +");
			System.out.println("|           Digite abaixo:          |");
			acao = Integer.parseInt(sc.nextLine());
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			
			if (acao == 1) {
				veiculoService.iniciar(sc);
			} else {
				sistema = false;
				System.out.println("+ --------------------------------- +");
				System.out.println("|           FIM DO PROGRAMA         |");
				System.out.println("+ --------------------------------- +");
			}
			
		}
		
		sc.close();
		
	}

}
