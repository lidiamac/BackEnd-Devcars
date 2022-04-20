package br.com.rd.queroserdev.spring.devcars.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Agendamento;


@Repository
public interface AgendamentoRepository  extends CrudRepository<Agendamento, Integer> {

}
