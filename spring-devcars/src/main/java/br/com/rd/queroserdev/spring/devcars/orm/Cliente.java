package br.com.rd.queroserdev.spring.devcars.orm;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codCliente;
	
	@Column(name="tipo_documento", nullable = false)
	private String tipoDocumento;
	
	@Column(name="numero_documento", nullable = false)
	private String numeroDocumento;
	
	@Column(name="nome_cliente", nullable = true)
	private String nomeCliente;
	
	@Column(name="data_nascimento", nullable = true)
	private Date dataNascimento;
	
	@Column(name="email_cliente", nullable = false)
	private String emailCliente;
	
	@Column(name="telefone_cliente", nullable = false)
	private String telefoneCliente;
	
	@Column(name="senha_cliente", nullable = false)
	private String senhaCliente;
	
	@Column(name="inscricao_estadual", nullable = true)
	private String inscricaoEstadual;
	
	@Column(name="razao_social", nullable = true)
	private String razaoSocial;
	
	@Fetch(FetchMode.SELECT)
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "tb_endereco_cliente", joinColumns = {
			@JoinColumn(name = "cod_cliente") }, inverseJoinColumns = { @JoinColumn(name = "cod_endereco") })
	private List<Endereco> enderecos;
	
	
	@OneToMany(mappedBy = "cliente")
	private List<Favorito> favoritos;
	
	
	@OneToMany(mappedBy = "cliente")
	private List<Agendamento> cliente;
	
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;
	
	
//	@OneToMany((fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="codCartao",referencedColumnName="cod_cartao")
	private List<Cartao> cartoes;
	
	
	@OneToMany(mappedBy = "cliente")
	private List<CabecalhoNF> cabecalhos;
	
	

	public Cliente() {
		
	}
	
	
	
	public Integer getCodCliente() {
		return codCliente;
	}
	
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getEmailCliente() {
		return emailCliente;
	}
	
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	public String getSenhaCliente() {
		return senhaCliente;
	}
	
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	


	@Override
	public String toString() {
		return "Cliente [Id: " + codCliente + ", / Nome: " + nomeCliente + "]";
	}
	
	
}
