package battleship;

import battleship.Logic.GameState;
import battleship.UI.MainFrame;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int players = 2;
        int boardSizeX = 10;
        int boardSizeY = 10;

        GameState.init(players, boardSizeX, boardSizeY);
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.toggleFullscreen();

        System.out.println("Players: " + GameState.getPlayers());
    }
}