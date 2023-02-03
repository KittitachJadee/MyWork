//Kanyanat Det-in
//6409618011
package bull;
public class Game {
	private final int MAX_COUNT=10;
	private Guesser guess;
	private Chooser choose;
	public Game() {
		guess=new Guesser();
		choose=new Chooser();
	}
	public void init() {
		choose.genNumber();
	}
	public boolean checkGuess(String random) {
		int result=choose.reply(random);
		int bulls=result/10;
		int cows=result%10;
		if(bulls==4) {
			System.out.print("Reply: 4 Bulls! You won!");
			return true;
		}
		else {
			System.out.printf("Reply: %d Bulls!, %d Cows.\n", bulls, cows);
			return false;
		}
	}
	public void play() {
		init();
		for(int i=0; i<MAX_COUNT; i++) {
			String random=guess.getGuess();
			if(checkGuess(random)==true)
				break;
			if(i==MAX_COUNT-1)
				System.out.printf("Game Over! The answer is %s.",choose.getNumber());
		}
	}
}