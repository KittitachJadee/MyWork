//Kanyanat Det-in
//6409618011
public class DessertListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DessertList foodList=new DessertList();
		Dessert dessert1 = new Dessert();
		dessert1.setName("Tokyo Sundae");
		dessert1.setStoreName("Bake a Wish");
		dessert1.setType("Ice Cream");
		dessert1.setCalorie(800.0);
		foodList.add(dessert1);
		Dessert dessert2 = new Dessert();
		dessert2.setName("Honey Toast");
		dessert2.setStoreName("After You");
		dessert2.setType("Bakery");
		dessert2.setCalorie(900.0);
		foodList.add(dessert2);
		Dessert dessert3 = new Dessert();
		dessert3.setName("Banana Split");
		dessert3.setStoreName("No name");
		dessert3.setType("Ice Cream");
		dessert3.setCalorie(800.0);
		foodList.add(dessert3);
		Dessert dessert4 = new Dessert();
		dessert4.setName("Sticky Rice with Mango");
		dessert4.setStoreName("Khun Moo");
		dessert4.setType("Thai Dessert");
		dessert4.setCalorie(1200.0);
		foodList.add(dessert4);
		Dessert dessert5 = new Dessert();
		dessert5.setName("Brownie");
		dessert5.setStoreName("Smoke Weed");
		dessert5.setType("Bakery");
		dessert5.setCalorie(600.3);
		foodList.add(dessert5);
		foodList.printInfo();
	}
}