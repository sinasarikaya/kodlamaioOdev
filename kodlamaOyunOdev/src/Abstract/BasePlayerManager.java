package Abstract;

import Entities.Player;

public abstract class BasePlayerManager implements IPlayerService{

    @Override
    public void save(Player player) throws Exception {
        System.out.println("Kayıt olundu " + player.getName());
    }
}
