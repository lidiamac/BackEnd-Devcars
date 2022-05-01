package br.com.rd.queroserdev.devcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.dto.ClienteDTO;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.repositoy.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

//	@GetMapping("/{id}")
//	public ResponseEntity<?> dadosCliente(@PathVariable("id") Integer id) { // método que trás os dados de um cliente em
//																			// específico
//
//		Optional<Cliente> cliente = clienteRepository.findById(id);
//
//		if (cliente.isPresent()) {
//			clienteRepository.findById(id);
//			return ResponseEntity.ok().build();
//		}
//
//		return ResponseEntity.notFound().build();
//
//	}
	
	@GetMapping("/{id}")
	public ClienteDTO dadosCliente(@PathVariable("id") Integer id) {
		Cliente cliente = clienteRepository.getById(id);
		
		return new ClienteDTO(cliente);
		
	}

}
