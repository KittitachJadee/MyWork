//Pangon La-or-on
//6409700074

public class Slot {
	private int age;
	
	public Slot() {
		age = 4;
	}
	public void toast(Bread bread) {
		if(age > 1) {
			bread.setState(Bread.SOFT);
		}
		else {
			if(Math.random() > 0.5) {
				bread.setState(Bread.BURNT);
			}
			else {
				bread.setState(Bread.CRISP);
			}
		}
		age--;
	}
	public int getAge() {
		return age;
	}
}
