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

import br.com.rd.queroserdev.devcars.controller.dto.DetalhesEnderecoClienteDto;
import br.com.rd.queroserdev.devcars.controller.dto.EnderecoDto;
import br.com.rd.queroserdev.devcars.controller.form.AtualizacaoEnderecoForm;
import br.com.rd.queroserdev.devcars.controller.form.EnderecoForm;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.Endereco;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("/{id}")
	public List<EnderecoDto> enderecos(@PathVariable @Valid Integer id){
		List<Endereco> enderecos = enderecoRepository.findByClientesCodCliente(id);
	EnderecoDto enderecoDto = new EnderecoDto();
	return enderecoDto.converter(enderecos);
		
	}
	
	
	
	
	@GetMapping
	public List<EnderecoDto> listaEnderecos(Integer codEndereco ) {
	if(codEndereco == null) {
			List<Endereco> enderecos = enderecoRepository.findAll();
		return EnderecoDto.converter(enderecos);
	} else {
	List<Endereco> enderecos = enderecoRepository.findByCodEndereco(codEndereco);
	return EnderecoDto.converter(enderecos);
	}

}
	
	
	@PostMapping
	@Transactional
	public ResponseEntity<EnderecoDto> cadastrarEnderecos(@RequestBody @Valid EnderecoForm form, UriComponentsBuilder uriBuilder) {
		Endereco endereco = form.converter(enderecoRepository);
		enderecoRepository.save(endereco);
		
		URI uri = uriBuilder.path("/enderecos/{id}").buildAndExpand(endereco.getCodEndereco()).toUri();
		return ResponseEntity.created(uri).body(new EnderecoDto(endereco));
		
	}
	
//	@GetMapping("/{id}")
//	public EnderecoDto detalharEnderecos(@PathVariable Integer id) {
//	 Endereco endereco = enderecoRepository.getOne(id);
//		return new EnderecoDto(endereco);
//		
//	}
	
	
	
	
	
	
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<EnderecoDto> atualizarEnderecos(@PathVariable Integer id, @RequestBody @Valid AtualizacaoEnderecoForm form ){
		Endereco endereco = form.atualizar(id, enderecoRepository );
		
		return ResponseEntity.ok(new EnderecoDto(endereco));
		
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> deletarEnderecos( @PathVariable Integer id){
		enderecoRepository.deleteById(id);
		return ResponseEntity.ok().build();
		
		
	}
	
	
	
	//API DETALHAMENTO ENDEREÇO POR ID CLIENTE E ID ENDEREÇO
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<DetalhesEnderecoClienteDto> detalharClienteEndereco(@PathVariable Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		if (cliente.isPresent()) {
			return ResponseEntity.ok(new DetalhesEnderecoClienteDto(cliente.get()));
		}
		return ResponseEntity.notFound().build();
	}

		
}