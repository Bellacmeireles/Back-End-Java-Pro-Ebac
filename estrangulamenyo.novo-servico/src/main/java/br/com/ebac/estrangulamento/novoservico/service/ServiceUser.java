package br.com.ebac.estrangulamento.novoservico.service;

import br.com.ebac.estrangulamento.novoservico.entities.Users;
import br.com.ebac.estrangulamento.novoservico.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceUser {

    @Autowired
    private RepositoryUser repositoryUser;

    /* public ServiceUser(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
        +
    }*/

    public Iterable<Users> encontrarTodos() {
        return repositoryUser.findAll();
    }

    public Users createUser(Users users) {
        return repositoryUser.save(users);
    }
}
