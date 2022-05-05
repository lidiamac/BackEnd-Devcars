package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.FormaPagamento;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Integer>{

	FormaPagamento findByCodFormaPagamento(Integer idPagamento);

}
