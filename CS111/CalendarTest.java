import java.util.GregorianCalendar;
public class CalendarTest{
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        boolean isLeapYear = date.isLeapYear(date.get(GregorianCalendar.YEAR));
        String message = new String();
        message = message.format("Today is %tc", date);
        System.out.println("Leap Year is " + isLeapYear);
        System.out.print(message);
    }
}
