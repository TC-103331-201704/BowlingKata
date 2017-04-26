package code;

import java.util.ArrayList;

public class Game {
	private Frame[] gameFrames;
//----------------------------------------------------------------------------------------------------------------------
//			CONSTRUCTORS
//----------------------------------------------------------------------------------------------------------------------
	public Game(){this.gameFrames = new Frame[10];}
	
//----------------------------------------------------------------------------------------------------------------------
//			UTILITY METHODS
//----------------------------------------------------------------------------------------------------------------------
	
	public void roll(int pins){
		
	}
	
	public int score(){
		int TOTAL_SCORE = 0;
		
		for(Frame f : gameFrames) TOTAL_SCORE+= f.getScore();
		
		return TOTAL_SCORE;
	}
}
