package br.com.rd.queroserdev.spring.devcars.dto;

import java.util.Date;

import br.com.rd.queroserdev.spring.devcars.orm.Cliente;

public class RequisicaoClienteFisico extends RequisicaoCliente{
	private String nomeCliente;
	private Date dataNascimento;
	
	
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}





	public Cliente toCliente() {
		Cliente cliente = new Cliente();
		cliente.setTipoDocumento("CPF");
		cliente.setNumeroDocumento(getNumeroDocumento()); 
		cliente.setEmailCliente(getEmailCliente());
		cliente.setTelefoneCliente(getTelefoneCliente()); 
		cliente.setSenhaCliente(getSenhaCliente());
		cliente.setNomeCliente(nomeCliente);
		cliente.setDataNascimento(dataNascimento);
		return cliente;
	}
}
