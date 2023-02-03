package Lab_13_3;

public class Zaleng implements Drivable{
	private int velocity, break_interval;
	
	public Zaleng(int velocity, int break_interval) {
		this.velocity = velocity;
		this.break_interval = break_interval;
	}
	public int getValocity() {
		return velocity;
	}
	@Override
	public int drive(int second) {
		return velocity * (second - break_interval);
	}
	
	public static void main(String[] args) {
		Zaleng zaleng = new Zaleng(5, 40);
		System.out.println("Zaleng drive 1 minutes for a distance of " +(zaleng.drive(60)) +" meters.");
	}
}