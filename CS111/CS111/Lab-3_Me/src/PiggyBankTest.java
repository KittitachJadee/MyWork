
public class PiggyBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiggyBank money = new PiggyBank();
		
		money.addCoin(10);
		money.withdrawCoin(11);
		System.out.println(money.getNumberOfCoins());
		System.out.println(money.getTotal());
		money.smashPig();
		money.addCoin(2);
		System.out.println(money.getNumberOfCoins());
		System.out.println(money.getTotal());
	}

}
