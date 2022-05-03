package br.com.rd.queroserdev.devcars.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.rd.queroserdev.devcars.controller.dto.CartaoDTO;
import br.com.rd.queroserdev.devcars.controller.dto.ClienteFisicoDTO;
import br.com.rd.queroserdev.devcars.controller.form.CartaoForm;
import br.com.rd.queroserdev.devcars.controller.form.ClienteFisicoForm;
import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.repository.CartaoRepository;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.ModalidadeCartaoRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private CartaoRepository cartaoRepository;
	
	@Autowired
	private ModalidadeCartaoRepository modalidadeCartaoRepository;

	
	
	
	@GetMapping("/{id}")
	public ClienteFisicoDTO dadosCliente(@PathVariable("id") Integer id) {
		Cliente cliente = clienteRepository.getById(id);

		return new ClienteFisicoDTO(cliente);

	}

	@Transactional
	@PostMapping("/cartao")
	public ResponseEntity<CartaoDTO> cadastrar(@RequestBody @Valid CartaoForm form, UriComponentsBuilder uriBuilder) {
		Cartao cartao = form.converter(clienteRepository, modalidadeCartaoRepository);
		
		cartaoRepository.save(cartao);
		URI uri = uriBuilder.path("/cartao/{id}").buildAndExpand(cartao.getCodCartao()).toUri();
		return ResponseEntity.created(uri).body(new CartaoDTO(cartao));
	}
	
	
	
	@PostMapping("/f")
	public ResponseEntity<ClienteFisicoDTO> cadastrarClienteFisico(@RequestBody @Valid ClienteFisicoForm form, UriComponentsBuilder uriBuilder){
		Cliente cliente = form.converter();
		
		clienteRepository.save(cliente);
		
		URI uri = uriBuilder.path("/cliente/{id}").buildAndExpand(cliente.getCodCliente()).toUri();
		return ResponseEntity.created(uri).body(new ClienteFisicoDTO(cliente));
	}
	
	
	
//	
//	@Transactional
//	@PostMapping("/cartao")
//	public void cadastrar(CartaoForm cartaoForm){
//		Cartao cartao = cartaoForm.converter(clienteRepository, modalidadeCartaoRepository);
//		cartaoRepository.save(cartao);
//	}
	
	
	
	@GetMapping("/cartao/{id}")
	public List<CartaoDTO> cartoes(@PathVariable @Valid Integer id){
		List<Cartao> cartao = cartaoRepository.findByCliente_CodCliente(id);
		CartaoDTO cartaoDTO = new CartaoDTO();
		return cartaoDTO.converter(cartao);
	}
	
	

}
