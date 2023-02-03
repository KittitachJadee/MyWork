//warissara martkhao
//6409700090

import java.util.GregorianCalendar;
public class CalendarTest{
	public static void main(String[] args){
	GregorianCalendar calendar = new GregorianCalendar();
	String message = new String();
	message = message.format("Today is %tc",calendar);
	boolean check = calendar.isLeapYear(calendar.getWeekYear());
	System.out.println(check);
	System.out.printf("%tc", calendar);
	}
} 