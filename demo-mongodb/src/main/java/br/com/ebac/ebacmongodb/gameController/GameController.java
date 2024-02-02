package br.com.ebac.ebacmongodb.gameController;

import br.com.ebac.ebacmongodb.gameService.ServiceGame;
import br.com.ebac.ebacmongodb.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private ServiceGame serviceGame;

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return serviceGame.createGame(game);
    }

    @GetMapping("/count")
    public Long countGames() {
        return serviceGame.count();
    }

}
