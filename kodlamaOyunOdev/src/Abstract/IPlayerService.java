package Abstract;

import Entities.Player;

public interface IPlayerService {

    void save(Player player)throws Exception;
    void delete(Player player);
    void update(Player player);
}
