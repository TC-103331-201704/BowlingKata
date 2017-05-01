package bowling;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.fail;

/**
 * Created by ignasiargemipuig on 24/4/17.
 */
public class BowlingKataTest extends TestCase{

    @Test
    public void testGutterGame() {
        //fail("Not implemented yet.");
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
}
