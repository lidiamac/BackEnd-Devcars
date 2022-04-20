package br.com.rd.queroserdev.spring.devcars.orm;

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

	
	//MÉTODO GETTERS AND SETTERS
	
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

	//MÉTODO TOSTRING
	
	@Override
	public String toString() {
		return "Motor [codMotor=" + this.codMotor + 
				", motorVeiculo=" + this.motorVeiculo + 
				", potenciaCv=" + this.potenciaCv
				+ ", veiculo=" + this.veiculo + 
				"]";
	}

}
