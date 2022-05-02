package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{
	
	
}
