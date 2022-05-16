package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	
	Pedido findByCodPedido(Integer idPedido);
	
}
