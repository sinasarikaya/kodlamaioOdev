package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface ICampaignService {
    void addCampaign(Game game, Campaign campaign);
    void deleteCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
}
