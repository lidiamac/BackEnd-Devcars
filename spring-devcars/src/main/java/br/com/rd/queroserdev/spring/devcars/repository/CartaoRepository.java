package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Cartao;
import br.com.rd.queroserdev.spring.devcars.orm.Endereco;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Integer>{
	             
//	List<Cartao> findAll();
	
	@Query("select c from Cartao c inner join c.clientes cl where cl.codCliente = :cod_cliente")
	List<Cartao> findAllByCartao(Integer cod_cliente);
	
	
//	@Query("select tc.cod_cartao, tc.nome_titular, tc.numero_cartao, tc.validade_cartao, tc2.nome_cliente \r\n"
//			+ "FROM tb_cartao tc \r\n"
//			+ "INNER JOIN tb_cliente tc2  ON tc.cod_cartao = tc2.nome_cliente")
//	List<Cartao> findAllByCartao(Integer cod_cliente);
	
}



 