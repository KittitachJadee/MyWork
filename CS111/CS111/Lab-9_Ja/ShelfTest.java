//Kanyanat Det-in
//6409618011
import java.util.ArrayList;
public class ShelfTest {
	public static void main(String[] args) {
		Bread b1 = new Bread();
		Bread b2 = new Bread(23, 3, 2022);
		Bread b3 = new Bread(15, 4, 2023);
		Shelf shelf = new Shelf();
		shelf.add(b1);
		shelf.add(b2);
		shelf.add(b3);

		Snack s1 = new Snack("Mixed Nuts");
		Snack s2 = new Snack("Ritz Cracker", 1, 3, 2022);
		Snack s3 = new Snack("Chip Ahoy", 31, 4, 2023);
		Snack s4 = new Snack("Hershey's Chocolate Bar", 8, 7, 2023);
		shelf.add(s1);
		shelf.add(s2);
		shelf.add(s3);
		shelf.add(s4);

		shelf.printShelf();
		shelf.printExpiredItems();
	}
}
