//Pangon La-or-on
//6409700074

import java.util.Random;

public class Temperature {
	private Random rand = new Random();
	private int temp;
	
	public Temperature() {
		this.temp = 0;
	}
	public int getTemp() {
		int beforeTempChange = this.temp;
		do {
			if(Math.random() < 0.5)	this.temp -= rand.nextInt(3);
			else	this.temp += rand.nextInt(3);
		}while(this.temp < 25 || this.temp > 35);
		return beforeTempChange;
	}
}
