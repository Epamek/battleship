package org.epamek.battleship;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel
{
    /**
     * Currently generates a single SeaPane and attaches it to the game board.
     *
     * @return a pane named "Battleship" representing the game board and containing the board's components
     */
    public static Component createComponents()
    {
        //TODO: create and call method to generate 2D array of panes
        SeaPane seaPane = new SeaPane(30, 30, 100, 100);
        JPanel pane = new JPanel(new GridLayout(0, 1));

        pane.setName("Battleship");
        pane.add(seaPane);

        return pane;
    }
}
