package br.com.rd.queroserdev.devcars.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.dto.DestaquesDTO;
import br.com.rd.queroserdev.devcars.model.Veiculo;
import br.com.rd.queroserdev.devcars.repository.VeiculoRepository;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	
	@GetMapping
	public List<DestaquesDTO> listarVeiculosModal() {
		List<Veiculo> destaques = veiculoRepository.findByDestaqueTrue();
		return DestaquesDTO.converter(destaques);
	}
	
	
}
