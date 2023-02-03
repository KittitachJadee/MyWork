import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.time.LocalDateTime;  

public class CurrentDateTimeExample {  
	public static void main(String[] args) {  
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		StringTokenizer st = new StringTokenizer(dtf.format(now), ":");
		int currentHour=(Integer.parseInt(st.nextToken()));	
		int currentMinute=Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
	}  
}  
