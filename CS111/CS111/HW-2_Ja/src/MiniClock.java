//Kanyanat Det-in
//6409618011
import java.util.Random;
import java.time.LocalDateTime;  
public class MiniClock {
	private int hour;
	private int minute;
	Random random= new Random();
	public MiniClock() {
		hour=random.nextInt(24);
		minute=random.nextInt(60);
	}
	public MiniClock(int hour, int minute) {
		if(hour<0||hour>23){
			this.hour=0;
		}
		else if(minute<0||minute>59) {
			this.minute=0;
		}
		else {
			this.hour=hour;
			this.minute=minute;
		}
	}
	public void randomTime() {
		hour=random.nextInt(24);
		minute=random.nextInt(60);
	}
	public String toString() {
		return "Clock: "+String.format("%02d", hour)+":" +String.format("%02d", minute);
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int compareTo(MiniClock another) {
		LocalDateTime current = LocalDateTime.now();
		if(another.getHour()>current.getHour())
			return -1;
		else if(another.getHour()==current.getHour()) {
			if(another.getMinute()>current.getMinute())
				return -1;
			else if(another.getMinute()==current.getMinute())
				return 0;
			else
				return 1;
		}
		else {
			return 1;
		}
	}
}