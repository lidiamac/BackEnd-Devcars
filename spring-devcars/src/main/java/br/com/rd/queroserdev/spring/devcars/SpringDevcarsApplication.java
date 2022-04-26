package br.com.rd.queroserdev.spring.devcars;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import br.com.rd.queroserdev.spring.devcars.service.AgendamentoService;
import br.com.rd.queroserdev.spring.devcars.service.ClienteService;
import br.com.rd.queroserdev.spring.devcars.service.PedidoService;
import br.com.rd.queroserdev.spring.devcars.service.VeiculoService;

@EnableJpaRepositories("br.com.rd.queroserdev.spring.devcars.repository")
@SpringBootApplication

public class SpringDevcarsApplication implements CommandLineRunner {
	
	private Boolean sistema = true;
	
	@Autowired(required=true)
	private VeiculoService veiculoService;
	
	@Autowired(required=true)
	private ClienteService clienteService;
	
	@Autowired
	private PedidoService pedidoService;
	
//	@Autowired
//	private AgendamentoService agendamentoService;
//	
	
//	private final VeiculoService veiculoService;
//	private final ClienteService clienteService;
//	
//	public SpringDevcarsApplication (VeiculoService veiculoService, ClienteService clienteService) {
//		this.veiculoService = veiculoService;
//		this.clienteService = clienteService;
//	}

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
			System.out.println("|      2 - Cliente                  |");
			System.out.println("|      3 - Pedido                   |");
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			System.out.println("+ --------------------------------- +");
			System.out.println("|           Digite abaixo:          |");
			acao = Integer.parseInt(sc.nextLine());
			System.out.println("+ --------------------------------- +");
			System.out.println("");
			
			if (acao == 1) {
				this.veiculoService.iniciar(sc);
			} else if (acao == 2) {
				this.clienteService.iniciar(sc);
			} else if (acao == 3) {
				this.pedidoService.iniciar(sc);
			} else {
				sistema = false;
				System.out.println("+ --------------------------------- +");
				System.out.println("|           FIM DO PROGRAMA!        |");
				System.out.println("+ --------------------------------- +");
			}
			
		}
		
		sc.close();
		
	}

}
