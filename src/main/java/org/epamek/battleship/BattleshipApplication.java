package org.epamek.battleship;

import javax.swing.*;
import java.awt.*;

public class BattleshipApplication
{
    public Component createComponents()
    {
        JPanel pane = new JPanel(new GridLayout(0, 1));
        pane.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        pane.setName("Battleship");

        return pane;
    }

    private static void createAndShowGUI()
    {
        JFrame frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BattleshipApplication app = new BattleshipApplication();
        Component contents = app.createComponents();
        frame.add(contents);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(BattleshipApplication::createAndShowGUI);
    }
}
