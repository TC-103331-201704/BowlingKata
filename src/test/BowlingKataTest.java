package test;
import static org.junit.Assert.*;

import org.junit.Test;
import domain.Game;

public class BowlingKataTest {
	
	private Game g;
	
    protected void setUp() throws Exception {
    	g = new Game();
	}
	
	@Test
	public void testGutterGame() throws Exception {
		setUp();
		int n = 20;
		int pins = 0;
	    for (int i=0; i<n; i++)
	    	g.roll(pins);
	    assertEquals(0, g.score());
	}
	
	@Test
    public void testAllOnes() throws Exception {
		setUp();
	    for (int i = 0; i < 20; i++)
	    	g.roll(1);
	    assertEquals(20, g.score());
	  }

}
