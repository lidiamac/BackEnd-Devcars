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

	//Método que busca todos os cartões de um cliente em específico pelo nome.
	@Query(value="SELECT tc.nome_cliente, tc2.cod_cartao, tc2.nome_titular, "
			+ "tc2.numero_cartao, tc2.validade_cartao\n"
			+ "FROM tb_cliente tc INNER JOIN tb_cartao tc2 "
			+ "ON tc.cod_cliente = tc2.cod_cartao ;", nativeQuery = true)
	List<Cartao> findByCliente(@Param("cod_cliente")Integer cliente);
	
	
//	@Query(value="select Cartao where ",)
//	List<Cartao> orderBy(int codCartao) ;
	
}
