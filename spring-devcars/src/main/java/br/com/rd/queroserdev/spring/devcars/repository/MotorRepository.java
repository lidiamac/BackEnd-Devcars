package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.FormaPagamento;
import br.com.rd.queroserdev.spring.devcars.orm.Motor;

@Repository
public interface MotorRepository extends JpaRepository<Motor, Integer>,
										 CrudRepository<Motor, Integer>{
	
	List<Motor> findAll();

}
