package br.com.rd.queroserdev.devcars.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	
//	@Query("select e from Endereco e inner join e.clientes c where c.codCliente = :cod_cliente")
//	List<Endereco> findAllByCliente(Integer id);
	
	@Query("SELECT e FROM Endereco e WHERE e.codEndereco = :codEndereco")
	Endereco getCodEndereco(@Param("codEndereco")Integer codEndereco);
	
	List<Endereco> findByCodEndereco(Integer codEndereco);


}

