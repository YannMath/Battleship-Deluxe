package battleship.Logic;

public class GameState {
    private static int players;
    private static int boardSizeX;
    private static int boardSizeY;

    public static void init(int amountPlayers, int newBoardX, int newBoardY) {
        players = amountPlayers;
        boardSizeX = newBoardX;
        boardSizeY = newBoardY;
    }    

    public static void setPlayers(int newPlayers) {players = newPlayers;}
    public static void setBoardSizeX(int boardSizeX) {GameState.boardSizeX = boardSizeX;}
    public static void setBoardSizeY(int boardSizeY) {GameState.boardSizeY = boardSizeY;}

    public static int getPlayers() {return players;}
    public static int getBoardSizeX() {return boardSizeX;}
    public static int getBoardSizeY() {return boardSizeY;}
}