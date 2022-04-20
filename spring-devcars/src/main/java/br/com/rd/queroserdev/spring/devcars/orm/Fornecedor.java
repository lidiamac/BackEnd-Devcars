package br.com.rd.queroserdev.spring.devcars.orm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_fornecedor", nullable = false)
	private Integer cod_fornecedor;
	
	@Column(name="cnpj", nullable = false)
	private String cnpj;
	
	
	@Column(name="razao_social", nullable = false)
	private String razao_social;
	
	@Column(name="inscricao_estadual", nullable = false)
	private String inscricao_estadual;
	
	@Column(name="email_fornecedor", nullable = false)
	private String email_fornecedor;
	
	@Column(name="telefone_fornecedor", nullable = false)
	private String telefone_fornecedor;
	
	@Column(name="se_ativo", nullable = true)
	private Boolean seAtivo;

	public Integer getCod_fornecedor() {
		return cod_fornecedor;
	}

	public void setCod_fornecedor(Integer cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getInscricao_estadual() {
		return inscricao_estadual;
	}

	public void setInscricao_estadual(String inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
	}

	public String getEmail_fornecedor() {
		return email_fornecedor;
	}

	public void setEmail_fornecedor(String email_fornecedor) {
		this.email_fornecedor = email_fornecedor;
	}

	public String getTelefone_fornecedor() {
		return telefone_fornecedor;
	}

	public void setTelefone_fornecedor(String telefone_fornecedor) {
		this.telefone_fornecedor = telefone_fornecedor;
	}

	public Boolean getSeAtivo() {
		return seAtivo;
	}

	public void setSeAtivo(Boolean seAtivo) {
		this.seAtivo = seAtivo;
	}

	@Override
	public String toString() {
		return "Fornecedor [cod_fornecedor=" + cod_fornecedor + ", cnpj=" + cnpj + ", razao_social=" + razao_social
				+ ", inscricao_estadual=" + inscricao_estadual + ", email_fornecedor=" + email_fornecedor
				+ ", telefone_fornecedor=" + telefone_fornecedor + ", seAtivo=" + seAtivo + "]";
	}
	
	

}
