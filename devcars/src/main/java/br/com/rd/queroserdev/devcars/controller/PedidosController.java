package br.com.rd.queroserdev.devcars.controller;

import java.net.URI;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.rd.queroserdev.devcars.controller.dto.PedidoDto;
import br.com.rd.queroserdev.devcars.controller.form.PedidoForm;
import br.com.rd.queroserdev.devcars.model.Pedido;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.EnderecoRepository;
import br.com.rd.queroserdev.devcars.repository.FormaPagamentoRepository;
import br.com.rd.queroserdev.devcars.repository.FreteRepository;
import br.com.rd.queroserdev.devcars.repository.PedidoRepository;
import br.com.rd.queroserdev.devcars.repository.StatusRepository;
import br.com.rd.queroserdev.devcars.repository.VeiculoRepository;

@RestController
@RequestMapping("/placeorder")
public class PedidosController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;
	
	@Autowired
	private FreteRepository freteRepository;
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	@PostMapping
	@Transactional
	public ResponseEntity<PedidoDto> placeorder(@RequestBody PedidoForm form, UriComponentsBuilder uriBuilder) {
		Pedido pedido = form.converter(clienteRepository, veiculoRepository, enderecoRepository, formaPagamentoRepository, freteRepository, statusRepository);
		pedidoRepository.save(pedido);
		
		URI uri = uriBuilder.path("/placeorder/{id}").buildAndExpand(pedido.getCodPedido()).toUri();
		return ResponseEntity.created(uri).body(new PedidoDto(pedido));
	}
	
}
