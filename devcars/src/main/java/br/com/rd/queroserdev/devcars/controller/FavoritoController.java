package br.com.rd.queroserdev.devcars.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.rd.queroserdev.devcars.controller.dto.ClienteFisicoDTO;
import br.com.rd.queroserdev.devcars.controller.dto.FavoritoDto;
import br.com.rd.queroserdev.devcars.controller.form.ClienteFisicoForm;
import br.com.rd.queroserdev.devcars.controller.form.FavoritoForm;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.Favorito;
import br.com.rd.queroserdev.devcars.repository.FavoritoRepository;

@RestController
@RequestMapping("/favoritos")
public class FavoritoController {

	@Autowired
	private FavoritoRepository favoritoRepository;  //  injeção de dependência
	
	
// ------------ TRAZENDO TODOS OS FAVORITOS  ------------ 
	@GetMapping("/")
	public List<FavoritoDto> listarFavorito() {
		List<Favorito> favorito = favoritoRepository.findAll();
		return FavoritoDto.converter(favorito);
	}	
	
	
// ------------ TRAZENDO FAVORITOS POR ID  ------------ 
		@SuppressWarnings("static-access")
		@GetMapping("/{id}")
		public List<FavoritoDto> favoritos(@PathVariable @Valid Integer id){
			
			List<Favorito> favorito = favoritoRepository.findByCliente_CodCliente(id);
			favorito.stream().forEach(System.out::println);
		    FavoritoDto favoritoDto = new FavoritoDto();	
		    
			return favoritoDto.converter(favorito);
			
		}
	
	
	
// ------------ ADICIONANDO  FAVORITOS  ------------ 
	
//	@Transactional
//	@PostMapping("/adf")
//	public ResponseEntity<FavoritoDto> adFavorito(@RequestBody @Valid FavoritoForm form, UriComponentsBuilder uriBuilder){
//		FavoritoDto favorito = form.converter();
//		
//		favoritoRepository.save(favorito);
//		
//		URI uri = uriBuilder.path("/favorito/{id}").buildAndExpand(favorito.getCliente()).toUri();
//		return ResponseEntity.created(uri).body(new FavoritoDto(favorito));
//	}
	
	
	
	
}
