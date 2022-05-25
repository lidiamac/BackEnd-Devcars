package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.rd.queroserdev.devcars.model.Pedido;

public class PedidoDto {
	
	private Integer codPedido;
	private Integer codCliente;
	private Integer codEndereco;
	private Integer codPagamento;
	private Integer codFrete;
	private BigDecimal valorTotal;
	private Integer codStatus;
	private LocalDate dataPedido;
	

	public PedidoDto(Pedido pedido) {
		this.codPedido = pedido.getCodPedido();
		this.codCliente = pedido.getCliente().getCodCliente();
		this.codEndereco = pedido.getEndereco().getCodEndereco();
		this.codPagamento = pedido.getFormaPagamento().getCodFormaPagamento();
		this.codFrete = pedido.getFrete().getCod_frete();
		this.valorTotal = pedido.getValorTotalPedido();
		this.codStatus = pedido.getStatus().getCodStatus();
		this.dataPedido = pedido.getDataPedido();
	}
	
	public Integer getCodPedido() {
		return codPedido;
	}
	public Integer getCodCliente() {
		return codCliente;
	}
	public Integer getCodEndereco() {
		return codEndereco;
	}
	public Integer getCodPagamento() {
		return codPagamento;
	}
	public Integer getCodFrete() {
		return codFrete;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public Integer getCodStatus() {
		return codStatus;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}
	
	
}
