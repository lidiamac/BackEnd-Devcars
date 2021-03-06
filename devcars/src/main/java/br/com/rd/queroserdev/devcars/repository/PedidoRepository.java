package br.com.rd.queroserdev.devcars.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{


		Pedido findByCodPedido(Integer idPedido);	
		

		List<Pedido> findByClienteCodCliente(Integer codCliente);
}
