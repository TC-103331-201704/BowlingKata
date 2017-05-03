import junit.framework.TestCase;

/**
 * Created by xos on 03-May-17.
 */
public class BowlingGameTest extends TestCase {
    private Game g;

    protected void setUp() throws Exception {
        g = new Game();
    }

    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }

    public void testAllOnes() throws Exception {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }
}
