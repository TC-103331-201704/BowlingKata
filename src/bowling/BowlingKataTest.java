package bowling;

import org.junit.Test;

import bowlingGame.Game;
import junit.framework.TestCase;

public class BowlingKataTest extends TestCase {
private Game g;
	public void setUp() throws Exception{
		g=new Game();
	}
	
	@Test
	public void test() {
		for(int i=0; i<20;i++){
			g.roll(0);}
			assertEquals(0,g.score());
	}
	@Test
	public void testAllOnes(){
		for(int i=0;i<20;i++){
			g.roll(1);
		}
		assertEquals(20,g.score());
	}

}
	