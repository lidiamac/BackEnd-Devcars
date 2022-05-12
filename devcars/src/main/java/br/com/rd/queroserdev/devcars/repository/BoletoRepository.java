package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Boleto;

public interface BoletoRepository extends JpaRepository<Boleto, Integer>{

	Boleto findByCodBoleto(Integer codBoleto);

}
