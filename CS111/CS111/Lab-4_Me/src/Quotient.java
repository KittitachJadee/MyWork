//Kittitach Jadee
//6509700024
//24
import java.util.Scanner;

public class Quotient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an integer numerator: ");
		double numerator = scan.nextInt();
		System.out.print("Input an integer denominator: ");
		double denominator = scan.nextInt();
		if(denominator==0)
			System.out.println("Cannot divide by zero");
		else {
			double result = numerator/denominator;
			System.out.println ("The result of "+ numerator +"/"
			+ denominator + " is " + result);
		}
	}
}
