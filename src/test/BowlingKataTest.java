package test;
import static org.junit.Assert.*;

import org.junit.Test;
import domain.Game;

public class BowlingKataTest {

	@Test
	public void testGutterGame() {
		Game game = new Game();
	    for (int i=0; i<20; i++)
	    	game.roll(0);
	    assertEquals(0, game.score());
	}
	
	@Test
    public void testAllOnes() throws Exception {
	    Game game = new Game();
	    for (int i = 0; i < 20; i++)
	    	game.roll(1);
	    assertEquals(20, game.score());
	  }

}
