import java.util.Random;

public abstract class Player {
	private String name;
	private int score;
	private Random dice = new Random();
	
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return this.score;
	}
	public void resetScore() {
		this.score = 0;
	}
	public void addScore(int aScore) {
		this.score += aScore;
	}
	public int getDiceValue() {
		return dice.nextInt(6) + 1;
	}
	//still don't know when to stop
	public abstract void play();
}
