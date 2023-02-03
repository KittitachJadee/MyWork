public class Square extends Oblong{

	public Square(double a, double b, double h) {
		super(a, a, a);
	}
	public double getVolume() {
		return a*b+h;
	}
	public double getArea() {
		return Math.pow(b, 2);
	}
	public double getPerimeter() {
		return 4*a;
	}
	public String toString() {
		return "Square\n" +super.toString();
	}
}
