//Kanyanat Det-in
//6409618011
public class Person {
	public final String FEMALE="female";
	public final String MALE="male";
	private String name, gender;
	private double w, h;
	public void Person(String nameP, String genderP, double weightP, double heightP) {
		name=nameP;
		gender=genderP;
		w=weightP;
		h=heightP;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public double getWeight() {
		return w;
	}
	public double getHeight() {
		return h;
	}
	public String getWeightPound() {
		return String.format("%.2f", w*2.2046);
	}
	public String getHeightInches() {
		
		return String.format("%.2f", (h*0.39370));
	}
	public String getDetail() {
		return name+": gender="+gender+", weight="+w+" kg, "+getWeightPound()
		+" lb. height="+h+" cm, "+getHeightInches()+ " inches";
	}
}