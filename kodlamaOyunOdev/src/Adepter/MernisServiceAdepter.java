package Adepter;

import Abstract.IPlayerCheckService;
import Entities.Player;
import mernisAdepter.DIDKPSPublicSoap;

public class MernisServiceAdepter implements IPlayerCheckService {
    @Override
    public boolean CheckIfRealPerson(Player player) throws Exception {
        DIDKPSPublicSoap client=new DIDKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(player.getNationalityId()), player.getName(), player.getLastName(), player.getDateOfBirth().getYear());
    }
}
