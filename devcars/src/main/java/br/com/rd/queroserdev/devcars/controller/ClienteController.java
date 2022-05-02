package br.com.rd.queroserdev.devcars.controller;

import java.net.URI;

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
import br.com.rd.queroserdev.devcars.controller.dto.ClienteDTO;
import br.com.rd.queroserdev.devcars.controller.form.CartaoForm;
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
	public ClienteDTO dadosCliente(@PathVariable("id") Integer id) {
		Cliente cliente = clienteRepository.getById(id);

		return new ClienteDTO(cliente);

	}

	@PostMapping("/cartao")
	public ResponseEntity<CartaoDTO> cadastrar(@RequestBody @Valid CartaoForm form, UriComponentsBuilder uriBuilder) {
		Cartao cartao = form.converter(clienteRepository, modalidadeCartaoRepository);
		
		cartaoRepository.save(cartao);
		URI uri = uriBuilder.path("/cartao/{id}").buildAndExpand(cartao.getCodCartao()).toUri();
		return ResponseEntity.created(uri).body(new CartaoDTO(cartao));
	}

}
