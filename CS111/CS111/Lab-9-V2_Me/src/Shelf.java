import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Shelf {
	private ArrayList<Expirable> list;
	public Shelf() {
		list = new ArrayList<Expirable>();
	}
	public void add(Bread b) {
		list.add(b);
	}
	public void add(Snack s) {
		list.add(s);
	}
	public void printShelf() {
		for(Expirable item: list) {
			System.out.println(item);
		}
}
	public void printExpiredItems() {
		GregorianCalendar gToday = new GregorianCalendar();
		Date today = gToday.getTime();
		System.out.println("\nAs of "+today+
				", these items were expired:");
		for (Expirable item: list) {
			if(item instanceof Bread) {
				Bread bread = (Bread)item;
				if(today.after(bread.getExpired())) {
					System.out.println(item);
				}
			}
			else {
				Snack snack = (Snack)item;
				if(today.after(snack.getExpiration())) {
					System.out.println(item);
				}
			}
		}
	}
	public ArrayList removeExpiredItems() {
		GregorianCalendar gToday = new GregorianCalendar();
		Date today = gToday.getTime();
		ArrayList<Expirable> expiredItems = new ArrayList<Expirable>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Bread) {
				Bread bread = (Bread)list.get(i);
				if(bread.getExpired().equals(today)) {
					expiredItems.add(list.get(i));
					list.remove(i);
					i--;
				}
			}
			else {
				Snack snack = (Snack)list.get(i);
				if(snack.getExpiration().equals(today)) {
					expiredItems.add(snack);
					list.remove(i);
					i--;
				}
			}
		}
		return expiredItems;
	}
}
