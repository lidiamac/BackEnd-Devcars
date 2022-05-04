package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.rd.queroserdev.devcars.model.Favorito;


public interface FavoritoRepository extends JpaRepository <Favorito, Integer>{

	
//	List<Favorito> findAll();
	
	
	
}
