import junit.framework.TestCase;

/**
 * Created by xos on 03-May-17.
 */
public class BowlingGameTest extends TestCase {
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
    }
}
