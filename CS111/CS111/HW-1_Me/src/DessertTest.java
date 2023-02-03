//Pangon La-or-on
//6409700074

public class DessertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dessert food1 = new Dessert();
		Dessert food2 = new Dessert();
		Dessert food3 = new Dessert();
		Dessert food4 = new Dessert();
		Dessert food5 = new Dessert();
		
		food1.setName("Sweet Cream");
		food1.setStoreName("Something");
		food1.setType("Ice Cream");
		food1.setCalorie(700.5);
		food2.setName("Chocco Cup Cake");
		food2.setStoreName("Panda Black");
		food2.setType("Bakery");
		food2.setCalorie(450.0);
		food3.setName("Milk Tea");
		food3.setStoreName("Starduck");
		food3.setType("Drink");
		food3.setCalorie(900.0);
		food4.setName("Mix Friut");
		food4.setStoreName("Fruity Fruity");
		food4.setType("Fruit");
		food4.setCalorie(250.7);
		food5.setName("Cheese Croissants");
		food5.setStoreName("Bread Boy");
		food5.setType("Bakery");
		food5.setCalorie(680.5);
		
		food1.printFood();
		food2.printFood();
		food3.printFood();
		food4.printFood();
		food5.printFood();
	}
}