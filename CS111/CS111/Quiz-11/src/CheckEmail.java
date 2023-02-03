//Pangon La-or-on
//6409700074

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pattern = "^[a-zA-Z][a-zA-Z0-9]*@[a-zA-z0-9]+.com";
		System.out.print("Please Enter a text : ");
		String text = scan.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		System.out.println(m.matches());
		scan.close();
	}
}
