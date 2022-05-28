package br.com.rd.queroserdev.devcars.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Frete;

public interface FreteRepository extends JpaRepository<Frete, Integer>{
	
	@Query("SELECT f FROM Frete f WHERE f.codFrete = :codFrete")
	Frete getCodFrete(@Param("codFrete")Integer idFrete);

	Optional<Frete> findByUnidadeFederativa(String UF);
}
