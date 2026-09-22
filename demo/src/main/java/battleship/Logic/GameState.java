package battleship.Logic;

public class GameState {
    private static int players = 0;

    public static void init(int amountPlayers) {
        players = amountPlayers;
    }    

    public static void setPlayers(int newPlayers) {players = newPlayers;}

    public static int getPlayers() {return players;}
}
