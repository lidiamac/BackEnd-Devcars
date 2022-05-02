package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Integer>{

}
