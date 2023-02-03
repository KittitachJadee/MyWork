import java.util.Random;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.time.LocalDateTime;  

//Pangon La-or-on
//6409700074

public class MiniClock {
	private int hour, minute;
	Random generator= new Random();
	
	public MiniClock() {
		randomTime();
	}
	
	public MiniClock(int hour, int minute) {
		if((hour<0||hour>23)||(minute<0||minute>59)) {
			this.hour=0;
			this.minute=0;
		}
		else {
			this.hour=hour;
			this.minute=minute;
		}
	}
	
	public void randomTime() {
		hour=generator.nextInt(24);
		minute=generator.nextInt(60);
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int compareTo(MiniClock another) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		StringTokenizer st = new StringTokenizer(dtf.format(now), ":");
		int currentHour=Integer.parseInt(st.nextToken());	
		int currentMinute=Integer.parseInt(st.nextToken());

		if(another.getHour()>currentHour)
			return -1;
		else if(another.getHour()<currentHour)
			return 1;
		else {
			if(another.getMinute()>currentMinute)
				return -1;
			else if(another.getMinute()<currentMinute)
				return 1;
			else
				return 0;
		}
	}
	
	public String toString() {
		return "Clock: " +String.format("%02d", hour) +":" +String.format("%02d", minute);
	}
}