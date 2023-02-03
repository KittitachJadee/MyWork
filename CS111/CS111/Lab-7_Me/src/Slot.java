import java.util.Random;

//Pangon La-or-on
//6409700074

public class Slot {
	private int age;
	
	public Slot() {
		age=4;
	}
	
	public void toast(Bread bread) {
		Random ran=new Random();
		if(age>=1)
			bread.setState(Bread.SOFT);
		else {
			if(ran.nextInt(2)==1)
				bread.setState(Bread.CRISP);
			else
				bread.setState(Bread.BURNT);
		}
		age--;
	}
	
	public int getAge() {
		return age;
	}
}