import java.util.StringTokenizer;

//Pangon La-or-on
//6409700074

public class Checker {
	private static final int ONE_DAY=1440;		//Minute
	
	public static boolean checkDifference(MiniClock clock1, MiniClock clock2, String answer){
		int firstTime=(clock1.getHour()*60)+clock1.getMinute();			//Convert hour to minute
		int secondTime=(clock2.getHour()*60)+clock2.getMinute();
		int result=0;
		StringTokenizer str=new StringTokenizer(answer, ":");
		int differenceTime=(Integer.parseInt(str.nextToken())*60)+Integer.parseInt(str.nextToken());
		
		if(firstTime>secondTime)
			result+=(ONE_DAY-firstTime)+secondTime;
		else
			result+=secondTime-firstTime;
		
		return result==differenceTime? true: false;
	}
	
	public static String getDifference(MiniClock clock1, MiniClock clock2){
		int firstTime=(clock1.getHour()*60)+clock1.getMinute();			
		int secondTime=(clock2.getHour()*60)+clock2.getMinute();
		int result=0;

		if(firstTime>secondTime) {
			result+=(ONE_DAY-firstTime)+secondTime;
			return String.valueOf(result/60) +" hour(s) " 
				   +String.valueOf(result%60) +" minute(s)";
		}
		else {
			result+=secondTime-firstTime;
			return String.format("%02d", result/60) +" hour(s) " 
			   	   +String.format("%02d",result%60) +" minute(s)";
		}
	}
	public static boolean checkNextTime(MiniClock clock1, MiniClock clock2, String answer) {
		int firstTime=(clock1.getHour()*60)+clock1.getMinute();
		int secondTime=(clock2.getHour()*60)+clock2.getMinute();
		int result=firstTime+secondTime;
		StringTokenizer str=new StringTokenizer(answer, ":");
		int nextTime=(Integer.parseInt(str.nextToken())*60)+Integer.parseInt(str.nextToken());
		
		if(result>=ONE_DAY)
			result-=ONE_DAY;
		
		return result==nextTime? true: false;
	}
	
	public static String getNextTime(MiniClock clock1, MiniClock clock2) {
		int firstTime=(clock1.getHour()*60)+clock1.getMinute();
		int secondTime=(clock2.getHour()*60)+clock2.getMinute();
		int result=firstTime+secondTime;
		
		if(result>=ONE_DAY)
			result-=ONE_DAY;
		
		return String.format("%02d", result/60) +":" +String.format("%02d", result%60);
	}
}