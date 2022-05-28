package br.com.rd.queroserdev.devcars.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.rd.queroserdev.devcars.controller.dto.CartaoDTO;
import br.com.rd.queroserdev.devcars.controller.form.AtualizacaoCartaoForm;
import br.com.rd.queroserdev.devcars.controller.form.CartaoForm;
import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.repository.CartaoRepository;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.ModalidadeCartaoRepository;

@RestController
@RequestMapping("cartao")
public class CartaoController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private CartaoRepository cartaoRepository;
	
	@Autowired
	private ModalidadeCartaoRepository modalidadeCartaoRepository;


	
	@Transactional
	@PostMapping
	public ResponseEntity<CartaoDTO> cadastrar(@RequestBody @Valid CartaoForm form, UriComponentsBuilder uriBuilder) {
		Cartao cartao = form.converter(clienteRepository, modalidadeCartaoRepository);
		cartaoRepository.save(cartao);
		
		URI uri = uriBuilder.path("/cliente/cartao/{id}").buildAndExpand(cartao.getCodCartao()).toUri();
		return ResponseEntity.created(uri).body(new CartaoDTO(cartao));
	}
	
	
	
	@GetMapping("/cliente/{id}")
	public List<CartaoDTO> cartoes(@PathVariable @Valid Integer id){
		List<Cartao> cartao = cartaoRepository.findByCliente_CodCliente(id);
		CartaoDTO cartaoDTO = new CartaoDTO();
		return cartaoDTO.converter(cartao);
	}
	
	
	@Transactional
	@PutMapping("/{id}")
	public ResponseEntity<CartaoDTO> atualizar (@PathVariable Integer id, @RequestBody @Valid AtualizacaoCartaoForm form){
		Optional<Cartao> cartaoOPt = cartaoRepository.findById(id);
		
		if(cartaoOPt.isPresent()) {
			Cartao cartao = form.atualizar(id, cartaoRepository);
			return ResponseEntity.ok(new CartaoDTO(cartao));
		}

		return ResponseEntity.notFound().build();
	}
	
	
	
	
	@Transactional
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar (@PathVariable Integer id){
		Optional<Cartao> cartaoOPt = cartaoRepository.findById(id);
		
		if(cartaoOPt.isPresent()) {
			cartaoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	} 
	
	
}