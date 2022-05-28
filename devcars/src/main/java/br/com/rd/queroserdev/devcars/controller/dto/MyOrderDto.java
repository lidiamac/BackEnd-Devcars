package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.rd.queroserdev.devcars.model.Pedido;

public class MyOrderDto {

	private Integer id;
	private String status;
	private String marca;
	private String modeloVeiculo;
	private String linkImagemVeiculo;
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
	private LocalDate dataPedido;
	private LocalDate dataEnvio;
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	

	public MyOrderDto(Pedido p) {
		this.id = p.getCodPedido();
		this.status = p.getStatus().getStatusPedido();
		this.marca = p.getVeiculo().getMarca().getMarca_veiculo();
		this.modeloVeiculo = p.getVeiculo().getModeloVeiculo();
		this.linkImagemVeiculo = p.getVeiculo().getImagem();
		this.valorFrete = p.getFrete().getValorFrete();
		this.valorVeiculo = p.getVeiculo().getPrecoVeiculo();
		this.cep = p.getEndereco().getCepEndereco();
		this.logradouro = p.getEndereco().getRuaEndereco();
		this.bairro = p.getEndereco().getBairro();
		this.cidade = p.getEndereco().getCidade();
		this.estado = p.getEndereco().getUf();
		this.formaPagamento = p.getFormaPagamento().getDescricaoFormaPagamento();
		this.totalPedido = p.getValorTotalPedido();
		this.dataPedido = p.getDataPedido();
		this.dataEnvio = p.getDataEnvio();
		
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

	public String getLinkImagemVeiculo() {
		return linkImagemVeiculo;
	}

	@JsonFormat(pattern = "dd/MM/yyyy")
	public LocalDate getDataPedido() {
//		String dataPedidoString = dataPedido.toString();
//		dataPedido = LocalDate.parse(dataPedidoString,formatter);
		return dataPedido;
	}

	public LocalDate getDataEnvio() {
		return dataEnvio;
	}
	
	
	public static List<MyOrderDto> converter(List<Pedido> marcas) {
		return marcas.stream().map(MyOrderDto::new).collect(Collectors.toList());
	}
	

}
