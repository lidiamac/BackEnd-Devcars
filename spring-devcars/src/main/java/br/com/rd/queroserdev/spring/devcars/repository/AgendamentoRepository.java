package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Agendamento;
import br.com.rd.queroserdev.spring.devcars.orm.Cliente;
import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;

@Repository
public interface AgendamentoRepository extends CrudRepository<Agendamento, Integer> {

	//Método de busca em agendamento que busca nome do cliente.
//	@Query(value="select ta.cod_agendamento, tc.nome_cliente"
//				+ "from tb_agendamento ta"
//				+ "inner join tb_cliente tc on ta.cod_agendamento = tc.nome_cliente", nativeQuery = true)
//	List<Agendamento> findByNome(@Param("nome_cliente") Cliente nomeCliente);
	
	
	//Método de busca em agendamento que busca id do cliente.
	@Query("select a from Agendamento a inner join a.cliente c where c.codCliente = :cod_cliente")
	List<Agendamento> findByIdCliente(@Param("cod_cliente")Integer codCliente);
	
	
	List<Agendamento> findByDataReserva(@Param("data_reserva") Agendamento dataReserva);
	
	
	//Método de busca em agendamento que busca modelo de veículo.
//	@Query(value="select ta.cod_agendamento, tv.modelo_veiculo"
//				+ "from tb_agendamento ta"
//				+ "inner join tb_veiculo tv on ta.cod_agendamento = tv.modelo_veiculo", nativeQuery = true)
//	List<Agendamento> findByModeloVeiculo(@Param("modelo_veiculo") Veiculo modeloVeiculo);
	
	
	//Método de busca em agendamento que busca id de veículo.
	@Query("select a from Agendamento a inner join a.veiculos v where v.codVeiculo = :cod_veiculo")
	List<Agendamento> findByIdVeiculo(@Param("cod_veiculo")Integer codVeiculo);
}
