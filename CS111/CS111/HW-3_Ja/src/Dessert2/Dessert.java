//Kanyanat Det-in
//6409618011
package Dessert2;
public class Dessert implements Edible{
	private String name, storeName, category;
	private float calories;
	public Dessert(String name, String category, String storeName, float calories) {
		this.name=name;
		this.category=category;
		this.storeName=storeName;
		this.calories=calories;
	}
	public void setName(String name) {				 
		this.name=name;
	}
	public String getName() {						 
		return name;
	}
	public void setCategory(String category) {				 
		this.category=category;
	}
	public String getCategory() {						 
		return category;
	}
	public void setCalorie(float calories) {		 
		this.calories=calories;
	}
	public float getCalories() {					
		return calories;
	}
	public void setStoreName(String storeName) {	 
		this.storeName=storeName;
	}
	public String getStoreName() {					 
		return storeName;
	}
	public String getShop() {
		return getStoreName();
	}
	public void print() {						
		System.out.printf("Dessert [name:%s , category:%s , storeName:%s, calories:%.1f]\n", name, category, storeName, calories);
	}
	public void printInfo() {
		print();
	}
}