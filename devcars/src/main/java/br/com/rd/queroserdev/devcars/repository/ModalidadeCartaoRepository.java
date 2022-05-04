package br.com.rd.queroserdev.devcars.repository;


import org.springframework.data.repository.CrudRepository;

import br.com.rd.queroserdev.devcars.model.ModalidadeCartao;

public interface ModalidadeCartaoRepository extends CrudRepository<ModalidadeCartao, Integer> {

//	List<ModalidadeCartao> findByCodModalidadeCartao(Integer codModalidadeCartao);

//	ModalidadeCartao findByDescricaoModalidadeCartao(String modalidadeCartao);
	
//	ModalidadeCartao findByCodModalidadeCartao(Integer codModalidadeCartao);
	
	
	ModalidadeCartao getById(Integer codModalidadeCartao);
	
}
