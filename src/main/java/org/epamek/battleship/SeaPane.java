package org.epamek.battleship;

import javax.swing.*;
import java.awt.*;

public class SeaPane extends JPanel
{
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public SeaPane(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(width + 2 * x, height + 2 * y);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        g2.drawRect(x, y, width, height);
    }
}