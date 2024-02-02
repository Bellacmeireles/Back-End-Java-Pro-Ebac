package br.com.ebac.ebacmongodb.gameService;


import br.com.ebac.ebacmongodb.model.Game;
import br.com.ebac.ebacmongodb.repository.RepositoryGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories(basePackageClasses = RepositoryGame.class)
public class ServiceGame {

    @Autowired
    private RepositoryGame repositoryGame;

    public Game createGame(Game game) {
        return repositoryGame.insert(game);
    }

    public long count() {
        return repositoryGame.count();
    }

}
