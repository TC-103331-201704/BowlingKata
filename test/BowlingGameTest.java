import junit.framework.TestCase;

/**
 * Created by Sergi on 04/05/2017.
 */
public class BowlingGameTest extends TestCase{
    private Game g;

    protected void setUp(){
        g = new Game();
    }

    public void testGutterGame() {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }
    
    public void testAllOnes() {
        Game g = new Game();
        for (int i = 0; i < 20; i++){
            g.roll(1);
        }
        assertEquals(20, g.score());
    }
}
