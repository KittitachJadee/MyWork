//Pangon La-or-on
//6409700074

public class Person {
	private int treasure;
	private int positionX=0;
	private int positionY=0;
	
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
	}
	public int getTreasure() {
		return treasure;
	}
	public void addTreasure() {
		treasure++;
	}
	public void resetTreasure() {
		treasure=0;
	}
	public void showPosition() {
		System.out.println("My position is at x: "+positionX+" and y: "+positionY);
	}
	public String getStatus() {
		return "x: "+positionX+" y: "+positionY+" Treasure: "+treasure;
	}
}
