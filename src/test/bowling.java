package test;

import code.Game;
import junit.framework.TestCase;

public class bowling extends TestCase{
	private Game g;
	
	protected void setUp() throws Exception{this.g = new Game();}
	
	
	public void testGutterGame() throws Exception{
		this.rollMany(20, 0);
		assertEquals(0, g.score());
	}
	
	
	public void testAllOnes() throws Exception{		
		this.rollMany(20, 1);
		assertEquals(20, g.score());
	}
	
//-----------------------------------------------------------------------------------------------
//					AUX. METHODS
//-----------------------------------------------------------------------------------------------
	
	private void rollMany(int n, int pins){
		for(int i = 0 ; i< n ; i++) g.roll(pins);
	}
}