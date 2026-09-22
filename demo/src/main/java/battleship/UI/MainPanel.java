package battleship.UI;

import javax.swing.*;
import java.awt.*;
import battleship.Logic.GameState;
import battleship.Objects.Board;

public class MainPanel extends JPanel {
    public MainPanel() {
        Board mainBoard = new Board();
        setLayout(new GridLayout(GameState.getBoardSizeY(), GameState.getBoardSizeX()));

        JButton[][] fields = mainBoard.getFields();
        
        for (int j = 0; j < GameState.getBoardSizeY(); j++) {
            for (int k = 0; k < GameState.getBoardSizeX(); k++) {
                add(fields[j][k]);
            }
        }
    }
}
