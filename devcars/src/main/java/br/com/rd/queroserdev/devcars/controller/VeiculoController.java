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

	
	@GetMapping("")
	public List<VeiculoModalDto> listarVeiculosModal() {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		return VeiculoModalDto.converter(veiculos);
	}
	
	@GetMapping("/cardveiculos")
	public List<VeiculoCardDto> listarVeiculosCard() {
		List<Veiculo> veiculosCard = veiculoRepository.findAll();
		return VeiculoCardDto.converter(veiculosCard);
	}

	@GetMapping("/marcas")
	public List<VeiculoCardDto> listaMarca(String nomeMarca) {
		List<Veiculo> marcas = veiculoRepository.getByNomeMarca(nomeMarca);
		return VeiculoCardDto.converter(marcas);
	}
	
	@GetMapping("/modelos")
	public List<VeiculoCardDto> listaModelo(String modelo) {
		List<Veiculo> modelos = veiculoRepository.findByModeloVeiculo(modelo);
		return VeiculoCardDto.converter(modelos);
	}
	
	@GetMapping("/ano")
	public List<VeiculoCardDto> listaAno(Integer ano) {
		List <Veiculo> anoFabricacao = veiculoRepository.findByAnoVeiculo(ano);
		return VeiculoCardDto.converter(anoFabricacao);
	}
	
	@GetMapping("/marcamodelo")
	public List<VeiculoCardDto> listarPorMarcaModelo(String nomeMarca, String nomeModelo) {
		List<Veiculo> marcaModelo = veiculoRepository.getByMarcaModelo(nomeMarca, nomeModelo);
		return VeiculoCardDto.converter(marcaModelo);
	}
	

	
}	
		
	
