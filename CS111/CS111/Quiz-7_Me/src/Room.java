import java.util.Random;

//Pangon La-or-on
//6409700074

public class Room {
	private int width, length, exitX, exitY;
	private Monster mon1;
	private Monster mon2;
	
	public Room(int width, int length) {
		this.width=width;
		this.length=length;
		Random ran=new Random();
		this.mon1=new Monster(ran.nextInt(width), ran.nextInt(length));
		this.mon2=new Monster(ran.nextInt(width), ran.nextInt(length));
		this.exitX=ran.nextInt(width);
		this.exitY=ran.nextInt(length);
	}
	
	public boolean inbound(int positionX, int positionY) {
		return positionX <= width && positionY <= length && positionX >= 0 && positionY >= 0;
	}
	
	public void updateMonsterStatus() {
		mon1.changStatus();
		mon2.changStatus();
	}
	
	public String getMonsterStatus() {
		StringBuffer sb=new StringBuffer();
		sb.append(" Monster1: " +mon1.getStatus() +"\n");
		sb.append(" Monster2: " +mon1.getStatus() +"\n");
		return sb.toString();
	}
	
	public String getExitStatus() {
		return " Exit at x: "+exitX+" y: "+exitY;
	}
	
	public boolean isAtExit(Person player) {
		boolean atX=player.getPositionX()==exitX;
		boolean atY=player.getPositionY()==exitY;
		return atX&&atY;
	}
	
	public boolean hasMonsterSee(Person player) {
		boolean m1see= !mon1.isSleep()&&mon1.canSee(player);
		boolean m2see= !mon2.isSleep()&&mon2.canSee(player);
		return m1see||m2see;
	}
}
