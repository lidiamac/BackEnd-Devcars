package br.com.rd.queroserdev.devcars.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.Cliente;
import br.com.rd.queroserdev.devcars.model.Endereco;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	List<Cliente> findAll();

	Cliente findByCodCliente(Integer idCliente);
	
//	List<Cliente> findById();
	
//		
//	@Query("select e from Endereco e join e.clientes c where c.idCliente = e.clientes.codCliente")
//	List<Endereco> findAllByCliente(Integer id);

	
//	@Query("select c from Cartao e join e.clientes c where c.idCliente = e.clientes.codCliente")
//	List<Cartao> findByCartoesClienteCodCliente(Integer id);

}
