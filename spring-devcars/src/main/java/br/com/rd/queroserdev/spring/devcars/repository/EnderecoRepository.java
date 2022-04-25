package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

	@Query("select e from Endereco e inner join e.clientes c where c.codCliente = :cod_cliente")
	List<Endereco> findAllByCliente(Integer cod_cliente);
}

