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
        int n = 20;
        int pins = 0;
        for (int i = 0; i < n; i++){
            g.roll(pins);
        }
        assertEquals(0, g.score());
    }
    
    public void testAllOnes() {
        Game g = new Game();
        for (int i = 0; i < 20; i++){
            g.roll(1);
        }
        assertEquals(20, g.score());
    }
}
