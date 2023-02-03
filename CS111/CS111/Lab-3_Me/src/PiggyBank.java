
public class PiggyBank {
	private int coinCount=0;
	private final int COIN_VALUE = 2;
	
	public void addCoin(int noOfCoins){
		coinCount += noOfCoins;
	}
	public int withdrawCoin(int amt){
		coinCount = amt/COIN_VALUE;
		return coinCount;
	}
	public void smashPig() {
		coinCount = 0;
	}
	public int getNumberOfCoins() {
		return coinCount;
	}
	public int getTotal() {
		return coinCount*COIN_VALUE;
	}
}
