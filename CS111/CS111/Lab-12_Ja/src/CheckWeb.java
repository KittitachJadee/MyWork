///Kanyanat Det-in
//6409618011
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckWeb {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		String pattern = "(^www\\.)[a-zA-Z0-9]+(.[a-zA-Z0-9]+)+";
		System.out.print("Please Enter a text : ");
		String text = scan.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		System.out.println(m.matches());
		scan.close();
	}
}
