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
    private void rollSpare() {
    	g.roll(5);
    	g.roll(5);
    }
    private void rollStrike() {
    	g.roll(10);
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
	
	@Test
	public void testOneSpare() throws Exception {
		setUp();
	    rollSpare();
	    g.roll(3);
	    rollMany(17,0);
	    assertEquals(16,g.score());
	}
	
	@Test
	public void testOneStrike() throws Exception {
		setUp();
	    rollStrike();
	    g.roll(3);
	    g.roll(4);
	    rollMany(16, 0);
	    assertEquals(24, g.score());
	  }

}
