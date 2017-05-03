package test;

import domain.Game;
import junit.framework.TestCase;

/**
 * Created by jordiadan on 3/5/17.
 */
public class BowlingGameTest extends TestCase {
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }

}
