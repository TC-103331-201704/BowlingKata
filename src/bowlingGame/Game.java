package bowlingGame;

public class Game {
	private int score=0;
	private int rolls[]= new int[21];
	private int currentRoll=0;
	public void roll(int pins){
		score+=pins;
		rolls[currentRoll++]=pins;
	}
	public int score(){
		int score=0;
		for(int i=0; i<rolls.length;i++){
			if(rolls[i]+rolls[i+1]==10){
				score+= ;
			}
			score+=rolls[i];
		}
		return score;
	}
}
