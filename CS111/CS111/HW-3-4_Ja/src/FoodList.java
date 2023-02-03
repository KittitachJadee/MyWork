//Kanyanat Det-in
//6409618011
import java.util.ArrayList;
import java.util.Random;

public class FoodList {
	private ArrayList<Edible> foodList;
	public FoodList() {
		foodList=new ArrayList<Edible>();
	}
	public void addFood(Edible food) {
		foodList.add(food);
	}
	public int size() {
		return foodList.size();
	}
	public void removeFoodOver(int calories) {
		for(int i=0; i<foodList.size();) {
			if(foodList.get(i).getCalories() > calories)
				foodList.remove(i);
			else
				i++;
		}
	}
	public FoodList getRandomFood(int amount) {
		FoodList newFoodList=new FoodList();
		Random ran=new Random();
		int indexOfFood;
		
		for(int i=0; i<amount;) {
			if(i==0) {
				indexOfFood=ran.nextInt(foodList.size());
				newFoodList.addFood(foodList.get(indexOfFood));
				i++;
			}
			else {
				indexOfFood=ran.nextInt(foodList.size());
				int correct=newFoodList.size();
				for(int j=0; j<newFoodList.size(); j++) {
					if(newFoodList.foodList.get(j).equals(foodList.get(indexOfFood)))
						break;
					else {
						correct--;
						if(correct==0) {
							newFoodList.addFood(foodList.get(indexOfFood));
							i++;
						}
					}
				}
			}
		}
		return newFoodList;
	}
	public FoodList getVegetarianFood() {
		FoodList newFoodList=new FoodList();
		for(int i=0; i<foodList.size(); i++) {
			if(foodList.get(i) instanceof Meal) {
				Meal food=(Meal)foodList.get(i);
				if(food.isVegetarian()==true)
					newFoodList.addFood(food);
			}
		}
		return newFoodList;
	}
	public FoodList getFoodSoldAt(String store) {
		FoodList newFoodList=new FoodList();
		for(int i=0; i<foodList.size(); i++) {
			if(foodList.get(i).getShop().equals(store)==true)
				newFoodList.addFood(foodList.get(i));
		}
		return newFoodList;
	}
	public void print() {
		for(int i=0; i<foodList.size(); foodList.get(i).printInfo(), i++);
	}
}