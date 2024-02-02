package br.com.ebac.ebacmongodb.repository;

import br.com.ebac.ebacmongodb.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryGame extends MongoRepository<Game, String> {
    long count();
}
