package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Endereco;

public class EnderecoDTO {
	
	private String cep;
	private String rua;
	private String complemento;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	public EnderecoDTO() {}
	
	public EnderecoDTO(Endereco endereco) {
		this.cep = endereco.getCepEndereco();
		this.rua = endereco.getRuaEndereco();
		this.complemento = endereco.getComplemento();
		this.numero = endereco.getNumeroEndereco();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.uf = endereco.getUf();
	}

	public String getCep() {
		return cep;
	}

	public String getRua() {
		return rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getNumero() {
		return numero;
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
	
	public static List<EnderecoDTO> converter(List<Endereco> enderecos) {
		return enderecos.stream().map(EnderecoDTO::new).collect(Collectors.toList());
	}
	
	
}
