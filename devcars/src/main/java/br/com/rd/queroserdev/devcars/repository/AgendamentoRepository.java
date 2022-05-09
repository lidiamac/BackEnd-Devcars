package br.com.rd.queroserdev.devcars.repository;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> ff339d2c8564f0b3876a6b62b53649f88e90de4e
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.queroserdev.devcars.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer>{
<<<<<<< HEAD
=======
	
	List<Agendamento> findByCliente_CodCliente(Integer id);
>>>>>>> ff339d2c8564f0b3876a6b62b53649f88e90de4e

}
