public class Oblong extends Trapezoid{
	public Oblong(double a, double h) {
		if(a < h) {
			super.setSize(a, a, a);
		}
		else {
			super.setSize(a, a, h);
		}
	}
	public double getArea() {
		return b*h;
	}
	public double getPerimeter() {
		return (2*a)+(2*h);
	}
	public String toString() {
		return "Oblong\n" +super.toString();
	}
}
