package br.com.prog3.aula14.repository;

import org.hibernate.mapping.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	List<Cliente> findByIdade(int idade);
}
