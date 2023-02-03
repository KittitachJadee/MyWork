//Kanyanat Det-in
//6409618011
package Dessert2;
public class Meal implements Edible{
	private String name, shop;
	private float calories;
	private boolean vegetarian;
	public Meal(String name, String shop, float calories, boolean veggie) {
		this.name=name;
		this.shop=shop;
		this.calories=calories;
		this.vegetarian=veggie;
	}
	public String getName() {
		return name;
	}
	public String getShop() {
		return shop;
	}
	public float getCalories() {
		return calories;
	}
	public void printInfo() {
		System.out.printf("Dessert [name=%s, shop=%s, calories=%.1f, vegetarian=%b]\n", name, shop, calories, vegetarian);
	}
	public boolean isVegetarian() {
		if(vegetarian)
			return true;
		else
			return false;
	}
}
