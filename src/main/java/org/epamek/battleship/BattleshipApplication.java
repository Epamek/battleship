package org.epamek.battleship;

import javax.swing.*;
import java.awt.*;

public class BattleshipApplication
{
    /**
     * Creates the Swing Frame on which the app will be displayed.
     * It enables the app to close upon exiting the window, creates the game board and contents, packs the frame,
     * and makes it visible.
     */
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
