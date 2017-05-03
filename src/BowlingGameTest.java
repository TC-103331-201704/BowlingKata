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
        int n = 20;
        int pins = 0;
        rollMany(n, pins);
        Game g = new Game();
        for (int i=0; i<n; i++)
            g.roll(pins);
        assertEquals(0, g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i=0; i<n; i++)
            g.roll(pins);
    }

    public void testAllOnes() throws Exception {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }
}
