public class SampleMax {
	public int findMax(int x, int y) {
		if(x >= y) {
			return x;
		}else {
			return y;
		}
	}
	private static void printTestResult(int a, int b) {
		SampleMax comp = new SampleMax();
		System.out.print("max(" + a + "," + b + ") ==> ");
		System.out.println(comp.findMax(a, b));
		}
	public static void main(String[] args) {
		printTestResult(-10, -5); // negative case x < y
		printTestResult(-12, -15); // negative case y < x
		printTestResult(10, 30); // simple case x < y
		printTestResult(20, 12); // simple case y < x
		printTestResult(3, 3); // equals positive case
		printTestResult(-7, -7); // equals negative case
	}
}
