package br.com.rd.queroserdev.devcars.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.rd.queroserdev.devcars.controller.dto.ClienteFisicoDTO;
import br.com.rd.queroserdev.devcars.controller.form.AtualizacaoClienteFisicoForm;
import br.com.rd.queroserdev.devcars.controller.form.ClienteFisicoForm;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	

	
	
	@GetMapping("/{id}")
	public ClienteFisicoDTO dadosCliente(@PathVariable("id") Integer id) {
		Cliente cliente = clienteRepository.getById(id);

		return new ClienteFisicoDTO(cliente);

	}
	
	
	@Transactional
	@PostMapping("/f")
	public ResponseEntity<ClienteFisicoDTO> cadastrarClienteFisico(@RequestBody @Valid ClienteFisicoForm form, UriComponentsBuilder uriBuilder){
		Cliente cliente = form.converter();
		
		clienteRepository.save(cliente);
		
		URI uri = uriBuilder.path("/cliente/{id}").buildAndExpand(cliente.getCodCliente()).toUri();
		return ResponseEntity.created(uri).body(new ClienteFisicoDTO(cliente));
	}
	
	
	
	

	
//	@GetMapping("/cartao/{id}")
//	public List<CartaoDTO> cartoes(@PathVariable @Valid Integer id){
//		List<Cartao> cartao = cartaoRepository.findByCliente_CodCliente(id);
//
//		return CartaoDTO.converter(cartao);
//		CartaoDTO cartaoDTO = new CartaoDTO();
//		return cartaoDTO.converter(cartao);
//	}

	@Transactional
	@PutMapping("/f/{id}")
	public ResponseEntity<ClienteFisicoDTO> atualizar (@PathVariable Integer id, @RequestBody @Valid AtualizacaoClienteFisicoForm form){
		Optional<Cliente> clienteOPt = clienteRepository.findById(id);
		
		if(clienteOPt.isPresent()) {
			Cliente cliente = form.atualizar(id, clienteRepository);
			return ResponseEntity.ok(new ClienteFisicoDTO(cliente));
		}

		return ResponseEntity.notFound().build();
	}

	

}
