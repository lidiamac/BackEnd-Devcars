package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.devcars.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{



//	Cliente findByCodCliente(Integer codCliente);

	List<Cliente> findAll();

	Cliente findByCodCliente(Integer idCliente);	

	


}
