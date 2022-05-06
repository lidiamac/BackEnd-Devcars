package br.com.rd.queroserdev.devcars.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.rd.queroserdev.devcars.model.Endereco;
import br.com.rd.queroserdev.devcars.repository.EnderecoRepository;

public class AtualizacaoEnderecoForm {
	
	@NotNull @NotEmpty
	private String cepEndereco;
	
	@NotNull @NotEmpty
	private String ruaEndereco;
	
	@NotNull @NotEmpty
	private String complemento;
	
	@NotNull @NotEmpty
	private String numeroEndereco;
	
	@NotNull @NotEmpty
	private String bairro; 
	
	@NotNull @NotEmpty
	private String cidade;
	
	@NotNull @NotEmpty
	private String uf;

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getRuaEndereco() {
		return ruaEndereco;
	}

	public void setRuaEndereco(String ruaEndereco) {
		this.ruaEndereco = ruaEndereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Endereco atualizar(Integer id, EnderecoRepository enderecoRepository) {
		Endereco endereco = enderecoRepository.getOne(id);
		
		endereco.setCepEndereco(this.cepEndereco);
		endereco.setRuaEndereco(this.ruaEndereco);
		endereco.setComplemento(this.complemento);
		endereco.setNumeroEndereco(this.numeroEndereco);
		endereco.setBairro(this.bairro);
		endereco.setCidade(this.cidade);
		endereco.setUf(this.uf);
		
		return endereco;
	}

}
