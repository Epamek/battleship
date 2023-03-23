package org.epamek.battleship;

import org.junit.Before;

import javax.swing.*;
import java.awt.*;

public class TestPanel extends SwingTestCase
{
    private JPanel emptyPanel;
    private Component contents;

    @Before
    public void setUp()
    {
        this.emptyPanel = new JPanel();
        this.contents = Board.createComponents();
    }

    public void testEmptyPanel()
    {
        assertTrue("Ensure frame is enabled", this.getTestFrame().isEnabled());
        assertFalse("Ensure empty panel is not valid", this.emptyPanel.isValid());
    }

    public void testBattleshipPanel()
    {
        assertEquals("Ensure Battleship panel is created", "Battleship", this.contents.getName());
    }
}
