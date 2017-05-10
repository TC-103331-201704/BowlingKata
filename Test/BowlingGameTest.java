import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandromoneomartinez on 10/5/17.
 */
public class BowlingGameTest {

    @Test
    public void testGutterGame(){
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
}