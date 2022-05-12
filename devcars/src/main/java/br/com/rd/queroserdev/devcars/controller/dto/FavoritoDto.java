package br.com.rd.queroserdev.devcars.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Favorito;

public class FavoritoDto {

	private Integer cliente;
	private Integer codFavorito;
	private String nomeCliente;
	private String razaoSocial;
	
	public FavoritoDto() {
		
	}
	
	public FavoritoDto(Favorito favorito) {
		this.codFavorito = favorito.getCodFavorito();
		this.cliente = favorito.getCliente().getCodCliente();
		this.nomeCliente = favorito.getCliente().getNomeCliente();
		this.razaoSocial = favorito.getCliente().getRazaoSocial();
		
	}

//	public List<Veiculo> getVeiculo() {
//		return veiculo;
//	}
////	public void setVeiculo(List<Veiculo> veiculo) {
//		this.veiculo = veiculo;
//	}

	
	public Integer getCodFavorito() {
		return codFavorito;
	}

	

	

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setCodFavorito(Integer codFavorito) {
		this.codFavorito = codFavorito;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public static List<FavoritoDto> converter(List<Favorito> favorito) {
		return favorito.stream().map(FavoritoDto::new).collect(Collectors.toList());
	}

	
	
}
