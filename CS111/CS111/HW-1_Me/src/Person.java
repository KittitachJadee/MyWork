import java.io.PrintStream;
import java.text.DecimalFormat;

//Pangon La-or-on
//6409700074

public class Person {
	public final String FEMALE="female";
	public final String MALE="male";
	private String name, gender;
	private double weight, height;
	DecimalFormat df = new DecimalFormat("###.##");
	
	public void Person(String aName, String aGender, double aWeight, double aHeight) {
		name=aName;
		gender=aGender;
		weight=aWeight;
		height=aHeight;
	}
	public String getName() {
		return name;
	}
	public String getDetail() {
		return name+": gender="+gender+", weight="+weight+" kg, "+getWeightPound()
		+" lb. height="+height+" cm, "+getHeightInches()+ " inches";
	}
	public String getGender() {
		return gender;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public String getWeightPound() {
		return df.format(weight*2.2046);
	}
	public String getHeightInches() {
		return df.format(height*0.39370);
	}
}
