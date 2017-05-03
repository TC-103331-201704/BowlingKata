package test;

import domain.Game;
import junit.framework.TestCase;

/**
 * Created by jordiadan on 3/5/17.
 */
public class BowlingGameTest extends TestCase {
    private Game g;
    protected void setUp() throws Exception {
        g = new Game();
    }
    public void testGutterGame() throws Exception {
        for (int i = 0; i < 20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
    public void testAllOnes() throws Exception {
        for (int i = 0; i < 20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }
}
