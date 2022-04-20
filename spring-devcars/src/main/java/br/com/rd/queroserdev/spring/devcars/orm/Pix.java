package br.com.rd.queroserdev.spring.devcars.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pix")
public class Pix {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_pix;
	
	@Column(name = "id_transacao", nullable = false)
	private String idTransacao;

	public Integer getCod_pix() {
		return cod_pix;
	}

	public void setCod_pix(Integer cod_pix) {
		this.cod_pix = cod_pix;
	}

	public String getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(String idTransacao) {
		this.idTransacao = idTransacao;
	}

	@Override
	public String toString() {
		return "Pix [cod_pix=" + cod_pix + ", idTransacao=" + idTransacao + "]";
	}
	
	
	
}