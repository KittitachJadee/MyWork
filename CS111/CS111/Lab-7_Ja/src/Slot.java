//Kanyanat Det-in
//6409618011
import java.util.Random;
public class Slot {
	private int age;
	public Slot() {
		this.age=4;
	}
	public void toast(Bread bread) {
		Random random=new Random();
		if(age>0) {
			bread.setState(Bread.SOFT);
			age-=1;
		}
		else {
			if(random.nextInt()%2==0) {
				bread.setState(Bread.CRISP);
				age-=1;
			}
			else {
				bread.setState(Bread.BURNT);
				age-=1;
			}
		}

	}
	public int getAge() {
		return age;
	}
}