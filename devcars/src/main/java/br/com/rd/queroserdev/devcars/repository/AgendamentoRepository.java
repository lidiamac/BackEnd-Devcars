package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer>{

	List<Agendamento> findByCliente_CodCliente(Integer id);


}
