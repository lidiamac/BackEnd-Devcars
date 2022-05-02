package br.com.rd.queroserdev.devcars.repositoy;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.devcars.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	List<Cliente> findAll();
	
//	List<Cliente> findById();
	
//		
//	@Query("select e from Endereco e join e.clientes c where c.idCliente = e.clientes.codCliente")
//	List<Endereco> findAllByCliente(String Cliente);

	

}
