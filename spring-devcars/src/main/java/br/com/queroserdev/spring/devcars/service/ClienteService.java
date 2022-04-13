package br.com.queroserdev.spring.devcars.service;

import org.springframework.stereotype.Service;

import br.com.queroserdev.spring.devcars.repository.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	
	
}
