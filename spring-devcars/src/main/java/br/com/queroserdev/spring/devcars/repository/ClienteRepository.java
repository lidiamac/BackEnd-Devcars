package br.com.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.queroserdev.spring.devcars.orm.Cartao;
import br.com.queroserdev.spring.devcars.orm.Cliente;
import br.com.queroserdev.spring.devcars.orm.Endereco;
import br.com.queroserdev.spring.devcars.orm.Endereco;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	@Query("select e from Endereco e join e.clientes c where c.idCliente = e.clientes.codCliente")
	List<Endereco> findAllByCliente(String Cliente);

	// Criando a listagem de Cartoes
	@Query("select e from Cartao c join e.clientes c where c.codCliente = e.clientes.codCliente")	
	List<Cartao> findAllByCartao(String Cartao);

}
