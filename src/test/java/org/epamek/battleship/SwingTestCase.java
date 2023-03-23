package org.epamek.battleship;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Ignore;

import javax.swing.*;

@Ignore
public class SwingTestCase extends TestCase
{
    private JFrame testFrame;

    @After
    public void tearDown()
    {
        if (this.testFrame != null)
        {
            this.testFrame.dispose();
            this.testFrame = null;
        }
    }

    public JFrame getTestFrame()
    {
        if (this.testFrame == null) this.testFrame = new JFrame("BattleshipTest");

        return this.testFrame;
    }
}
