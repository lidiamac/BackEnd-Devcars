package br.com.rd.queroserdev.devcars.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.rd.queroserdev.devcars.model.ModalidadeCartao;

public interface ModalidadeCartaoRepository extends CrudRepository<ModalidadeCartao, Integer> {

	@Query("select m.codModalidadeCartao from ModalidadeCartao m where m.codModalidadeCartao = :codModalidade")
	Integer findByCodModalidadeCartao( Integer codModalidade);

//	ModalidadeCartao findByDescricaoModalidadeCartao(String modalidadeCartao);

	
	
	
}
