package br.com.rd.queroserdev.devcars.controller.form;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.rd.queroserdev.devcars.model.Agendamento;
import br.com.rd.queroserdev.devcars.model.Boleto;
import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.FormaPagamento;
import br.com.rd.queroserdev.devcars.model.Pix;
import br.com.rd.queroserdev.devcars.model.Veiculo;
import br.com.rd.queroserdev.devcars.repository.BoletoRepository;
import br.com.rd.queroserdev.devcars.repository.CartaoRepository;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.FormaPagamentoRepository;
import br.com.rd.queroserdev.devcars.repository.PixRepository;
import br.com.rd.queroserdev.devcars.repository.VeiculoRepository;

public class AgendamentoForm {
	
	private Integer codVeiculo;
	private Integer codCliente;
	private BigDecimal valorAgendamento;
	private Integer codPagamento;
	private Integer codCartao;
	private Integer codBoleto;
	private Integer codPix;
	private LocalDate dataReserva;
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	public Integer getCodVeiculo() {
		return codVeiculo;
	}
	
	public LocalDate getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(String dataReserva) {
		this.dataReserva = LocalDate.parse(dataReserva, formatter);
	}

	public void setCodVeiculo(Integer codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	
	public Integer getCodCliente() {
		return codCliente;
	}
	
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public BigDecimal getValorAgendamento() {
		return valorAgendamento;
	}
	
	public void setValorAgendamento(BigDecimal valorAgendamento) {
		this.valorAgendamento = valorAgendamento;
	}
	
	public Integer getCodPagamento() {
		return codPagamento;
	}
	
	public void setCodPagamento(Integer codPagamento) {
		this.codPagamento = codPagamento;
	}
	
	public Integer getCodCartao() {
		return codCartao;
	}
	
	public void setCodCartao(Integer codCartao) {
		this.codCartao = codCartao;
	}
	
	public Integer getCodBoleto() {
		return codBoleto;
	}
	
	public void setCodBoleto(Integer codBoleto) {
		this.codBoleto = codBoleto;
	}
	
	public Integer getCodPix() {
		return codPix;
	}
	
	public void setCodPix(Integer codPix) {
		this.codPix = codPix;
	}

	public Agendamento converter(VeiculoRepository veiculoRepository,
								 ClienteRepository clienteRepository,
								 FormaPagamentoRepository formaPagamentoRepository,
								 CartaoRepository cartaoRepository,
								 BoletoRepository boletoRepository,
								 PixRepository pixRepository) {
		
		Veiculo veiculo = veiculoRepository.findByCodVeiculo(codVeiculo);
		Cliente cliente = clienteRepository.findByCodCliente(codCliente);
		FormaPagamento tipoPagamento = formaPagamentoRepository.findByCodFormaPagamento(codPagamento);
		Cartao cartao = cartaoRepository.findByCodCartao(codCartao);
		Boleto boleto = boletoRepository.findByCodBoleto(codBoleto);
		Pix pix = pixRepository.getCodPix(codPix);
		
		
		
		return new Agendamento(veiculo, cliente, valorAgendamento, tipoPagamento, cartao, boleto, pix, dataReserva);
	}
	
	
}
