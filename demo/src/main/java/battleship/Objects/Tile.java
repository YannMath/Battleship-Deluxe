package battleship.Objects;

import javax.swing.*;

public class Tile {
    private JButton tile = new JButton("Tile");
    private int posX = 0;
    private int posY = 0;
    
    public Tile(int x, int y) {
        this.posX = x;
        this.posY = y;
        tile.setText("(" + y + "/" + x + ")");
    }

    public int x() {return posX;}
    public int y() {return posY;}
    public JButton getTile() {return tile;}
}
