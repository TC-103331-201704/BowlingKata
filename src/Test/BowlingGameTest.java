package Test;

import junit.framework.TestCase;

import Domain.*;

public class BowlingGameTest extends TestCase{
	private Game g;
	
	protected void setUp() throws Exception {
		g = new Game();
	}
	
	private void rollMany (int n, int pins){
		for (int i = 0; i < n; i++)
			g.roll(pins);
	}
	

	public void testGutterGame() throws Exception {
		int n = 20;
		int pins = 0;
		rollMany(n,pins);
		assertEquals(0, g.score());
	}
	
	public void testAllOnes() throws Exception {
		rollMany(20,1);
		assertEquals(20, g.score());	
	}
}
