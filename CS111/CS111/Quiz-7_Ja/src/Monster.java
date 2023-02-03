//Kanyanat Det-in
//6409618011
public class Monster {
	final private double EYE_SIGHT=5.0;
	private boolean sleep;
	private int positionX, positionY;
	private double eyeSight;
	
	public Monster(int positionX, int positionY) {
		this.positionX=positionX;
		this.positionY=positionY;
		sleep=true;
		eyeSight=EYE_SIGHT;
	}
	
	public boolean isSleep() {
		return sleep;
	}
	
	public void setSleep(boolean status) {
		sleep=status;
	}
	
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
	
	public double getDistanceFrom(Person player) {
		int xDiff=player.getPositionX()-positionX;
		int yDiff=player.getPositionY()-positionY;
		double distance=Math.sqrt(Math.pow(xDiff, 2)+Math.pow(yDiff, 2));
		return Math.abs(distance);
	}
	
	public boolean canSee(Person player) {
		double distance=getDistanceFrom(player);
		if(distance>eyeSight)
			return false;
		else
			return true;
	}
	
	public String getStatus() {
		return "x "+positionX+" y: "+positionY +(sleep? " Sleeping": " Awakening");
	}
	
	public void changStatus() {
		int number=(int)(Math.random()*2);
		if(number==0)
			setSleep(false);
		else
			setSleep(true);
	}
}
