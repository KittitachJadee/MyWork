//Pangon La-or-on
//6409700074

import java.util.ArrayList;

public class WongNokFood {
	private ArrayList<Dessert> list;
	
	public WongNokFood() {
		list = new ArrayList<Dessert>();
	}
	public void addFood(Dessert f) {
		list.add(f);
	}
	public void printList() {
		for(Dessert food: list) {
			if(food instanceof Dessert)	System.out.println(food.toString());
			else {
				RecommendedDessert recommendedDessert = (RecommendedDessert)food;
				System.out.println(recommendedDessert.toString());
			}
		}
	}
}
