package br.com.ebac.estrangulamento.novoservico.repository;

import br.com.ebac.estrangulamento.novoservico.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryUser extends CrudRepository<Users, String> {



}
