import junit.framework.TestCase;

/**
 * Created by Sergi on 04/05/2017.
 */
public class BowlingGameTest extends TestCase{
    public void testGutterGame() {
        Game g = new Game();
        for (int i = 0; i < 20; i++){
            g.roll(0);
        }
    }
}
