//Pangon La-or-on

public class InvestmentTest {
	
	public static void main(String[] args) {
		//4 Months (April May June July): ~5,000 Bath
		double balance = 5000;
		
		//365 days
		for(int i = 1; i <= 365; i++) {
			if(balance < 50000)	balance += (balance * 3) / 100;
			else if(balance >= 50000 && balance < 100000)	balance += 1250;
			else if(balance >= 100000 && balance < 200000)	balance += 1750;
			else	balance += 2000;
			System.out.println("Day " +String.format("%03d", i) +": " +String.format("%.2f", balance));
		}
		
		System.out.println("-------------------- Total: " +String.format("%.2f", balance) +" --------------------");
	}
}
