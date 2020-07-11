package br.com.prog3.aula14.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.com.prog3.aula14.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	List<Cliente> findByIdade(int idade);
}
