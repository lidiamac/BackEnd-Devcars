package br.com.queroserdev.spring.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.queroserdev.spring.devcars.orm.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>,
											JpaRepository<Cliente, Integer>{

}
