//Kanyanat Det-in
//6409618011
import java.time.LocalDateTime;  
public class MiniClockTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime current = LocalDateTime.now();
		MiniClock clock1=new MiniClock(123, 456);
		System.out.println(clock1.toString());
		if(clock1.compareTo(clock1)<0)
			System.out.println("The clock time is faster than the current time.");
		else if(clock1.compareTo(clock1)==0)
			System.out.println("The clock time is equal to the current time.");
		else
			System.out.println("The clock time is slower than the current time.");
		MiniClock clock2=new MiniClock(01, 10);
		System.out.println(clock2.toString());
		if(clock2.compareTo(clock2)<0)
			System.out.println("The clock time is faster than the current time.");
		else if(clock2.compareTo(clock2)==0)
			System.out.println("The clock time is equal to the current time.");
		else
			System.out.println("The clock time is slower than the current time.");
		MiniClock clock3=new MiniClock();
		System.out.println(clock3.toString());
		if(clock3.compareTo(clock3)<0)
			System.out.println("The clock time is faster than the current time.");
		else if(clock3.compareTo(clock3)==0)
			System.out.println("The clock time is equal to the current time.");
		else
			System.out.println("The clock time is slower than the current time.");
	}
}