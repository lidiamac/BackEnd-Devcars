package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.rd.queroserdev.devcars.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {

	@Query(value = "SELECT * FROM tb_marca", nativeQuery = true)
	List<Marca> findAll();

}
