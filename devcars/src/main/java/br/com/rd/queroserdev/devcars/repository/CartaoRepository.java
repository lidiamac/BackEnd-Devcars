package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Integer>{

	Cartao findByNumeroCartao(String numeroCartao);
	
	
	List<Cartao> findByCliente_CodCliente(Integer id);



}
