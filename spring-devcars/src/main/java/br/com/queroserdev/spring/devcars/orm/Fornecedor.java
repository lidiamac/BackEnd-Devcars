package br.com.queroserdev.spring.devcars.orm;

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
	private Integer id;
	private Integer cnpj;
	private String razao_social;
	private Integer inscricao_estadual;
	private String email_fornecedor;
	private Integer telefone_fornecedor;
	private Integer seAtivo;
	
	

	@Column(nullable = false)
	private String razao_social;
	

}
