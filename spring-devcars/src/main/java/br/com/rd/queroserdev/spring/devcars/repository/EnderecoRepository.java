package br.com.rd.queroserdev.spring.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.spring.devcars.orm.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

	@Query("select e.codEndereco, e.ruaEndereco, e.numeroEndereco, e.bairro, e.cidade, e.uf, e.cepEndereco "
			+ "from Endereco e join e.clientes c where c.codCliente = :id")
	List<Endereco> findAllByCliente(Integer id);
}
