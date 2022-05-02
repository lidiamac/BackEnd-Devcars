package br.com.rd.queroserdev.devcars.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{
	
	@Query("SELECT v FROM Veiculo v WHERE v.marca.marca_veiculo = :nomeMarca")
	List<Veiculo> getByNomeMarca(@Param("nomeMarca") String nomeMarca);

	@Query("SELECT a FROM Veiculo a join a.marca.marca_veiculo = :nomeMarca AND " +
										"a.cor.nome_cor = :nomeCor AND " +
										"a.motor.motorVeiculo = :nomeMotor AND " +
										"a.motor.potenciaCv = :potencia AND " +
										"a.cambio.cambio = :nomeCambio AND " +
										"a.combustivel.tipo_combustivel = :combustivel")
	List<Veiculo> getAllVeiculos(@Param("nomeMarca") String nomeMarca,
								 @Param("nomeCor") String nomeCor,
								 @Param("nomeMotor") String nomeMotor,
								 @Param("potencia") String potencia, 
								 @Param("nomeCambio") String cambio, 
								 @Param("combustivel") String combustivel);
	
	
}
