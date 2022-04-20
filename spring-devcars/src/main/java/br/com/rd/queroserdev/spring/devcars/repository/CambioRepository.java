package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Cambio;

@Repository
public interface CambioRepository extends CrudRepository<Cambio, Integer>, JpaSpecificationExecutor<Cambio> {

	List<Cambio> findAll();

	@Query("from Veiculo where cambio.cambio_veiculo = :cambio_veiculo")
	List<Cambio> getByCambio(@Param("cambio_veiculo")String cambio_veiculo);
	
}
