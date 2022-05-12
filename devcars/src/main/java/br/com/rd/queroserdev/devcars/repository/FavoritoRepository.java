package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.devcars.model.Favorito;

@Repository
public interface FavoritoRepository extends JpaRepository <Favorito, Integer>, CrudRepository<Favorito, Integer>{

//	Listando todos os favoritos
	List<Favorito> findAll();
	
	
	
	List<Favorito> findByCliente_CodCliente(Integer id);
	
	
//	@Query(value="select tf.cod_cliente, tf.cod_favorito, tfv.cod_veiculo\r\n"
//			+ "from tb_favorito tf inner join tb_favorito_veiculo tfv on tf.cod_favorito = tfv.cod_veiculo ",
//			nativeQuery = true)
//	List<Favorito>favoritoVeiculo(@Param("cod_veiculo")Integer id);
	
}
