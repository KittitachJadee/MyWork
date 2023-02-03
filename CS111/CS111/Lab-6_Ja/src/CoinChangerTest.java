//Kanyanat Det-in
//6409618011
public class CoinChangerTest {
	public static void main(String[] args) {
		int i;
		// TODO Auto-generated method stub
		CoinChanger change=new CoinChanger();
		change.setType(Coin.COIN1);
		change.setType(Coin.COIN10, Coin.COIN5);
		if(change.isValidType()==false)
			System.out.println("Machine is broken");
		else
			for(i=-7; i<50; change.setValue(i), change.changer(), i+=7);
		change.setType(Coin.COIN10, Coin.COIN10);
		if(change.isValidType()==false)
			System.out.println("Machine is broken");
		else
			for(i=-7; i<50; change.setValue(i), change.changer(), i+=7);
		change.setType(Coin.COIN5, Coin.COIN25);
		if(change.isValidType()==false)
			System.out.println("Machine is broken");
		else
			for(i=-7; i<50; change.setValue(i), change.changer(), i+=7);
	}
}
