//Kanyanat Det-in
//6409618011
public class ProjectileCalculator {
	private double speed;
	private double degree;
	public void setU(double u) {
		speed=u;
	}
	public double getU() {
		return speed;
	}
	public void setZeta(double zeta) {
		degree=zeta;
	}
	public double getZeta()
	{
		return degree;
	}
	public double findSy() {
		int g=10;
		double u2=Math.pow(speed, 2);
		double sinPow2=Math.pow(Math.sin(Math.toRadians(degree)), 2);
		return (u2*sinPow2)/(2*g);
	}
	public double findSx() {
		int g=10;
		double u2=Math.pow(speed, 2);
		double twoSin=Math.sin(2*Math.toRadians(degree));
		return (u2*twoSin)/g;
	}
}
