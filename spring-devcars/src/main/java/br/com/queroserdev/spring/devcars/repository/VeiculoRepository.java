package br.com.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.queroserdev.spring.devcars.orm.Veiculo;

@Repository
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Integer>,
										   JpaSpecificationExecutor<Veiculo> {

	
//	@Query(value="select cod_veiculo, marca_veiculo\r\n"
//			  	 + "from tb_veiculo tv\r\n"
//			     + "inner join tb_marca tm on tv.cod_marca = tm.cod_marca", nativeQuery = true)
	List<Veiculo> findByMarca(String marca);
	
	List<Veiculo> findByModelo(String modelo);
	
	List<Veiculo> findByAno(Integer ano);
	
	
	
}
