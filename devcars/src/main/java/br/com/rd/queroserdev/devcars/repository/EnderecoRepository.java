package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	
//	@Query("select e from Endereco e inner join e.clientes c where c.codCliente = :cod_cliente")
//	List<Endereco> findAllByCliente(Integer id);

	Endereco findByCodEndereco(Integer idEndereco);

}
