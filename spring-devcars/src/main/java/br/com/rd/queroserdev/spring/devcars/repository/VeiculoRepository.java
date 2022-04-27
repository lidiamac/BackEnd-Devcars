package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Cambio;
import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;

@Repository
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Integer>,
										   JpaSpecificationExecutor<Veiculo> {
	
	List<Veiculo> findAll();
	
}