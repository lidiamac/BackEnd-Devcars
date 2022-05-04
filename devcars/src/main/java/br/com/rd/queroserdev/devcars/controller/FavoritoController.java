package br.com.rd.queroserdev.devcars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.dto.FavoritoDto;
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
	
	// ------------ TRAZENDO TODOS OS FAVORITOS  ------------ 
	
	
}
