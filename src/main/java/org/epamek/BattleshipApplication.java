package org.epamek;

import javax.swing.*;


public class BattleshipApplication {

    private static void createAndShowGUI()
    {
        JFrame frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("OCEANS ARE NOW BATTLEFIELDS");
        frame.getContentPane().add(label);

        frame.pack();
        //TODO: remove if unnecessary
        //frame.setSize(new Dimension(1000, 1000));
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(BattleshipApplication::createAndShowGUI);
    }
}
