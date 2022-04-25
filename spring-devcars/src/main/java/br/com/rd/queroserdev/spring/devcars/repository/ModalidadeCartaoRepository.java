package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.spring.devcars.orm.ModalidadeCartao;

public interface ModalidadeCartaoRepository extends CrudRepository<ModalidadeCartao, Integer> {

	
	List<ModalidadeCartao> findById(@Param("cod_modalidade") ModalidadeCartao modalidadeCartao);
}
