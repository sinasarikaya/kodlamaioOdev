package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

    @Override
    public void add(Game game) {
        System.out.println("Oyun eklendi " + game.getGameName());
    }
}
