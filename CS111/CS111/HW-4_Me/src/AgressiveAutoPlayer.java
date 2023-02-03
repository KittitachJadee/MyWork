
public class AgressiveAutoPlayer extends Player{
	private PigGame game;
	public AgressiveAutoPlayer(String name) {
		super(name);
	}
	@Override
	public void play() {
		int maxScore = game.getOpponentMaxScore(this);
		int diceValue, currentSum = 0;
		int m = (int)Math.round((maxScore - getScore())/8.0);
		System.out.println(getName() +" starts.");
		System.out.println(getName() +"'s score: " +getScore());
			for(int i = 0; ; i++) {
				if(i == 0) {
					diceValue = getDiceValue();
					System.out.println("-dice:" +diceValue);
					if(diceValue == 1)	return;
					else	currentSum += diceValue;
				}else {
					diceValue = getDiceValue();
					if(diceValue == 1)	currentSum = 0;
					else	currentSum += diceValue;
					System.out.println("-Continue to row and get " +diceValue 
							+". Current sum=" +currentSum +".");
					if(diceValue == 1) {
						addScore(currentSum);
						System.out.println(getName() +"'s score: " +getScore());
						return;
					}
				}
				if(maxScore <= 71 && currentSum >= 21 - m) {
					addScore(currentSum);
					System.out.println("- Score " +getScore() +". Pass turn!");
					return;
				}
		}
	}
	public void setGame(PigGame game) {
		this.game = game;
	}
}
