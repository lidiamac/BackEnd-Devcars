package br.com.rd.queroserdev.devcars.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Endereco;


public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
	@Query("SELECT e FROM Endereco e WHERE e.codEndereco = :idEndereco")
	Endereco getIdEndereco(@Param("idEndereco")Integer idEndereco);
	
	List<Endereco> findByCodEndereco(Integer codEndereco);


}
