package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Repository;
>>>>>>> ff339d2c8564f0b3876a6b62b53649f88e90de4e

import br.com.rd.queroserdev.devcars.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

<<<<<<< HEAD

//	Cliente findByCodCliente(Integer codCliente);

	List<Cliente> findAll();

	Cliente findByCodCliente(Integer idCliente);	
=======
//	@Query("select c from Cliente c where c.codCliente = :codCliente")
	Cliente findByCodCliente(Integer codCliente);

	
>>>>>>> ff339d2c8564f0b3876a6b62b53649f88e90de4e

}
