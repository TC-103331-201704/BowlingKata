package test;
import static org.junit.Assert.*;

import org.junit.Test;
import domain.Game;

public class BowlingKataTest {
	
	private Game g;
	
    protected void setUp() throws Exception {
    	g = new Game();
	}
	
    private void rollMany(int n, int pins) {
    	for (int i = 0; i < n; i++)
    		g.roll(pins);
	}
    
	@Test
	public void testGutterGame() throws Exception {
		setUp();
	    rollMany(20, 0);
	    assertEquals(0, g.score());
	}
	
	@Test
    public void testAllOnes() throws Exception {
		setUp();
	    rollMany(20, 1);
	    assertEquals(20, g.score());
	  }

}
