package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Pedido;
import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;

@Repository
public interface PedidoRepository extends PagingAndSortingRepository<Pedido, Integer>, 
										  JpaSpecificationExecutor<Pedido>	{
	
//	@Query(value="\"select  tp.cod_pedido,\\r\\n\"\r\n"
//			+ "					+ \"		tp.valor_total_pedido,\\r\\n\"\r\n"
//			+ "					+ \"		tp.data_pedido,\\r\\n\"\r\n"
//			+ "					+ \"		tc.nome_cliente,\\r\\n\"\r\n"
//			+ "					+ \"		tc.numero_documento,\\r\\n\"\r\n"
//			+ "					+ \"		tc.telefone_cliente,\\r\\n\"\r\n"
//			+ "					+ \"		tc.email_cliente,\\r\\n\"\r\n"
//			+ "					+ \"		tc.razao_social,\\r\\n\"\r\n"
//			+ "					+ \"		te.cep_endereco,\\r\\n\"\r\n"
//			+ "					+ \"		te.rua_endereco,\\r\\n\"\r\n"
//			+ "					+ \"		te.numero_endereco,\\r\\n\"\r\n"
//			+ "					+ \"		te.bairro,\\r\\n\"\r\n"
//			+ "					+ \"		te.cidade,\\r\\n\"\r\n"
//			+ "					+ \"		te.uf,\\r\\n\"\r\n"
//			+ "					+ \"		tfp.descricao_forma_pagamento,\\r\\n\"\r\n"
//			+ "					+ \"		tf.valor_frete,\\r\\n\"\r\n"
//			+ "					+ \" 		tf.unidade_federativa,\\r\\n\"\r\n"
//			+ "					+ \" 		ts.status,\\r\\n\"\r\n"
//			+ "					+ \" 		tm.marca_veiculo,\\r\\n\"\r\n"
//			+ "					+ \" 		tv.modelo_veiculo,\\r\\n\"\r\n"
//			+ "					+ \"		tv.ano_veiculo,\\r\\n\"\r\n"
//			+ "					+ \"		tv.numero_chassi,\\r\\n\"\r\n"
//			+ "					+ \"		tv.preco_veiculo,\\r\\n\"\r\n"
//			+ "					+ \"		tc2.nome_cor, \\r\\n\"\r\n"
//			+ "					+ \"		tm2.motor_veiculo,\\r\\n\"\r\n"
//			+ "					+ \"		tm2.potencia_cv,\\r\\n\"\r\n"
//			+ "					+ \"		tc3.tipo_combustivel,\\r\\n\"\r\n"
//			+ "					+ \"		tc4.cambio\\r\\n\"\r\n"
//			+ "					+ \"		\\r\\n\"\r\n"
//			+ "					+ \"		\\r\\n\"\r\n"
//			+ "					+ \"		-- tv.marca_veiculo, \\r\\n\"\r\n"
//			+ "					+ \"		\\r\\n\"\r\n"
//			+ "					+ \"		\\r\\n\"\r\n"
//			+ "					+ \"		from tb_pedido tp \\r\\n\"\r\n"
//			+ "					+ \"inner join tb_cliente tc on tp.cod_cliente = tc.cod_cliente\\r\\n\"\r\n"
//			+ "					+ \"inner join tb_endereco te on tp.cod_endereco = te.cod_endereco\\r\\n\"\r\n"
//			+ "					+ \"inner join tb_forma_pagamento tfp on tp.cod_forma_pagamento = tfp.cod_forma_pagamento\\r\\n\"\r\n"
//			+ "					+ \"inner join tb_frete tf on tp.cod_frete = tf.cod_frete\\r\\n\"\r\n"
//			+ "					+ \"inner join tb_status ts on tp.cod_status = ts.cod_status \\r\\n\"\r\n"
//			+ "					+ \"inner join tb_veiculo tv on tp.cod_veiculo = tv.cod_veiculo\\r\\n\"\r\n"
//			+ "					+ \"inner join tb_marca tm on tm.cod_marca = tv.cod_marca\\r\\n\"\r\n"
//			+ "					+ \"inner join tb_cor tc2 on tv.cod_cor = tc2.cod_cor \\r\\n\"\r\n"
//			+ "					+ \"inner join tb_motor tm2 on tv.cod_motor = tm2.cod_motor\\r\\n\"\r\n"
//			+ "					+ \"inner join tb_combustivel tc3 on tv.cod_combustivel = tc3.cod_combustivel \\r\\n\"\r\n"
//			+ "					+ \"inner join tb_cambio tc4 on tv.cod_cambio = tc4.cod_cambio ;\\r\\n\"\r\n"
//			+ "					+ \"\\r\\n\"\r\n"
//			+ "					+ \"\\r\\n\"\r\n"
//			+ "					+ \"		\") ;",  nativeQuery = true )
	
			//List<Pedido> findByvalor_total_pedido();
	
			//List<Pedido> findPedidos(@Param("cod_veiculo")Integer codVeiculo);
	
	
	@Query("select p from Pedido p inner join p.veiculo v where v.codVeiculo = :cod_veiculo")
	List<Pedido> findByIdVeiculo(@Param("cod_veiculo")Integer codVeiculo);

	
	

	//List<Pedido> delete(List<Pedido> pedido1);
}
