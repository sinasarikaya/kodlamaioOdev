package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements ICampaignService {
    @Override
    public void addCampaign(Game game, Campaign campaign) {

        game.setGamePrice((int) (100-game.getGamePrice()*(campaign.getDiscountRate()/100)));

        System.out.println("Kampanya eklendi " + game.getGameName() + " adlı oyun artık " + game.getGamePrice() );
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya silindi ");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya güncellendi ");
    }
}
