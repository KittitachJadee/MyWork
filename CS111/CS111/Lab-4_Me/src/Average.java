//Kittitach Jadee
//6509700024
//24
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNum, secondNum, sum=0, i, j=0;
		double average;
		System.out.print("Please enter your first number: ");
		firstNum=scan.nextInt();
		System.out.print("Please enter your second number: ");
		secondNum=scan.nextInt();
		while(firstNum>secondNum) {
			System.out.print("Please re-enter your second number (should be > "
			+firstNum +" ): ");
			secondNum=scan.nextInt();
		}
		for(i=firstNum; i<=secondNum; sum+=i, i++, j++);
		average=(double)sum/j;
		System.out.println("The sum from " +firstNum +" to " +secondNum +" is " +sum);
		System.out.printf("The average from %d to %d is %.4f", firstNum, secondNum, average);
	}
}
