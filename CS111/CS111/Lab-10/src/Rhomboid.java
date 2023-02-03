public class Rhomboid extends Trapezoid{
	private double r, diagonal;
	public Rhomboid(double b, double h, double r) {
		super(b, b, h);
		if(r > 90) {
			this.r = Math.toRadians(90);
		}
		else {
			this.r = Math.toRadians(r);
		}
		diagonal = h / Math.sin(r);
	}
	public double getArea() {
		return b*h;
	}
	public double getPerimeter() {
		return 4*a;
	}
	public String toString() {
		return "Rhomboid > " +super.toString();
	}
}
