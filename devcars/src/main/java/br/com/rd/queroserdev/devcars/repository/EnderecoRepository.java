package br.com.rd.queroserdev.devcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rd.queroserdev.devcars.model.Cartao;
import br.com.rd.queroserdev.devcars.model.Endereco;
import br.com.rd.queroserdev.devcars.model.Veiculo;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	List<Endereco> findByCodEndereco(Integer codEndereco);
	
	//List<Endereco> findByClientesCodCliente(Integer id);
	
	
	
	
		
	

}
