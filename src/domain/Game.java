package domain;

public class Game {
	
	private int score = 0;
	private int[] rolls = new int[22];
	private int currentRoll = 0;
	
	public void roll(int pins){
		score += pins;
		rolls[currentRoll++] = pins;
	}
	
	public int score(){
		return score;
	}
}
