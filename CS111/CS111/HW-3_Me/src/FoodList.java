import java.util.ArrayList;
import java.util.Random;

//Pangon La-or-on
//6409700074

public class FoodList {
	private ArrayList<Dessert> foodList;
	
	public FoodList() {
		foodList = new ArrayList<Dessert>();
	}
	
	public void addFood(Dessert food) {
		foodList.add(food);
	}
	
	public int size() {
		return foodList.size();
	}
	
	public FoodList getRandomFood(int amount) {
		FoodList food = new FoodList();
		Random random = new Random();
		int indexFood;
		food.addFood(foodList.get(random.nextInt(foodList.size())));
		while(amount > 1) {
			indexFood = random.nextInt(foodList.size());
			for(int i = 0; i < food.size(); i++) {
				if(foodList.get(indexFood).equals(food.foodList.get(i))) break;
				else {
					if(i == food.size() - 1) {
						food.addFood(foodList.get(indexFood));
						amount--;
					}
				}
			}
		}
		return food;
	}
	
	public void removeFoodOver(int calories) {
		for(int i = 0; i < foodList.size(); i++) {
			if(foodList.get(i).getCalories() > calories) {
				foodList.remove(i);
				i--;
			}
		}
	}
	
	public FoodList getFoodSoldAt(String store) {
		FoodList food = new FoodList();
		for(Dessert dessert: foodList) {
			if(dessert.getStoreName().equalsIgnoreCase(store)) food.addFood(dessert);
		}
		return food;
	}
	
	public void print() {
		for(Dessert food: foodList) {
			food.print();
		}
	}
}