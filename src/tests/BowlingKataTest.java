package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingKataTest {

	@Test
	public void test() {
		Game g = new Game();
	    for (int i=0; i<20; i++)
	        g.roll(0);
	}

}