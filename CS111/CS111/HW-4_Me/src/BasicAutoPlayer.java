//Pangon La-or-on
//6409700074

public class BasicAutoPlayer extends Player{

	public BasicAutoPlayer(String name) {
		super(name);
	}
	@Override
	public void play() {
		int diceValue, currentSum = 0;
		System.out.println(getName() +" starts.");
		System.out.println(getName() +"'s score: " +getScore());
		for(int i = 0; i < 5; i++) {
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
			if(currentSum >= 20 || i == 4) {
				addScore(currentSum);
				System.out.println("- Score " +getScore() +". Pass turn!");
				return;
			}
		}
	}
}