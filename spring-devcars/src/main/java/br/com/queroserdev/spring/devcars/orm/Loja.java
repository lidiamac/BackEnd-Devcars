package br.com.queroserdev.spring.devcars.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_loja")
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codLoja;
	
	
	@Column(name = "razao_social_loja", nullable = false)
	private String razaoSocialLoja;
	
	@Column(name = "cnpj_loja", nullable = false)
	private String cnpjLoja;
	
	@Column(name = "telefone_loja", nullable = false)
	private String telefoneLoja;
	
	@Column(name = "cod_endereco", nullable = false)
	private Integer codEndereco;
	
	@OneToOne
	@JoinColumn(name = "cod_endereco", nullable = false)
	private Endereco endereco;

	public Integer getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(Integer codLoja) {
		this.codLoja = codLoja;
	}

	public String getRazaoSocialLoja() {
		return razaoSocialLoja;
	}

	public void setRazaoSocialLoja(String razaoSocialLoja) {
		this.razaoSocialLoja = razaoSocialLoja;
	}

	public String getCnpjLoja() {
		return cnpjLoja;
	}

	public void setCnpjLoja(String cnpjLoja) {
		this.cnpjLoja = cnpjLoja;
	}

	public String getTelefoneLoja() {
		return telefoneLoja;
	}

	public void setTelefoneLoja(String telefoneLoja) {
		this.telefoneLoja = telefoneLoja;
	}

	public Integer getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Loja [codLoja=" + codLoja + ", razaoSocialLoja=" + razaoSocialLoja + ", cnpjLoja=" + cnpjLoja
				+ ", telefoneLoja=" + telefoneLoja + ", codEndereco=" + codEndereco + "]";
	}
	
	
	
}