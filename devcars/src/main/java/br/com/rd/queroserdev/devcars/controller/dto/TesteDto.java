package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Teste;

public class TesteDto {
	
	private Long id;
	private String nome;
	
	public TesteDto(Teste teste) {
		this.id = teste.getId();
		this.nome = teste.getNome();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}

	public static List<TesteDto> converter(List<Teste> testes) {
		return testes.stream().map(TesteDto::new).collect(Collectors.toList());
	}
	
	
	
	
}
