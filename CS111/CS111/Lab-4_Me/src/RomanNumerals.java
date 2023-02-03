//Kittitach Jadee
//6509700024
//24
import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result="";
		System.out.print("Input the roman number: ");
		String romanNumerals = scan.nextLine();
		switch(romanNumerals) {
			case "I" : result="It is One";  break;
			case "II": result="It is Two"; break;
			case "III": result="It is Three"; break;
			case "IV": result="It is Four"; break;
			case "V": result="It is Five"; break;
			default: System.out.println("Unknown Number"); break;
		}
		System.out.println(result);
	}
}
