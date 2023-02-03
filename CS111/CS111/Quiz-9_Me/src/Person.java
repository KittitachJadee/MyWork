public class Person implements Movable, Reportable {
	private int treasure;
	private int positionX = 0, positionY = 0;
	// ... omit other methods
	
	public void report() {
		System.out.println("The number of treasure: " +treasure);
	}
	
	 public int getPosition() {
		 return positionX;
	 }
	 
	public int getPositionY() {
		 return positionY;
	}
	 
	public int getTreasure() {
		 return treasure;
	}
	 
	public void move(int xDist, int yDist) {
		positionX += xDist;
		positionY += yDist;
	}
	
	public String getStatus() {
		return "x:"+positionX +" y:"+positionY +" Treasure:"+treasure;
	}
	
	public void setPositionX (int x) {
		positionX = x;
	}
	
	public void setPositionY (int y) {
		positionY = y;
	}
}
