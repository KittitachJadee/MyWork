//Kanyanat Det-in
//6409618011
public class Person {
	private int score=0;
	private int positionX=0, positionY=0;
	
	public int getPositionX() {
		return positionX;
	}
	
	public void setPositionX(int x) {
		positionX=x;
	}
	
	public int getPositionY() {
		return positionY;
	}
	
	public void setPositionY(int y) {
		positionY=y;
	}
	
	public void move(int horizontalDistance, int verticalDistance) {
		positionX+=horizontalDistance;
		positionY+=verticalDistance;
		score+=5;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score=score;
	}
	
	public String getStatus() {
		return "x: "+positionX+" y: "+positionY+" Score: "+score;
	}
}
