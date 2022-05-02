package br.com.rd.queroserdev.devcars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.dto.VeiculoCardDto;
import br.com.rd.queroserdev.devcars.controller.dto.VeiculoModalDto;
import br.com.rd.queroserdev.devcars.model.Veiculo;
import br.com.rd.queroserdev.devcars.repositoy.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRepository;


	@GetMapping("/marcas")
	public List<VeiculoCardDto> lista(String nomeMarca) {
		List<Veiculo> marcas = veiculoRepository.getByNomeMarca(nomeMarca);
		return VeiculoCardDto.converter(marcas);
	}
	
	
	@GetMapping("/")
	public List<VeiculoModalDto> listarVeiculos() {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		return VeiculoModalDto.converter(veiculos);
	}
	
	
	
	

	
}	
		
	
