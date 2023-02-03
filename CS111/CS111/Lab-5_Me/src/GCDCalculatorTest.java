import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class GCDCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int firstNum, secondNum;
		System.out.print("Please enter your first number: ");
		firstNum=Math.abs(scan.nextInt());
		System.out.print("Please enter your second number: ");
		secondNum=Math.abs(scan.nextInt());
		System.out.println("The gcd of "+firstNum+" and "+secondNum+" is "
				+GCDCalculator.gcd(firstNum, secondNum));
	}
}
