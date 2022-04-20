package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Marca;

@Repository
public interface MarcaRepository extends CrudRepository<Marca, Integer>,
										 JpaSpecificationExecutor<Marca> {
	
	List<Marca> findAll();

	@Query("from Veiculo where marca.marca_veiculo = :marca_veiculo")
	List<Marca> getByBrand(@Param("marca_veiculo")String marca_veiculo);

	
}
