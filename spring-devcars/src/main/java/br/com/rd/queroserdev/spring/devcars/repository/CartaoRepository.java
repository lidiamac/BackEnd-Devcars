package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao,Long>,
										CrudRepository<Cartao,Long>{
	
//	@Query(value="select tc.cod_cliente, tc.nome_cliente, tc2.cod_cartao, tc2.nome_titular,"
//			+ " tc2.numero_cartao, tc2.validade_cartao\n"
//			+ "FROM tb_cliente tc INNER JOIN tb_cartao tc2 ON "
//			+ "tc.nome_cliente = tc2.cod_cartao")
//	List<Cartao> findByCartao(@Param("nome_cliente") String cliente); // Busca sera por nome 
	
//	
	@Query(value = "select tc.cod_cliente, tc.nome_cliente, tc2.cod_cartao, tc2.nome_titular,"
	+ " tc2.numero_cartao, tc2.validade_cartao\n"
	+ "FROM tb_cliente tc INNER JOIN tb_cartao tc2 ON "
	+ "tc.nome_cliente = tc2.cod_cartao")
	List<Cartao> findByCartao(@Param("nome_cliente") String cliente); 
//	
	
//	List<Cartao> findAll();
	
}

