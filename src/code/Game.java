package code;

public class Game {
	private int score = 0;
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins){
		this.score+=pins;
		this.rolls[currentRoll++] = pins;
	}
	
	public int score(){
		int score = 0;
		
		for(int i = 1 ; i<this.rolls.length ; i++){
			if(this.rolls[i] + this.rolls[i+1] == 10) score+=10;
			else score += this.rolls[i];
		}
		
		return score;
	}
}