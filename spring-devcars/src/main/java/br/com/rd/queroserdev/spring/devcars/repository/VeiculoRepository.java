package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import br.com.rd.queroserdev.spring.devcars.orm.Cambio;
=======
import br.com.rd.queroserdev.spring.devcars.orm.Marca;
import br.com.rd.queroserdev.spring.devcars.orm.Pedido;
>>>>>>> e1938c8230813a1e8d1eb3774f52d62c4baff1df
import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;

@Repository
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Integer>,
										   JpaSpecificationExecutor<Veiculo> {
<<<<<<< HEAD
	
	List<Veiculo> findAll();
	
}
=======

	
//	@Query(value="select cod_veiculo, marca_veiculo\r\n"
//			  	 + "from tb_veiculo tv\r\n"
//			     + "inner join tb_marca tm on tv.cod_marca = tm.cod_marca", nativeQuery = true)
//	List<Veiculo> findByMarca(String marca);
//	
	List<Veiculo> findAll();
	
	
//	List<Veiculo> findByModelo(String modelo);
	
//	List<Veiculo> findByAno(Integer ano);
	
	
}
>>>>>>> e1938c8230813a1e8d1eb3774f52d62c4baff1df
