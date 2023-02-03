//Pangon La-or-on
//6409700074

public class DessertListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dessert food1 = new Dessert();
		Dessert food2 = new Dessert();
		Dessert food3 = new Dessert();
		Dessert food4 = new Dessert();
		Dessert food5 = new Dessert();
		Dessert food6 = new Dessert();
		DessertList foodList=new DessertList();
		
		food1.setName("Sweet Cream");
		food1.setStoreName("Something");
		food1.setType("Ice Cream");
		food1.setCalorie(1370.0);
		food2.setName("Chocco Cup Cake");
		food2.setStoreName("Panda Black");
		food2.setType("Bakery");
		food2.setCalorie(900.0);
		food3.setName("Milk Tea");
		food3.setStoreName("Starduck");
		food3.setType("Drink");
		food3.setCalorie(800.0);
		food4.setName("Mix Friut");
		food4.setStoreName("Fruity Fruity");
		food4.setType("Fruit");
		food4.setCalorie(1200.0);
		food5.setName("Cheese Croissants");
		food5.setStoreName("Bread Boy");
		food5.setType("Bakery");
		food5.setCalorie(500.0);
		food6.setName("Sticky Rice with Mango");
		food6.setStoreName("Khun Moo");
		food6.setType("Thai Dessert");
		food6.setCalorie(975.3);
		
		foodList.add(food1);
		foodList.add(food2);
		foodList.add(food3);
		foodList.add(food4);
		foodList.add(food5);
		foodList.add(food6);
		
		foodList.printInfo();
	}
}