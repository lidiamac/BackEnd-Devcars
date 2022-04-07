package br.com.queroserdev.spring.devcars.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_status")
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codStatus;
	
	@Column(nullable = false)
	private String statusPedido;
	
	@OneToMany(mappedBy = "status")
	private List<Pedido> pedido;
	
	//MÉTODO GETTERS AND SETTERS

	public Integer getCodStatus() {
		return codStatus;
	}

	public void setCodStatus(Integer codStatus) {
		this.codStatus = codStatus;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	//MÉTODO TOSTRING

	@Override
	public String toString() {
		return "Status [codStatus=" + codStatus + 
				", statusPedido=" + statusPedido + 
				", pedido=" + pedido + 
				"]";
	}

}
