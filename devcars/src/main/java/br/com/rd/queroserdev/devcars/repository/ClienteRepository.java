package br.com.rd.queroserdev.devcars.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.devcars.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	List<Cliente> findAll();

	Cliente findByCodCliente(Integer idCliente);	
	
	Optional<Cliente> findByEmailCliente(String email);
	
//	Cliente findByEmailCliente(String emailCliente);

	Optional<Cliente> findByNomeCliente(String nome);
	
	@Query("SELECT e FROM Cliente e WHERE e.emailCliente = :emailCliente")
	Cliente getClienteByEmail(@Param("emailCliente")String emailCliente);


}
