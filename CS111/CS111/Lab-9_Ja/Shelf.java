//Kanyanat Det-in
//6409618011
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
public class Shelf {
	private ArrayList<Expirable> list;
	public Shelf() {
		list = new ArrayList<Expirable>();
	}
	public void add(Bread bread) {
		list.add(bread);
	}
	public void add(Snack snack) {
		list.add(snack);
	}
	public void printShelf() {
		for(Expirable item: list) {
			System.out.println(item);
		}
	}
	public static boolean checkeExpired(Date date) {
		GregorianCalendar gToday = new GregorianCalendar();
		Date today = gToday.getTime(); 
		if(today.after(date))
			return true;
		else
			return false;
	}
	public void printExpiredItems() {
		GregorianCalendar gToday = new GregorianCalendar();
		Date today = gToday.getTime(); 
		System.out.println("\nAs of "+today+", these items were expired: ");
		for(Expirable product: list) {
			if(product instanceof Bread){
				Bread item1 = (Bread)product;
				if(today.after(bread.getExpired()))
					System.out.println(item1);
			}
			else {
				Snack item2 = (Snack)product;
				if(today.after(snack.getExpiration()))
					System.out.println(item2);
			}
		}
	}
}