package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.rd.queroserdev.devcars.model.Agendamento;

public class ResumoAgendamentoDto {
	
	private Integer codAgendamento;
	private String marcaVeiculo;
	private String modeloVeiculo;
	private LocalDate dataAgendamento;
	private BigDecimal valorVeiculo;
	private BigDecimal valorAgendamento;
	
	public ResumoAgendamentoDto(Agendamento agendamento) {
		this.codAgendamento = agendamento.getCodAgendamento();
		this.marcaVeiculo = agendamento.getVeiculo().getMarca().getMarca_veiculo();
		this.modeloVeiculo = agendamento.getVeiculo().getModeloVeiculo();
		this.dataAgendamento = agendamento.getDataReserva();
		this.valorVeiculo = agendamento.getVeiculo().getPrecoVeiculo();
		this.valorAgendamento = agendamento.getTaxaAgendamento();
	}
	
	public Integer getCodAgendamento() {
		return codAgendamento;
	}
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}
	public BigDecimal getValorVeiculo() {
		return valorVeiculo;
	}
	public BigDecimal getValorAgendamento() {
		return valorAgendamento;
	}
	
	
}
