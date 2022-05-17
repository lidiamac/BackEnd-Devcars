package br.com.rd.queroserdev.devcars.controller.form;

import java.math.BigDecimal;

import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.Endereco;
import br.com.rd.queroserdev.devcars.model.FormaPagamento;
import br.com.rd.queroserdev.devcars.model.Frete;
import br.com.rd.queroserdev.devcars.model.Pedido;
import br.com.rd.queroserdev.devcars.model.Status;
import br.com.rd.queroserdev.devcars.model.Veiculo;
import br.com.rd.queroserdev.devcars.repository.ClienteRepository;
import br.com.rd.queroserdev.devcars.repository.EnderecoRepository;
import br.com.rd.queroserdev.devcars.repository.FormaPagamentoRepository;
import br.com.rd.queroserdev.devcars.repository.FreteRepository;
import br.com.rd.queroserdev.devcars.repository.StatusRepository;
import br.com.rd.queroserdev.devcars.repository.VeiculoRepository;

public class PedidoForm {
	
	private Integer codCliente;
	private Integer codVeiculo;
	private Integer codEndereco;
	private Integer codPagamento;
	private Integer codFrete;
	private BigDecimal valor;
	private Integer codStatus;
	
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	public Integer getCodVeiculo() {
		return codVeiculo;
	}
	public void setCodVeiculo(Integer codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	public Integer getCodEndereco() {
		return codEndereco;
	}
	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}
	public Integer getCodPagamento() {
		return codPagamento;
	}
	public void setCodPagamento(Integer codPagamento) {
		this.codPagamento = codPagamento;
	}
	public Integer getCodFrete() {
		return codFrete;
	}
	public void setCodFrete(Integer codFrete) {
		this.codFrete = codFrete;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Integer getCodStatus() {
		return codStatus;
	}
	public void setCodStatus(Integer codStatus) {
		this.codStatus = codStatus;
	}
	public Pedido converter(ClienteRepository clienteRepository,
							VeiculoRepository veiculoRepository,
							EnderecoRepository enderecoRepository,
							FormaPagamentoRepository formaPagamentoRepository,
							FreteRepository freteRepository,
							StatusRepository statusRepository) {
		
		Cliente cliente = clienteRepository.findByCodCliente(codCliente);
		Veiculo veiculo = veiculoRepository.findByCodVeiculo(codVeiculo);
		Endereco endereco = enderecoRepository.getCodEndereco(codEndereco);
		FormaPagamento pagamento = formaPagamentoRepository.findByCodFormaPagamento(codPagamento);
		Frete frete = freteRepository.getCodFrete(codFrete);
		Status status = statusRepository.findByCodStatus(codStatus);
		
		return new Pedido(cliente, veiculo, endereco, pagamento, frete, valor, status);
	}
	
	
	
	
}
