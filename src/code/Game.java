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
		int frameIndex = 0;
		
		for(int frame = 0; frame<10 ; frame++){
			//SPARE
			if (rolls[frameIndex] + rolls[frameIndex + 1] == 10){
				score += 10 + rolls[frameIndex + 2];
				frameIndex += 2;
			}else{
				score += rolls[frameIndex] + rolls[frameIndex + 1];
				frameIndex += 2;
			}
		}
		
		return score;
	}
}