package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.ModalidadeCartao;

public interface ModalidadeCartaoRepository extends JpaRepository<ModalidadeCartao, Integer> {

//	@Query("select m from ModalidadeCartao m where m.codModalidadeCartao = :codModalidadeCartao")
	ModalidadeCartao findByCodModalidadeCartao(Integer codModalidadeCartao);


	
}
