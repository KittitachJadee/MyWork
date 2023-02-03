//Kanyanat Det-in
//6409618011

public class Bicycle implements Drivable{
	private int velocity;
	
	public Bicycle(int velocity) {
		this.velocity = velocity;
	}
	public int getValocity() {
		return velocity;
	}
	@Override
	public int drive(int second) {
		return second * velocity;
	}
	
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(15);
		System.out.println("5 minutes, distance" +(bicycle.drive(300)) +" meters.");
	}
}