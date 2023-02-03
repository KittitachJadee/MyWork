//Pangon La-or-on
//6409700074

public class Dessert {
	private String name, storeName, type;
	private double calorie;
	
	public void setName(String aName) {				//setter method
		name=aName;
	}
	public void setStoreName(String aStoreName) {	//setter method
		storeName=aStoreName;
	}
	public void setType(String aType) {				//setter method
		type=aType;
	}
	public void setCalorie(double aCalorie) {		//setter method
		calorie=aCalorie;
	}
	public String getName() {						//getter method
		return name;
	}
	public String getStoreName() {					//getter method
		return storeName;
	}
	public String getType() {						//getter method
		return type;
	}
	public double getCalorie() {					//getter method
		return calorie;
	}
	public void printFood() {						//print
		System.out.printf("Dessert [name:%s, category:%s, storeName:%s, calories:%.1f]",
				name, type, storeName, calorie);
		System.out.println();
	}
}