package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Cartao;
import br.com.rd.queroserdev.spring.devcars.orm.Veiculo;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao,Long>,
										CrudRepository<Cartao,Long>{

//	List<Cartao> findAll();
	
	
//	@Query(value="select Cartao where ",)
//	List<Cartao> orderBy(int codCartao) ;
	
}

