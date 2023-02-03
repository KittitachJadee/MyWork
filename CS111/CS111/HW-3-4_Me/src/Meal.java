//Pangon La-or-on
//6409700074

public class Meal implements Edible{
	private String name, shop;
	private float calories;
	private boolean vegetarian;
	
	public Meal(String name, String shop, float calories, boolean veggie) {
		this.name = name;
		this.shop = shop;
		this.calories = calories;
		this.vegetarian = veggie;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getShop() {
		// TODO Auto-generated method stub
		return shop;
	}

	@Override
	public float getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Dessert [name=" +name +", shop=" +shop +", calories=" +String.format("%.1f", calories)
				+", vegetarian=" +vegetarian);
	}
	
	public boolean isVegetarian() {
		return vegetarian == true? true: false;
	}
}
