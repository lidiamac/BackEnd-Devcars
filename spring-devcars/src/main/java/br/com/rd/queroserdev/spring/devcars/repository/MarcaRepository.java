package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Marca;
import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;

@Repository
public interface MarcaRepository extends CrudRepository<Marca, Integer>,
										 JpaSpecificationExecutor<Marca> {
	
	List<Marca> findAll(String marca);

	@Query("from Veiculo where marca.marca_veiculo = :marca_veiculo")
	List<Marca> getByBrand(String marca_veiculo);

	
}
