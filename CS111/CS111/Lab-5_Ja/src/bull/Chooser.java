//Kanyanat Det-in
//6409618011
package bull;
import java.util.Random;
public class Chooser {
	Random random=new Random();
	private String number;
	public Chooser() {
		number="1234";
	}
	public int reply(String number) {
		int bulls=0;
		int cows=0;
		int i, i2;
		for(i=0; i<4; i++) {
			for(i2=0; i2<4; i2++) {
				char ch=number.charAt(i2);
				if(this.number.charAt(i)==ch) {
					if(i==i2)
						bulls++;
					else
						cows++;
				}
			}
		}
		bulls*=10;
		int result=bulls+cows;
		return result;
	}
	public void genNumber() {
		int number;
		number=1+random.nextInt(9998);
		this.number=String.valueOf(number);
		while(Checker.isValid(number)==false) {
			number=1+random.nextInt(9998);
			this.number=String.valueOf(number);
		}
	}
	public String getNumber() {
		return number;
	}
}