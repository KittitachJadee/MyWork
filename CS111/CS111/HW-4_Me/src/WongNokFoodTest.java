//Pangon La-or-on
//6409700074

public class WongNokFoodTest {
	public static void main(String[] args) {
		WongNokFood wNF = new WongNokFood();
		wNF.addFood(new Dessert("Vanilla Layer Cake", "Cake", "S&P", 800));
		wNF.addFood(new Dessert("Croissant", "Bakery", "S&P", 300));
		wNF.addFood(new RecommendedDessert("Honey Toast", "Bakery", "After You", 950, 2));
		wNF.addFood(new RecommendedDessert("Strawberry Panna Cotta", "Sweet", "On the table", 400, 4));
		wNF.addFood(new Dessert("Red Bean Moji", "Japanese", "Sukishi", 650));
		wNF.addFood(new RecommendedDessert("Bread custard", "Bakery", "MontNomsod", 550, 3));
		wNF.addFood(new Dessert("Tiramisu","Sweet","On the table", 400));
		wNF.printList();
	}
}
