package br.com.rd.queroserdev.devcars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.dto.VeiculoDto;
import br.com.rd.queroserdev.devcars.model.Veiculo;
import br.com.rd.queroserdev.devcars.repositoy.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	public List<VeiculoDto> lista() {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		return VeiculoDto.converter(veiculos);
	}
	
	

}