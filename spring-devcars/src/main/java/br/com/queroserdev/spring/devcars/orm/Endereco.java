package br.com.queroserdev.spring.devcars.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codEndereco;
	
	@Column(name="cep_endereco", nullable = false)
	private String cepEndereco;
	
	@Column(name="rua_endereco", nullable = false)
	private String ruaEndereco;
	
	@Column(name="complemento", nullable = true)
	private String complemento;
	
	@Column(name="numero_endereco", nullable = true)
	private String numeroEndereco; 
	
	@Column(name="bairro", nullable = false)
	private String bairro; 
	
	@Column(name="cidade", nullable = false)
	private String cidade;
	
	@Column(name="uf", nullable = false)
	private String uf;
	
	@ManyToMany(mappedBy="unidadeTrabalhos",fetch = FetchType.EAGER)
	private List<Cliente> clientes;
	
	
	public Endereco() {
		
	}


	
	public Integer getCodEndereco() {
		return codEndereco;
	}



	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}



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


	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}




	@Override
	public String toString() {
		return "Endereco [codEndereco=" + codEndereco + ", cepEndereco=" + cepEndereco + ", ruaEndereco=" + ruaEndereco
				+ ", complemento=" + complemento + ", numeroEndereco=" + numeroEndereco + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", uf=" + uf + ", clientes=" + clientes + "]";
	}
	

}
