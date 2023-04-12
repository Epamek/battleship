package org.epamek.battleship;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Ignore;

import javax.swing.*;

@Ignore
public class SwingTestCase extends TestCase
{
    /**
     * a Swing Frame to act as a test case
     */
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

    /**
     * The getTestFrame method checks for the existence of a JFrame and instantiates one if there is none.
     *
     * @return instance of testFrame
     */
    public JFrame getTestFrame()
    {
        if (this.testFrame == null) this.testFrame = new JFrame("BattleshipTest");

        return this.testFrame;
    }
}
