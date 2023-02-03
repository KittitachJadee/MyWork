//Pangon La-or-on
//6409700074

public class Bread {
	public static String SOFT = "soft";
	public static String BURNT = "burnt";
	public static String CRISP = "crisp";
	private String state;
	
	public Bread() {
		state = SOFT;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
}
