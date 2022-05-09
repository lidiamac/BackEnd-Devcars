package br.com.rd.queroserdev.devcars.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.rd.queroserdev.devcars.controller.dto.AgendamentoDto;
import br.com.rd.queroserdev.devcars.controller.form.AgendamentoForm;
import br.com.rd.queroserdev.devcars.model.Agendamento;
import br.com.rd.queroserdev.devcars.repository.AgendamentoRepository;
import br.com.rd.queroserdev.devcars.repository.BoletoRepository;
import br.com.rd.queroserdev.devcars.repository.CartaoRepository;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.FormaPagamentoRepository;
import br.com.rd.queroserdev.devcars.repository.PixRepository;
import br.com.rd.queroserdev.devcars.repository.VeiculoRepository;

@RestController
@RequestMapping("/schedule")
public class AgendamentoController {
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;
	
	@Autowired
	private CartaoRepository cartaoRepository;
	
	@Autowired
	private BoletoRepository boletoRepository;
	
	@Autowired
	private PixRepository pixRepository;
	
	
	@PostMapping
	public ResponseEntity<AgendamentoDto> cadastrar(@RequestBody AgendamentoForm form, UriComponentsBuilder uriBuilder) {
		Agendamento agendamento = form.converter(veiculoRepository, clienteRepository,
												 formaPagamentoRepository, cartaoRepository,
												 boletoRepository, pixRepository);
		agendamentoRepository.save(agendamento);
		
		URI uri = uriBuilder.path("/schedule/{id}").buildAndExpand(agendamento.getCodAgendamento()).toUri();
		return ResponseEntity.created(uri).body(new AgendamentoDto(agendamento));
	}
	
}
