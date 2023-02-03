//Kanyanat Det-in
//6409618011
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCalendar {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String pattern="((0[1-9]/){2}\\d{4})|(0[1-9]|[12]\\d|3[01]/(01|03|05|07|08|10|12)/\\d{4})|(0[1-9]|[12]\\d|30/(04|06|09|11)/\\d{4})|(1\\d|2[1-8]/02/\\d{4})";
		System.out.print("Please Enter a text: ");
		String text=scn.nextLine();
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(text);
		System.out.println(m.matches());
		scn.close();
		
	}
	
}
