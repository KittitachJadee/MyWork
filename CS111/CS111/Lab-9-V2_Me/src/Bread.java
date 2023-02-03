//Pangon La-or-on
//6409700074

import java.util.Date;
import java.util.GregorianCalendar;

public class Bread implements Expirable{
	public static final String BURNT = "Burn";
	public static final String CRISP = "Crisp";
	public static final String SOFT = "Soft";
	private String state;
	private Date expiredDate;

	public Bread() {
		state = SOFT;
		GregorianCalendar calc = new GregorianCalendar();
		expiredDate = calc.getTime();
	}
	public Bread(int day, int month, int year) {
		state = SOFT;
		GregorianCalendar calc = new GregorianCalendar(year, month-1, day);
		expiredDate = calc.getTime();
	}
	public Bread(Date date) {
		state = SOFT;
		expiredDate = date;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public Date getExpired() {
		return expiredDate;
	}
	public String toString() {
		return "Bread expires on: " + expiredDate;
	}
	public boolean hasExpired(Date date) {
		return expiredDate.after(date)? true: false;
	}
}