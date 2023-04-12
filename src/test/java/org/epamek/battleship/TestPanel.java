package org.epamek.battleship;

import org.junit.Before;

import javax.swing.*;
import java.awt.*;

public class TestPanel extends SwingTestCase
{
    /**
     * a null panel to be checked against
     */
    private JPanel emptyPanel;

    /**
     * the contents of the game board
     */
    private Component contents;

    @Before
    public void setUp()
    {
        this.emptyPanel = new JPanel();
        this.contents = Board.createComponents();
    }

    /**
     * Confirms that test frame is enabled and that the empty panel is not valid.
     */
    public void testEmptyPanel()
    {
        assertTrue("Ensure frame is enabled", this.getTestFrame().isEnabled());
        assertFalse("Ensure empty panel is not valid", this.emptyPanel.isValid());
    }

    /**
     * Confirms that the test panel has been created
     * as a part of Board::createComponents.
     */
    public void testBattleshipPanel()
    {
        assertEquals("Ensure Battleship panel is created", "Battleship", this.contents.getName());
    }
}
