//Pangon La-or-on
//6409700074

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckWeb {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		String pattern = "www\\.\\w+(.\\w+)+";
		System.out.print("Please Enter a text : ");
		String text = scan.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		System.out.println(m.matches());
		scan.close();
	}
}
