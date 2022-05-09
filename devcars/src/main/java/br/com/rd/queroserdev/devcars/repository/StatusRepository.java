package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Status;

public interface StatusRepository extends JpaRepository<Status, Integer>{

	Status findByCodStatus(Integer idStatus);

}
