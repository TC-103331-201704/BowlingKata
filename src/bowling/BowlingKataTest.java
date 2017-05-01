package bowling;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.fail;

/**
 * Created by ignasiargemipuig on 24/4/17.
 */
public class BowlingKataTest extends TestCase{

    private Game g;
    protected void setUp() throws Exception {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

        @Test
    public void testGutterGame() throws Exception{
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    /*@Test
    public void testOneSpare() throws Exception {
        g.roll(5);
        g.roll(5); // spare
        g.roll(3);
        rollMany(17,0);
        assertEquals(16,g.score());
    }*/

}
