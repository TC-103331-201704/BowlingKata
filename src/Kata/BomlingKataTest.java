package Kata;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class BomlingKataTest extends TestCase {
	public void testGutterGame() throws Exception {
		 Game g = new Game();
		 for (int i=0; i<20; i++)
			 g.roll(0);
	}
}
