package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Cliente;

public class DetalhesEnderecoClienteDto {
	
	private Integer codCliente;
	private String tipoDocumento;
	private String numeroDocumento;
	private String nomeCliente;
	private String emailCliente;
	private String telefoneCliente;
	private String inscricaoEstadual;
	private String razaoSocial;
	
	private List<EnderecoDto> enderecos;

	public DetalhesEnderecoClienteDto(Cliente cliente) {
		this.codCliente = cliente.getCodCliente();
		this.tipoDocumento = cliente.getTipoDocumento();
		this.numeroDocumento = cliente.getNumeroDocumento();
		this.nomeCliente = cliente.getNomeCliente();
		this.emailCliente = cliente.getEmailCliente();
		this.telefoneCliente = cliente.getTelefoneCliente();
		this.inscricaoEstadual = cliente.getInscricaoEstadual();
		this.razaoSocial = cliente.getRazaoSocial();
		
		this.enderecos = new ArrayList<>();
		this.enderecos.addAll(cliente.getEnderecos().stream().map(EnderecoDto::new).collect(Collectors.toList()));

	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public List<EnderecoDto> getEnderecos() {
		return enderecos;
	}
		
	
}
