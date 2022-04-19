package br.com.queroserdev.spring.devcars.specification;

import org.springframework.data.jpa.domain.Specification;

import br.com.queroserdev.spring.devcars.orm.Veiculo;

public class SpecificationVeiculo {
	
	public static Specification<Veiculo> marca(String marca) {
		return(root, criteriaQuery, criteriaBuilder) ->
		criteriaBuilder.like(root.get("marca_veiculo"), "%" + marca + "%");
	}
	
	
}
