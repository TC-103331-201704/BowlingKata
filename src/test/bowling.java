package test;

import code.Game;
import junit.framework.TestCase;

public class bowling extends TestCase{
	private Game g;

//-----------------------------------------------------------------------------------------------
//						TESTS
//-----------------------------------------------------------------------------------------------
	
	public void testGutterGame() throws Exception{
		this.rollMany(20, 0);
		assertEquals(0, g.score());
	}
	
	
	public void testAllOnes() throws Exception{		
		this.rollMany(20, 1);
		assertEquals(20, g.score());
	}
	

	public void testOneSpare() throws Exception{
		this.g.roll(5);
		this.g.roll(5);
		this.g.roll(3);
		
		this.rollMany(17, 0);
		assertEquals(16, g.score());
	}
	
//-----------------------------------------------------------------------------------------------
//					AUX. METHODS
//-----------------------------------------------------------------------------------------------
	
	protected void setUp() throws Exception{this.g = new Game();}
	
	private void rollMany(int n, int pins){
		for(int i = 0 ; i< n ; i++) g.roll(pins);
	}
}