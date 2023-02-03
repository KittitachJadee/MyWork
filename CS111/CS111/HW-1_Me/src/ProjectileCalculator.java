//Pangon La-or-on
//6409700074

public class ProjectileCalculator {
	private double u;
	private double zeta;
	
	public void setU(double u) {
		this.u=u;
	}
	public void setZeta(double zeta) {
		this.zeta=zeta;
	}
	public double getU() {
		return u;
	}
	public double getZeta()
	{
		return zeta;
	}
	public double findSy() {
		return (Math.pow(u, 2)*Math.pow(Math.sin(Math.toRadians(zeta)), 2))/(20);
	}
	public double findSx() {
		return (Math.pow(u, 2)*Math.sin(2*Math.toRadians(zeta)))/10;
	}
}
