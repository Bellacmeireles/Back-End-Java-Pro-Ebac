package br.com.ebac.estrangulamento.novoservico.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.util.UUID;

@Entity
public class Users {
    @Id
    //@Column(name = "id", nullable = false)
    private String id;
    private String nome;
    private String login;
    private Integer idade;
    private Integer alturaCm;

    public Users() {}

    public Users(String id, String nome, String login, Integer idade, Integer alturaCm) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.idade = idade;
        this.alturaCm = alturaCm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(Integer alturaCm) {
        this.alturaCm = alturaCm;
    }


    @PrePersist
    public void criarId() {
        this.id = UUID.randomUUID().toString();
    }

}
