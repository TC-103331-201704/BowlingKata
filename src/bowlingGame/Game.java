package bowlingGame;

public class Game {
	
	private int score = 0;
	
	public void roll(int npins){
		score+=npins;
	}
	
	public int score(){
		return score;
	}

}
