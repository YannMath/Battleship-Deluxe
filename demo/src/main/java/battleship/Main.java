package battleship;

import battleship.Logic.GameState;
import battleship.UI.MainFrame;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

        GameState.init(2);
        System.out.println("Players: " + GameState.getPlayers());
    }
}