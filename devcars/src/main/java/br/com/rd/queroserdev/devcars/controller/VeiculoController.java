package br.com.rd.queroserdev.devcars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.dto.VeiculoCardDto;
import br.com.rd.queroserdev.devcars.controller.dto.VeiculoModalDto;
import br.com.rd.queroserdev.devcars.model.Veiculo;
import br.com.rd.queroserdev.devcars.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRepository;

//	@GetMapping
//	public List<VeiculoDto> lista() {
//		List<Veiculo> veiculos = veiculoRepository.findAll();
//		return VeiculoDto.converter(veiculos);
//	}

	@GetMapping("/marca")
	public List<VeiculoCardDto> lista(String nomeMarca) {
		List<Veiculo> marcas = veiculoRepository.getByNomeMarca(nomeMarca);
		return VeiculoCardDto.converter(marcas);
	}
	
	@GetMapping("/allveiculos")
	public List<VeiculoModalDto> listarVeiculos(String nomeMarca, String nomeCor, String nomeMotor, String potencia, String cambio, String combustivel) {
		List<Veiculo> veiculos = veiculoRepository.getAllVeiculos(nomeMarca, nomeCor, nomeMotor, potencia, cambio, combustivel);
		return VeiculoModalDto.converter(veiculos);
	}
	
}	
		
	
