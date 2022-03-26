package Entities;

public class Campaign {
    private int Id;
    private String CampaignId;
    private double DiscountRate;

    public Campaign(int id, String campaignId, double discountRate) {
        Id = id;
        CampaignId = campaignId;
        DiscountRate = discountRate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCampaignId() {
        return CampaignId;
    }

    public void setCampaignId(String campaignId) {
        CampaignId = campaignId;
    }

    public double getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(double discountRate) {
        DiscountRate = discountRate;
    }


}
