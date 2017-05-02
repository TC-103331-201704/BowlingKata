package code;

public class Game {
	private int score = 0;
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins){
		this.score+=pins;
		this.rolls[currentRoll++] = pins;
	}
	
	public int score(){return this.score;}
}