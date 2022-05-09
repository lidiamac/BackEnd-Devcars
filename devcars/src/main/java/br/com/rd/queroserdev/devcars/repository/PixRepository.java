package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Pix;

public interface PixRepository extends JpaRepository<Pix, Integer>{
	
	@Query("SELECT p FROM Pix p WHERE p.cod_pix = :id")
	Pix getCodPix(@Param("id")Integer idPix);

}
