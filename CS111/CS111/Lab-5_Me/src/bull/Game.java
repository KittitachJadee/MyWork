package bull;

//Pangon La-or-on
//6409700074

public class Game {
	private final int MAX_COUNT=10;
	private Guesser guesser;
	private Chooser chooser;

	public Game() {
		guesser=new Guesser();
		chooser=new Chooser();
	}
	public void init() {
		chooser.genNumber();
	}
	public void play() {
		init();
		for(int i=0; i<MAX_COUNT; i++) {
			String guess=guesser.getGuess();
			if(checkGuess(guess)==true) {
				break;
			}
			else if(i==MAX_COUNT-1) {
				System.out.println("Game Over! The answer is "+chooser.getNumber()+".");
			}
		}
	}
	public boolean checkGuess(String guess) {
		int result=chooser.reply(guess);
		if(result/10==4) {
			System.out.println("Reply: 4 Bulls! You won!");
			return true;
		}
		else {
			System.out.println("Reply: "+result/10+" Bulls!, "+result%10
			+" Cows.");
			return false;
		}
	}
}
