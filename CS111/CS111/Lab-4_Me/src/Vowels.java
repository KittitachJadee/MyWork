//Kittitach Jadee
//6509700024
//24
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfVowels=0;
		System.out.print("Please enter your message: ");
		String message = scan.nextLine();
		message=message.toLowerCase();
		for(int i=0; i<message.length(); i++){
			char ch=message.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				numOfVowels+=1;
		}
		System.out.println("The number of vowels is "+numOfVowels);
	}
}
