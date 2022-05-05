package br.com.rd.queroserdev.devcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

	Endereco findByCodEndereco(Integer idEndereco);

}
