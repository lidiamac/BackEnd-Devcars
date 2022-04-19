package br.com.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.queroserdev.spring.devcars.orm.Cliente;
import br.com.queroserdev.spring.devcars.orm.Endereco;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	List<Endereco> findByCliente(String Cliente);

}
