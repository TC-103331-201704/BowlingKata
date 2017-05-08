import junit.framework.TestCase;

/**
 * Created by Sergi on 04/05/2017.
 */
public class BowlingGameTest extends TestCase{
    private Game g;

    protected void setUp(){
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    public void testGutterGame() {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    public void testAllOnes() {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

//    public void testOneSpare() {
//        g.roll(5);
//        g.roll(5); //Spare
//        g.roll(3);
//        rollMany(17, 0);
//        assertEquals(16, g.score());
//    }
}
