package br.com.rd.queroserdev.spring.devcars.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.domain.Page;

import br.com.rd.queroserdev.spring.devcars.orm.Agendamento;

public class AgendamentoDTO {

	private Integer id;
	private LocalDate dataReserva;
	private BigDecimal taxaReserva; 
	private String formaPagamento;
	
	private String veiculo;
	private String cliente;
	

	public AgendamentoDTO(Agendamento agendamento) {
		this.id = agendamento.getCodAgendamento();
		this.veiculo = agendamento.getVeiculo().getModeloVeiculo();
		this.cliente = agendamento.getCliente().getNomeCliente();
		this.dataReserva = agendamento.getDataReserva();
		this.taxaReserva = agendamento.getTaxaAgendamento();
		this.formaPagamento = agendamento.getFormaPagamento().getDescricaoFormaPagamento();
	}
	
	
	public Integer getId() {
		return id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDate getDataReserva() {
		return dataReserva;
	}

	public BigDecimal getTaxaReserva() {
		return taxaReserva;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	public static Page<AgendamentoDTO> converter(Page<Agendamento> agendamentos) {
		
		return agendamentos.map(AgendamentoDTO::new);
	}

	
}
