package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.devcars.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

//	@Query("select c from Cliente c where c.codCliente = :codCliente")
	Cliente findByCodCliente(Integer codCliente);
	

}
