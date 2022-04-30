package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>,
										   CrudRepository<Veiculo, Integer> {

	List<Veiculo> findAll();

	
}
