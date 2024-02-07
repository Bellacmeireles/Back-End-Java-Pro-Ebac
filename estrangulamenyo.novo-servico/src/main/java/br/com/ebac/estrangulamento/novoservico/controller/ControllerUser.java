package br.com.ebac.estrangulamento.novoservico.controller;

import br.com.ebac.estrangulamento.novoservico.entities.Users;
import br.com.ebac.estrangulamento.novoservico.service.ServiceUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ControllerUser {

    private final ServiceUser serviceUser;

    public ControllerUser(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @PostMapping
    public Users criarUser(@RequestBody Users users) {
        return serviceUser.createUser(users);
    }

    @GetMapping
    public Iterable<Users> encontrarTodos() {
        return serviceUser.encontrarTodos();
    }
}
