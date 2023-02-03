public class Trapezoid {
	protected double a, b, h;
	public Trapezoid() {
		this(0, 0, 0);
	}
	public Trapezoid(double a, double b, double h) {
		setSize(a, b, h);
	}
	public void setSize(double a, double b, double h) {
		this.a = a;
		this.b = b;
		this.h = h;
	}
	public double getArea() {
		return 0.5*(a+b)*h;
	}
	public double getPerimeter() {
		return a+b+h+h;
	}
	@Override
	public String toString() {
		return "Trapezoid(" + a + ", " + b + ", " + h + ")";
	}
}