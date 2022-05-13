package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Agendamento;

public class AgendamentoDto {
	
	private Integer codAgendamento;
	private Integer codCliente;
	private Integer codVeiculo;
	private String marcaVeiculo;
	private String modeloVeiculo;
	private BigDecimal valorVeiculo;
	private String formaPagamento;
	private LocalDate dataReserva;
	
	public AgendamentoDto() {}
	
	public AgendamentoDto(Agendamento agendamento) {
		this.codAgendamento = agendamento.getCodAgendamento();
		this.codCliente = agendamento.getCliente().getCodCliente();
		this.codVeiculo = agendamento.getVeiculo().getCodVeiculo();
		this.marcaVeiculo = agendamento.getVeiculo().getMarca().getMarca_veiculo();
		this.modeloVeiculo = agendamento.getVeiculo().getModeloVeiculo();
		this.valorVeiculo = agendamento.getVeiculo().getPrecoVeiculo();
		this.formaPagamento = agendamento.getFormaPagamento().getDescricaoFormaPagamento();
		this.dataReserva = agendamento.getDataReserva();	
	}

	public Integer getCodAgendamento() {
		return codAgendamento;
	}

	public Integer getCodCliente() {
		return codCliente;
	}

	public Integer getCodVeiculo() {
		return codVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public BigDecimal getValorVeiculo() {
		return valorVeiculo;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public LocalDate getDataReserva() {
		return dataReserva;
	}
	
	public List<AgendamentoDto> converter(List<Agendamento> agendamentos) {
		return agendamentos.stream().map(AgendamentoDto::new).collect(Collectors.toList());
	}
}
