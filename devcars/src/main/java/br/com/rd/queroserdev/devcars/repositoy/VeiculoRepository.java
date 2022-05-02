package br.com.rd.queroserdev.devcars.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{
	
	@Query("SELECT m FROM Veiculo m WHERE m.marca.marca_veiculo = :nomeMarca")
	List<Veiculo> getByNomeMarca(@Param("nomeMarca") String nomeMarca);

	
	List<Veiculo> findByModeloVeiculo(String modelo);


	List<Veiculo> findByAnoVeiculo(Integer ano);

	
	@Query("SELECT mm FROM Veiculo mm WHERE mm.marca.marca_veiculo = :nomeMarca AND" +
											"modeloVeiculo = :nomeModelo")
	List<Veiculo> getByMarcaModelo(@Param("nomeMarca") String nomeMarca, 
								   @Param("nomeModelo") String nomeModelo);


	
	
	
	
	
}
