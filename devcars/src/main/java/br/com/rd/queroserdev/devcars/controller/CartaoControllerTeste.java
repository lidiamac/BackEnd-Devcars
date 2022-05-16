package br.com.rd.queroserdev.devcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.form.CartaoFormTeste;
import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.repository.CartaoRepository;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.ModalidadeCartaoRepository;

@RestController
@RequestMapping("/cartao")
public class CartaoControllerTeste {
	
	@Autowired
	CartaoRepository cartaoRepository;
	
	@Autowired
	ModalidadeCartaoRepository modalidadeCartaoRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	@PostMapping
	public void cadastrar(@RequestBody CartaoFormTeste form) {
		Cartao cartao = form.converter(clienteRepository, modalidadeCartaoRepository);
		cartaoRepository.save(cartao);
	}
		
}
