package br.com.rd.queroserdev.devcars.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

import br.com.rd.queroserdev.devcars.controller.dto.FormaPagamentoDTO;
import br.com.rd.queroserdev.devcars.controller.dto.MyOrderDto;
import br.com.rd.queroserdev.devcars.controller.dto.PedidoDto;
import br.com.rd.queroserdev.devcars.controller.dto.ResumoPedidoDTO;
import br.com.rd.queroserdev.devcars.controller.dto.VeiculoCardDto;
import br.com.rd.queroserdev.devcars.controller.dto.VeiculoModalDto;
import br.com.rd.queroserdev.devcars.controller.form.PedidoForm;
import br.com.rd.queroserdev.devcars.model.FormaPagamento;
import br.com.rd.queroserdev.devcars.model.Pedido;
import br.com.rd.queroserdev.devcars.model.Veiculo;
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
	
	
	
	
	@GetMapping("/resume/{id}")
	public ResumoPedidoDTO detalhesPedido(@PathVariable @Valid Integer id) {
		Pedido pedido = pedidoRepository.findByCodPedido(id);
		return new ResumoPedidoDTO(pedido);
	}


//	@GetMapping("/{id}")
//	public ResponseEntity<MyOrderDto> listarMeusPedidos(@PathVariable Integer id){
//		
//		Optional<Pedido> meusPedidos = pedidoRepository.findById(id);
//		if(meusPedidos.isPresent()) {
//			return ResponseEntity.ok(new MyOrderDto(meusPedidos.get()));
//			
//		}
//		return ResponseEntity.notFound().build();
//		
//	}
	
	

	@GetMapping("/{codCliente}")
	public List<MyOrderDto> listarMeusPedidos(@PathVariable Integer codCliente) {
		List<Pedido> pedidos = pedidoRepository.findByClienteCodCliente(codCliente);
		return MyOrderDto.converter(pedidos);
	}
	
			
			
	

	@GetMapping("/payment")
	public List<FormaPagamentoDTO> formasPagamento(){
		
		List<FormaPagamento> formasPagamento = formaPagamentoRepository.findAll();
		return FormaPagamentoDTO.converter(formasPagamento);
	}

	
	
	
}
