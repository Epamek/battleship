package org.epamek.battleship;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel
{
    public static Component createComponents()
    {
        SeaPane seaPane = new SeaPane(30, 30, 100, 100);
        JPanel pane = new JPanel(new GridLayout(0, 1));

        pane.setName("Battleship");
        pane.add(seaPane);

        return pane;
    }
}
