package br.com.rd.queroserdev.devcars.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Endereco;

<<<<<<< HEAD
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
	@Query("SELECT e FROM Endereco e WHERE e.codEndereco = :idEndereco")
	Endereco getIdEndereco(@Param("idEndereco")Integer idEndereco);
	
	List<Endereco> findByCodEndereco(Integer codEndereco);
=======
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	
//	@Query("select e from Endereco e inner join e.clientes c where c.codCliente = :cod_cliente")
//	List<Endereco> findAllByCliente(Integer id);
>>>>>>> ff339d2c8564f0b3876a6b62b53649f88e90de4e


}
