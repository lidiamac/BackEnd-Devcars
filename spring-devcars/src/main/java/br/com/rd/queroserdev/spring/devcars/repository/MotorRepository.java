package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Motor;

@Repository
public interface MotorRepository extends CrudRepository<Motor, Integer>, JpaSpecificationExecutor<Motor> {

	List<Motor> findAll(String motor);

	@Query("from Veiculo where motor.motor_veiculo = :motor_veiculo")
	List<Motor> getByMotor(String motor_veiculo);

}
