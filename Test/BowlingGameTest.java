import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandromoneomartinez on 10/5/17.
 */
public class BowlingGameTest {
    private Game g;

    @Before
    public void setup(){
        g = new Game();
    }

    @Test
    public void testGutterGame(){
        int n = 20;
        int pins = 0;
        rollMany(n,pins);
        assertEquals(0, g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    @Test
    public void testAllOnes(){
        for (int i=0; i<20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }
}