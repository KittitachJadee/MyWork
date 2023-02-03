//Kittitach Jadee
//6509700024
//24
import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double timeCall, pay=0;
		System.out.print("Enter minutes: ");
		timeCall=scan.nextDouble();
		timeCall=Math.ceil(timeCall);
		if(timeCall<10) {
			pay+=timeCall*3.5;
		}
		else if(timeCall>=10 && timeCall<60) {
			if(timeCall-20<=0) {
				pay+=timeCall*3;
			}
			else {
				pay+=20*3;
				timeCall-=20;
				pay+=timeCall*1;
			}
		}
		else
			pay+=timeCall*1.5;
		if(pay<0)
			pay=0;
		System.out.println("You have to pay "+pay);
	}
}
