package br.com.rd.queroserdev.devcars.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	@GetMapping("veiculo/{id}")
	public ResponseEntity<VeiculoModalDto> detalhar(@PathVariable Integer id) {
		
		Optional<Veiculo> v = veiculoRepository.findById(id);
		
		if(v.isPresent()) {
			return ResponseEntity.ok(new VeiculoModalDto(v.get()));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	
	
	@GetMapping("/cardveiculos")
	public Page<VeiculoCardDto> listarVeiculosCard(@RequestParam int pagina, @RequestParam int qtd) {
		
		Pageable paginacao = PageRequest.of(pagina, qtd);
		
		Page<Veiculo> veiculosCard = veiculoRepository.findAll(paginacao);
		return VeiculoCardDto.convert(veiculosCard);
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
		
	
