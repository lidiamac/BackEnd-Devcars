package br.com.rd.queroserdev.devcars.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.queroserdev.devcars.controller.dto.TesteDto;
import br.com.rd.queroserdev.devcars.model.Teste;

@RestController
public class TesteController {
	
	@RequestMapping("/abobrinha")
	public List<TesteDto> lista() {
		Teste teste = new Teste("João", "descrição");
		
		return TesteDto.converter(Arrays.asList(teste, teste, teste));
	}
}
