package Main;

import Abstract.BasePlayerManager;
import Adepter.MernisServiceAdepter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.NormalPlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        Player sina=new Player("sinasarikaya@gmail.com","Mustafa Sina","Sarıkaya", LocalDate.of(1997,03,20),"15725765042");
        BasePlayerManager basePlayerManager=new NormalPlayerManager(new MernisServiceAdepter());
        basePlayerManager.save(sina);
        Game gta=new Game(1,"GTA",100);
        GameManager g1=new GameManager();
        g1.add(gta);
        System.out.println(gta.getGamePrice());
        Campaign campaign=new Campaign(1,"1",25);
        CampaignManager c1=new CampaignManager();
        c1.addCampaign(gta,campaign);
        System.out.println(gta.getGamePrice());



    }

}
