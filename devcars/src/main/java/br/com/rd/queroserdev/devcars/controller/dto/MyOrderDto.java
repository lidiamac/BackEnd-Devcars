package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rd.queroserdev.devcars.model.Endereco;
import br.com.rd.queroserdev.devcars.model.FormaPagamento;
import br.com.rd.queroserdev.devcars.model.Marca;
import br.com.rd.queroserdev.devcars.model.Pedido;
import br.com.rd.queroserdev.devcars.model.Status;
import br.com.rd.queroserdev.devcars.model.Veiculo;

public class MyOrderDto {

	private Integer id;
	private String status;
	private String marca;
	private String modeloVeiculo;
	private BigDecimal valorFrete;
	private BigDecimal valorVeiculo;
	private String cep;
	private String logradouro;
	private String numeroEndereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String formaPagamento;
	private BigDecimal totalPedido;
	

	public MyOrderDto(Pedido p) {
		this.id = p.getCodPedido();
		this.status = p.getStatus().getStatusPedido();
		this.marca = p.getVeiculo().getMarca().getMarca_veiculo();
		this.modeloVeiculo = p.getVeiculo().getModeloVeiculo();
		this.valorFrete = p.getFrete().getValorFrete();
		this.valorVeiculo = p.getVeiculo().getPrecoVeiculo();
		this.cep = p.getEndereco().getCepEndereco();
		this.logradouro = p.getEndereco().getRuaEndereco();
		this.bairro = p.getEndereco().getBairro();
		this.cidade = p.getEndereco().getCidade();
		this.estado = p.getEndereco().getUf();
		this.formaPagamento = p.getFormaPagamento().getDescricaoFormaPagamento();
		this.totalPedido = p.getValorTotalPedido();
		
		
	}

	public Integer getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public String getMarca() {
		return marca;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public BigDecimal getValorVeiculo() {
		return valorVeiculo;
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public BigDecimal getTotalPedido() {
		return totalPedido;
	}
	
	

}
