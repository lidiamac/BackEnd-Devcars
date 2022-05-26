package br.com.rd.queroserdev.devcars.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.dto.FreteDTO;
import br.com.rd.queroserdev.devcars.controller.dto.ResumoPedidoDTO;
import br.com.rd.queroserdev.devcars.controller.dto.VeiculoModalDto;
import br.com.rd.queroserdev.devcars.model.Frete;
import br.com.rd.queroserdev.devcars.repository.FreteRepository;

@RestController
@RequestMapping("/frete")
public class FreteController {
	

	@Autowired
	private FreteRepository freteRepository;
	

	@GetMapping("/{UF}")
	public ResponseEntity<FreteDTO> frete(@PathVariable String UF) {
		Optional<Frete> frete = freteRepository.findByUnidadeFederativa(UF);
		
		if(frete.isPresent()) {
			return ResponseEntity.ok(new FreteDTO(frete.get()));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	
	

}
