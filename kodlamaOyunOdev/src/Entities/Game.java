package Entities;

public class Game {
    private int Id;
    private String GameName;
    private int GamePrice;

    public Game(int id, String gameName, int gamePrice) {
        Id = id;
        GameName = gameName;
        GamePrice = gamePrice;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }

    public int getGamePrice() {
        return GamePrice;
    }

    public void setGamePrice(int gamePrice) {
        GamePrice = gamePrice;
    }
}
