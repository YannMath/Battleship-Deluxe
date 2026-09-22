package battleship.Objects;

import javax.swing.*;
import battleship.Logic.GameState;

public class Board {
    Tile[][] tiles = new Tile[GameState.getBoardSizeY()][GameState.getBoardSizeX()];

    public Board() {
        for (int j = 0; j < GameState.getBoardSizeY(); j++) {
            for (int k = 0; k < GameState.getBoardSizeX(); k++) {
                tiles[j][k] = new Tile(k, j);
            }
        }
    }

    public Tile[][] getTiles() {return tiles;}
    public JButton[][] getFields() {
        JButton[][] fields = new JButton[GameState.getBoardSizeY()][GameState.getBoardSizeX()];

        for (int j = 0; j < GameState.getBoardSizeY(); j++) {
            for (int k = 0; k < GameState.getBoardSizeX(); k++) {
                fields[j][k] = tiles[j][k].getTile();
            }
        }

        return fields;
    }
}
