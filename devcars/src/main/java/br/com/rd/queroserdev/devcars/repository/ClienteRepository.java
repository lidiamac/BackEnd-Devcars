package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.devcars.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

//	@Query("select c from Cliente c where c.codCliente = :codCliente")
	Cliente findByCodCliente(Integer codCliente);


//	Cliente findByCodCliente(Integer codCliente);

	List<Cliente> findAll();

}
