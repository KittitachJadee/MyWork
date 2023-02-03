package bull;

import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class Guesser {
	Scanner scan=new Scanner(System.in);
	
	public String getGuess() {
		String answer;
		System.out.print("Guess: ");
		answer=scan.nextLine();
		while(Checker.isValid(answer)==false||Checker.isValid(Integer.parseInt(answer))==false) {
			System.out.println("Invalid guess! try again.");
			System.out.print("Guess: ");
			answer=scan.nextLine();
		}
		return answer;
	}
}
