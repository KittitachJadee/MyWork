//Pangon La-or-on
//6409700074

public class Coin {
	public static final String COIN1 = "1";
	public static final String COIN5 = "5";
	public static final String COIN10 = "10";
	public static final String COIN25 = "25";
	public static final String COIN100 = "100";
	
	private String type;
	private int value;
	
	public Coin(String aType) {
		if(aType==COIN1||aType==COIN5||aType==COIN10||aType==COIN25||aType==COIN100) {
			type=aType;
			value=Integer.parseInt(aType);
		}
	}

	public String getType() {
		return type;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isValid() {
		if (type == null) return false;
		return true;
	}
	
	public static void main(String [] args) {
		Coin c1 = new Coin(Coin.COIN10);
		Coin c2 = new Coin("10 Bahts");

		System.out.println("Coin "+ c1.getType() +": "+ c1.isValid());
		System.out.println("Coin "+ c2.getType() +": "+ c2.isValid());
	}
}
