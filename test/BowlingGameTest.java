import Game.Game;
import junit.framework.TestCase;

/**
 * Created by santi on 3/5/17.
 */
public class BowlingGameTest extends TestCase {
    private Game g;
    protected void setUp() throws Exception {
        g = new Game();
    }
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());

        System.out.println(g.toString());
    }
    public void testAllOnes() throws Exception {
        rollMany(20,1);
        assertEquals(20, g.score());

        System.out.println(g.toString());
    }
    public void testOneSpare() throws Exception {
        rollSpare();
        g.roll(3);
        rollMany(17,0);
        assertEquals(16,g.score());

        System.out.println(g.toString());
    }

    public void testOneStrike() throws Exception {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());

        System.out.println(g.toString());
    }


    public void testPerfectGame() throws Exception {
        rollMany(12,10);
        assertEquals(300, g.score());

        System.out.println(g.toString());
    }

    private void rollStrike() {
        g.roll(10);
    }
    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }
}