//Pangon La-or-on
//6409700074

public class Monster1 {
	private final double EYE_SIGHT = 5;
	private double eyeSight;
	
	public Monster1() {
		eyeSight = EYE_SIGHT;
	}
	
	public boolean canSee(double distance) {
		return distance <= eyeSight;
	}
	
	public double getEyeSight() {
		return eyeSight;
	}
}
