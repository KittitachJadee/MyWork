//Kanyanat Det-in
//6409618011
import java.util.ArrayList;
import java.util.Random;
public class FoodList {
	private ArrayList<Dessert> foodList;
	public FoodList() {
		foodList=new ArrayList<Dessert>();
	}
	public void addFood(Dessert food) {
		foodList.add(food);
	}
	public int size() {
		return foodList.size();
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
	public void removeFoodOver(int calories) {
		for(int i=0; i<foodList.size();) {
			if(foodList.get(i).getCalories() > calories)
				foodList.remove(i);
			else
				i++;
		}
	}
	public FoodList getFoodSoldAt(String store) {
		FoodList newFoodList=new FoodList();
		for(int i=0; i<foodList.size(); i++) {
			if(foodList.get(i).getStoreName().equals(store)==true)
				newFoodList.addFood(foodList.get(i));
		}
		return newFoodList;
	}
	public void print() {
		for(Dessert food: foodList) {
			food.print();
		}
	}
}