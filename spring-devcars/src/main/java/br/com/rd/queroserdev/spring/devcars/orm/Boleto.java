package br.com.rd.queroserdev.spring.devcars.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tb_boleto")
public class Boleto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_boleto", nullable = false)
	private Integer codBoleto;
	
	@Column(name="numero_cod_barra", nullable = false)
	private String numeroCodBarra;	
	

	
	
	public Boleto() {
		
	}

	
	

	public Integer getCodBoleto() {
		return codBoleto;
	}


	public void setCodBoleto(Integer codBoleto) {
		this.codBoleto = codBoleto;
	}


	public String getNumeroCodBarra() {
		return numeroCodBarra;
	}


	public void setNumeroCodBarra(String numeroCodBarra) {
		this.numeroCodBarra = numeroCodBarra;
	}

//
//	public Agendamento getAgendamento() {
//		return agendamento;
//	}
//
//
//	public void setAgendamento(Agendamento agendamento) {
//		this.agendamento = agendamento;
//	}




	@Override
	public String toString() {
		return "Boleto [codBoleto=" + codBoleto + ", numeroCodBarra=" + numeroCodBarra 
				+ "]";
	}
	
	
}
