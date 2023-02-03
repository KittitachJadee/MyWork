//Kanyanat Det-in
//6409618011
import java.util.Date;
import java.util.GregorianCalendar;
public class Snack implements Expirable{
	private String name;
	private Date expiration;
	public Snack(String name) {
		this.name = name;
		GregorianCalendar calc = new GregorianCalendar();
		expiration = calc.getTime();
	}
	public Snack(String name, int day, int month, int year) {
		this.name = name;
		GregorianCalendar calc = new GregorianCalendar(year, month-1, day);
		expiration = calc.getTime();
	}
	public Snack(String name, Date date) {
		this.name = name;
		expiration = date;
	}
	public String getName() {
		return name;
	}
	public Date getExpiration() {
		return expiration;
	}
	public String toString() {
		return "Snack expires on "+ expiration;
	}
	@Override
	public boolean hasExpired(Date date) {
		Shelf.checkeExpired(date);
		return false;
	}
}
