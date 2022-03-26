package Concrete;

import Abstract.BasePlayerManager;
import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class NormalPlayerManager extends BasePlayerManager implements IPlayerService {

    private IPlayerCheckService playerCheckService;

    public NormalPlayerManager(IPlayerCheckService playerCheckService) {
        this.playerCheckService = playerCheckService;
    }

    @Override
    public void save(Player player) throws Exception {
        if(playerCheckService.CheckIfRealPerson(player)){
            super.save(player);
        }else {
            throw new Exception("Not a valid person");
        }
    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyuncu silindi " + player.getName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncu güncellendi " +  player.getName());
    }
}
