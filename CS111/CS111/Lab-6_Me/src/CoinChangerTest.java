//Pangon La-or-on
//6409700074

public class CoinChangerTest {

	public static void main(String[] args) {
		final int START=-7;
		final int END=50;
		final int CON=7;
		int i;
		// TODO Auto-generated method stub
		CoinChanger change=new CoinChanger();
		change.setType(Coin.COIN1);
		change.setType(Coin.COIN10, Coin.COIN5);
		if(change.isValidType()==false) {
			System.out.println("Machine is broken");
		}
		else {
			for(i=START; i<END; i+=CON) {
				change.setValue(i);
				change.changer();
			}
		}
		change.setType(Coin.COIN10, Coin.COIN10);
		if(change.isValidType()==false) {
			System.out.println("Machine is broken");
		}
		else {
			for(i=START; i<END; i+=CON) {
				change.setValue(i);
				change.changer();
			}
		}
		change.setType(Coin.COIN5, Coin.COIN25);
		if(change.isValidType()==false) {
			System.out.println("Machine is broken");
		}
		else {
			for(i=START; i<END; i+=CON) {
				change.setValue(i);
				change.changer();
			}
		}
	}
}
