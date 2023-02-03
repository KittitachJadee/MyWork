//Pangon La-or-on
//6409700074

package clause_3;

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
		for(int i = 0; i < list.size(); i++) {
			if(i < list.size() - 1) {
				if(list.get(i) instanceof Dessert)	System.out.println(list.get(i).toString());
				else {
					RecommendedDessert recommendedDessert = (RecommendedDessert)list.get(i);
					System.out.println(recommendedDessert.toString());
				}
			}
			else {
				if(list.get(i) instanceof Dessert)	System.out.print(list.get(i).toString());
				else {
					RecommendedDessert recommendedDessert = (RecommendedDessert)list.get(i);
					System.out.print(recommendedDessert.toString());
				}
			}
		}
	}
	public ArrayList<Dessert> getFilterFood(FilterInterface filter){
		ArrayList<Dessert> targets = new ArrayList<Dessert>();
		if(filter instanceof FilterRecommendedDessert) {
			FilterRecommendedDessert focusStar = (FilterRecommendedDessert)filter;
			for(Dessert food: list) {
				if(food instanceof RecommendedDessert) {
					RecommendedDessert recommendedFood = (RecommendedDessert)food;
					if(focusStar.isSatified(recommendedFood))	targets.add(recommendedFood);
				}
			}
		}
		else {
			FilterByShop focusShop = (FilterByShop)filter;
			for(Dessert food: list) {
				if(focusShop.isSatified(food))	targets.add(food);
			}
		}
		return targets;
	}
	public static void print(ArrayList<Dessert> tmp) {
		for(int i = 0; i < tmp.size(); i++) {
			if(i < tmp.size() - 1) {
				if(tmp.get(i) instanceof Dessert)	System.out.println(tmp.get(i).toString());
				else {
					RecommendedDessert recommendedDessert = (RecommendedDessert)tmp.get(i);
					System.out.println(recommendedDessert.toString());
				}
			}
			else {
				if(tmp.get(i) instanceof Dessert)	System.out.print(tmp.get(i).toString());
				else {
					RecommendedDessert recommendedDessert = (RecommendedDessert)tmp.get(i);
					System.out.print(recommendedDessert.toString());
				}
			}
		}
	}
}
