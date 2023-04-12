package org.epamek.battleship;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel
{
    public static Component createComponents()
    {
        JPanel pane = new JPanel(new GridLayout(10, 10));
        pane.setName("Battleship");

        createMatrix(pane);

        return pane;
    }

    private static void createMatrix(JPanel pane)
    {
        SeaPane[][] matrix = new SeaPane[10][10];

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                matrix[i][j] = new SeaPane(100, 100);
                pane.add(matrix[i][j]);
            }
        }
    }
}
