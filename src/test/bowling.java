package test;

import code.Game;
import junit.framework.TestCase;

public class bowling extends TestCase{
	private Game g;
	
	protected void setUp() throws Exception{this.g = new Game();}
	
	
	public void testGutterGame() throws Exception{
		int n = 20;
		int pins = 0;
		
		this.rollMany(n, pins);
		
		assertEquals(0, g.score());
	}
	
	
	public void testAllOnes() throws Exception{		
		for(int i = 0; i<20; i++) g.roll(1);

		assertEquals(20, g.score());
	}
	
//-----------------------------------------------------------------------------------------------
//					AUX. METHODS
//-----------------------------------------------------------------------------------------------
	private void rollMany(int n, int pins){
		for(int i = 0 ; i< n ; i++) g.roll(pins);
	}
}