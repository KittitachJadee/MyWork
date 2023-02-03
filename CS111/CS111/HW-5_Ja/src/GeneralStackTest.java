//Kanyanat Det-in
//6409618011
public class GeneralStackTest {
	public static void main(String[] args) {
		GeneralStack <String> sStack = new GeneralStack <String>();
		sStack.putIn("Pokemon");
		sStack.putIn("Digimon");
		sStack.putIn("Yugio");
		sStack.putIn("Doraemon");
		System.out.println("Stack has " + sStack.size() + " item");
		while (!sStack.isEmpty()){
			System.out.println(sStack.takeOut());
		}
		System.out.println ("------------------------------------------ ");
		GeneralStack <Dessert> dStack = new GeneralStack <Dessert>();
		dStack.putIn(new Dessert("Vanilla Layer Cake ", "Cake", "S&P", 800));
		dStack.putIn(new Dessert("Croissant ", "Bakery", "S&P", 300));
		dStack.putIn(new Dessert("Honey Toast", "Bakery", "After You", 950));
		dStack.putIn(new Dessert("Strawberry Panna Cotta ", "Sweet", "On the table", 400));
		dStack.putIn(new Dessert("Red Bean Moji", "Japanese", "Sukishi", 650));
		System.out.println("Stack has " + dStack.size() + " item");
		while (!dStack.isEmpty()){
			System.out.println(dStack.takeOut());
		}
	}
	
}
