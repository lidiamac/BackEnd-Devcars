package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Endereco;

public class EnderecoDto {
	
	private Integer codEndereco;
	private String cepEndereco;
	private String ruaEndereco;
	private String complemento;
	private String numeroEndereco;
	private String bairro; 
	private String cidade;
	private String uf;
	
	public EnderecoDto(Endereco endereco) {
		this.codEndereco = endereco.getCodEndereco();
		this.cepEndereco = endereco.getCepEndereco();
		this.ruaEndereco = endereco.getRuaEndereco();
		this.complemento = endereco.getComplemento();
		this.numeroEndereco = endereco.getNumeroEndereco();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.uf = endereco.getUf();
		
	}
	
	
	public EnderecoDto() {
		// TODO Auto-generated constructor stub
	}


	public Integer getCodEndereco() {
		return codEndereco;
	}
	public String getCepEndereco() {
		return cepEndereco;
	}
	public String getRuaEndereco() {
		return ruaEndereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getNumeroEndereco() {
		return numeroEndereco;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getUf() {
		return uf;
	}


	//public List<EnderecoDto> converter(List<Endereco> enderecos) {
	//	return enderecos.stream().map(EnderecoDto::new).collect(Collectors.toList());
//	}
	
	public static List<EnderecoDto> converter(List<Endereco> enderecos) {
		return enderecos.stream().map(EnderecoDto::new).collect(Collectors.toList());
	}
	
	
	
	

}
