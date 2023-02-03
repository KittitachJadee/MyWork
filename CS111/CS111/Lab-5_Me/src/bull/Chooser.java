package bull;

import java.util.Random;

//Pangon La-or-on
//6409700074

public class Chooser {
	private String number;
	Random generator=new Random();
	
	public Chooser() {
		number="1234";
	}
	public void genNumber() {
		do {
			number=String.valueOf(1+generator.nextInt(9998));
		}while(Checker.isValid(number)==false);
	}
	public int reply(String num) {
		int bulls=0, cows=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(num.charAt(j)==number.charAt(i)) {
					if(j==i) {
						bulls++;
					}
					else {
						cows++;
					}
				}
			}
		}
		return (bulls*10)+cows;
	}
	public String getNumber() {
		return number;
	}
}
