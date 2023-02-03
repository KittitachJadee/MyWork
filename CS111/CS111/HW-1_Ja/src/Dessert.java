//Kanyanat Det-in
//6409618011
public class Dessert {
	private String name, storeName, type;
	private double calorie;
	public void setName(String nameDessert) {	
		name=nameDessert;
	}
	public String getName() {
		return name;
	}
	public void setStoreName(String storeNameDessert) {
		storeName=storeNameDessert;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setType(String typeDessert) {
		type=typeDessert;
	}
	public String getType() {
		return type;
	}
	public void setCalorie(double calorieDessert) {
		calorie=calorieDessert;
	}
	public double getCalorie() {
		return calorie;
	}
	public void print() {
		System.out.printf("Dessert [name:%s, category:%s, storeName:%s, calories:%.1f]\n", name, type, storeName, calorie);
	}
}