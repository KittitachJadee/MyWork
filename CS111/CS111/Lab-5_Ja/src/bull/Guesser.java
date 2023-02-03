//Kanyanat Det-in
//6409618011
package bull;
import java.util.Scanner;
public class Guesser {
	Scanner input=new Scanner(System.in);
	public String getGuess() {
		System.out.print("Guess: ");
		String answer=input.nextLine();
		int number;
		for(;;) {
			number=Integer.parseInt(answer);
			if(Checker.isValid(answer)==true&&Checker.isValid(number)==true)
				break;
			else {
				System.out.printf("Invalid guess! try again.\nGuess: ");
				answer=input.nextLine();
			}
		}
		return answer;
	}
}