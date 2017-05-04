package Kata;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class BomlingKataTest extends TestCase {
	private Game g;
	
	protected void setUp() throws Exception {
	 g = new Game();
	}
	public void testGutterGame() throws Exception {
		int n = 20;
		int pins = 0;
		for (int i = 0; i < n; i++) {
			g.roll(pins);
		}
		assertEquals(0, g.score());
	}
	public void testAllOnes() throws Exception {
		 Game g = new Game();
		 for (int i = 0; i < 20; i++)
		 g.roll(1);
		 assertEquals(20, g.score());
	}
}
