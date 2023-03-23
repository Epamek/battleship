package org.epamek.battleship;

import javax.swing.*;
import java.awt.*;

public class BattleshipApplication
{
    private static void createAndShowGUI()
    {
        JFrame frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Component contents = Board.createComponents();
        frame.add(contents);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(BattleshipApplication::createAndShowGUI);
    }
}
