package Lab_13_3;

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
		System.out.println("Bicycle drive 1 minutes for a distance of " +(bicycle.drive(60)) +" meters.");
	}
}