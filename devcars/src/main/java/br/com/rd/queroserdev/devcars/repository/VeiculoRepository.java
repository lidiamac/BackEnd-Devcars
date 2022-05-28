package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{
	
	@Query("SELECT m FROM Veiculo m WHERE m.marca.marca_veiculo = :marcaVeiculo")
	List<Veiculo> getByMarcaVeiculo(@Param("marcaVeiculo") String marcaVeiculo);
	
	@Query("SELECT v FROM Veiculo v WHERE v.marca.cod_marca = :codMarca")
	List<Veiculo> findAllByMarcaVeiculo(@Param("codMarca")Integer codMarca);
	
	List<Veiculo> findByModeloVeiculo(String modelo);
	
//	List<Veiculo> getByCodMarca(@Param("codMarca"))


	List<Veiculo> findByAnoVeiculo(Integer ano);

	
	@Query("SELECT mm FROM Veiculo mm WHERE mm.marca.marca_veiculo = :marcaVeiculo AND " +
											"modeloVeiculo = :nomeModelo")
	List<Veiculo> getByMarcaModelo(@Param("marcaVeiculo") String marcaVeiculo, 
								   @Param("nomeModelo") String nomeModelo);


	Veiculo findByCodVeiculo(Integer idVeiculo);

	
	@Query("SELECT ma FROM Veiculo ma WHERE ma.modeloVeiculo = :modelo AND " +
											"ma.anoVeiculo = :ano")
	List<Veiculo> getByModeloAno(@Param("modelo")String modelo, 
								@Param("ano")Integer ano);

	
	@Query("SELECT moa FROM Veiculo moa WHERE moa.marca.marca_veiculo = :marcaVeiculo AND " +
											  "moa.anoVeiculo = :ano")
	List<Veiculo> getByMarcaAno(@Param("marcaVeiculo")String marcaVeiculo,
								@Param("ano")Integer ano);

	
	List<Veiculo> findByDestaqueTrue();
	
	
	
	
}
