package br.com.queroserdev.spring.devcars.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.queroserdev.spring.devcars.orm.Cambio;

@Repository
public interface CambioRepository extends CrudRepository<Cambio, Integer> {

}
