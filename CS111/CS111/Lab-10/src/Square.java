public class Square extends Oblong{
	public Square(double a) {
		super(a, a);
	}
	public double getArea() {
		return Math.pow(b, 2);
	}
	public double getPerimeter() {
		return 4*b;
	}
	public String toString() {
		return "Square > " +super.toString();
	}
	public double getVolume() {
		return a*b*h;
	}
}
