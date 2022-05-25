package br.com.rd.queroserdev.devcars.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.rd.queroserdev.devcars.model.Endereco;
import br.com.rd.queroserdev.devcars.model.Pedido;

public class ResumoPedidoDTO {
	private Integer codPedido;
	
	private Integer codVeiculo; 
	private String marcaVeiculo;
	private String modeloVeiculo;
	private Integer ano;
	private String  cor;
	
	private Integer codEndereco;
	private String cepEndereco;
	private String ruaEndereco;
	private String complemento;
	private String numeroEndereco;
	private String bairro;
	private String cidade;
	private String uf;
	
	private String formaPagamento;
	private BigDecimal valorTotal;
	private LocalDate dataPedido;
//	
//	private String numeroCartao;
//	private String codBarras;
//	private String pix;
//	
	

	
	public ResumoPedidoDTO(Pedido pedido) {
		this.codPedido = pedido.getCodPedido();
		
		this.codVeiculo = pedido.getVeiculo().getCodVeiculo();
		this.marcaVeiculo = pedido.getVeiculo().getMarca().getMarca_veiculo();
		this.modeloVeiculo = pedido.getVeiculo().getModeloVeiculo();
		this.ano = pedido.getVeiculo().getAnoVeiculo();
		this.cor = pedido.getVeiculo().getCor().getNome_cor();
		
		this.codEndereco = pedido.getEndereco().getCodEndereco();
		this.cepEndereco = pedido.getEndereco().getCepEndereco();
		this.ruaEndereco = pedido.getEndereco().getRuaEndereco();
		this.complemento = pedido.getEndereco().getComplemento();
		this.numeroEndereco = pedido.getEndereco().getNumeroEndereco();
		this.bairro = pedido.getEndereco().getBairro();
		this.cidade = pedido.getEndereco().getCidade();
		this.uf = pedido.getEndereco().getUf();
		
		this.formaPagamento = pedido.getFormaPagamento().getDescricaoFormaPagamento();
		
		this.valorTotal = pedido.getValorTotalPedido();
		this.dataPedido = pedido.getDataPedido();
		
//		this.numeroCartao = pedido.getCartao().getNumeroCartao();
//		this.codBarras = pedido.getBoleto().getNumeroCodBarra();
//		this.pix = pedido.getPix().getIdTransacao();
	}
	
	
	
	public Integer getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}
	public Integer getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(Integer codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
//	public String getNumeroCartao() {
//		return numeroCartao;
//	}
//	public void setNumeroCartao(String numeroCartao) {
//		this.numeroCartao = numeroCartao;
//	}
//	public String getCodBarras() {
//		return codBarras;
//	}
//	public void setCodBarras(String codBarras) {
//		this.codBarras = codBarras;
//	}
//	public String getPix() {
//		return pix;
//	}
//	public void setPix(String pix) {
//		this.pix = pix;
//	}
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public Integer getCodEndereco() {
		return codEndereco;
	}
	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}
	public String getCepEndereco() {
		return cepEndereco;
	}
	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}
	public String getRuaEndereco() {
		return ruaEndereco;
	}
	public void setRuaEndereco(String ruaEndereco) {
		this.ruaEndereco = ruaEndereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumeroEndereco() {
		return numeroEndereco;
	}
	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}	
	
}
