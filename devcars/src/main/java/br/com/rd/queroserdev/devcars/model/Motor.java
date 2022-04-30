package br.com.rd.queroserdev.devcars.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_motor")
public class Motor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codMotor;
	
	@Column(nullable = false)
	private String motorVeiculo;
	
	@Column(nullable = false)
	private String potenciaCv;
	
	@OneToMany(mappedBy = "motor")
	private List<Veiculo> veiculo;

	public Integer getCodMotor() {
		return codMotor;
	}

	public void setCodMotor(Integer codMotor) {
		this.codMotor = codMotor;
	}

	public String getMotorVeiculo() {
		return motorVeiculo;
	}

	public void setMotorVeiculo(String motorVeiculo) {
		this.motorVeiculo = motorVeiculo;
	}

	public String getPotenciaCv() {
		return potenciaCv;
	}

	public void setPotenciaCv(String potenciaCv) {
		this.potenciaCv = potenciaCv;
	}

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
	
}
