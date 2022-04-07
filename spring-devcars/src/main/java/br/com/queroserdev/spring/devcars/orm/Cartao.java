package br.com.queroserdev.spring.devcars.orm;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cartao")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_cartao;
	private String nome_titular;
	private Integer numero_cartao;
	private LocalDate validade_cartao;
	private Integer cvv;
	
	@ManyToOne
	@JoinColumn(name = "cod_modalidade", nullable = false)
	private Cartao cartao;
	
	
	
	
	
	
