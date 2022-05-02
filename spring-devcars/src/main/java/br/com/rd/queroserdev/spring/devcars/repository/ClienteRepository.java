package br.com.rd.queroserdev.spring.devcars.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Cliente;
import br.com.rd.queroserdev.spring.devcars.orm.Endereco;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>,
											CrudRepository<Cliente, Integer>{

	List<Cliente> findAll();


	
	
	@Query("select e from Endereco e join e.clientes c where c.codCliente = :id")
	List<Endereco> findAllByCliente(Integer id);
	

		
//	@Query("select e from Endereco e join e.clientes c where c.codCliente = :id")
//	List<Endereco> findAllByCliente(Integer id);
	
//		
//	@Query("select e from Endereco e join e.clientes c where c.idCliente = e.clientes.codCliente")
//	List<Endereco> findAllByCliente(String Cliente);


}
