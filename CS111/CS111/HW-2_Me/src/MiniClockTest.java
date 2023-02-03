import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  

//Pangon La-or-on
//6409700074

public class MiniClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		MiniClock clock1=new MiniClock();
		MiniClock clock2=new MiniClock(17, 55);
		MiniClock clock3=new MiniClock(555, 555);
		
		System.out.println(dtf.format(now)+"\n-----------------------------------------------");
		System.out.println("First: No input");
		System.out.println(clock1.toString());
		if(clock1.compareTo(clock1)<0)
			System.out.println("The clock time is faster than the current time.");
		else if(clock1.compareTo(clock1)>0)
			System.out.println("The clock time is slower than the current time.");
		else
			System.out.println("The clock time is equal to the current time.");
		
		System.out.println("\nSecond: Valid input");
		System.out.println(clock2.toString());
		if(clock2.compareTo(clock2)<0)
			System.out.println("The clock time is faster than the current time.");
		else if(clock2.compareTo(clock2)>0)
			System.out.println("The clock time is slower than the current time.");
		else
			System.out.println("The clock time is equal to the current time.");
		
		System.out.println("\nThird: Invalid input");
		System.out.println(clock3.toString());
		if(clock3.compareTo(clock3)<0)
			System.out.println("The clock time is faster than the current time.");
		else if(clock3.compareTo(clock3)>0)
			System.out.println("The clock time is slower than the current time.");
		else
			System.out.println("The clock time is equal to the current time.");
	}
}