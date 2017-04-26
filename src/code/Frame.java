package code;

public class Frame {
	protected Roll[] frameRolls;
	protected int score;
	
	public Frame(){ 
		this.frameRolls = new Roll[2];
		this.score = 0;
	}
	
	public int getScore(){return this.score;}
}