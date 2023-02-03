import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

//Pangon La-or-on
//6409700074

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
		for(Expirable b: list) {
			System.out.println(b);
		}
	}

	public void printExpiredItems() {
		GregorianCalendar gToday = new GregorianCalendar();
		Date today = gToday.getTime(); 
		
		System.out.println("\nAs of "+today+", these items were expired: ");
		for(Expirable product: list) {
			if(product instanceof Bread)
			{
				Bread bread = (Bread)product;
				if(today.after(bread.getExpired()))	System.out.println(bread);
			}
			else {
				Snack snack = (Snack)product;
				if(today.after(snack.getExpiration()))	System.out.println(snack);
			}
		}
	}
	
	public static boolean isExpired(Date date) {
		GregorianCalendar gToday = new GregorianCalendar();
		Date today = gToday.getTime(); 
		
		if(today.after(date))	return true;
		else	return false;
	}
	
	public ArrayList<Expirable> removeExpiredItems(){
		ArrayList<Expirable> expiredProduct = new ArrayList<Expirable>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Bread)
			{
				Bread bread = (Bread)list.get(i);
				if(isExpired(bread.getExpired())) {
					expiredProduct.add(bread);
					list.remove(i);
					i--;
				}
			}
			else {
				Snack snack = (Snack)list.get(i);
				if(isExpired(snack.getExpiration())) {
					expiredProduct.add(snack);
					list.remove(i);
					i--;
				}
			}
		}
		return expiredProduct;
	}
}
