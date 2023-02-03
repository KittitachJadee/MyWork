//Pangon La-or-on
//6409700074

package four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCalendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a text: ");
		String text = scan.nextLine();
		Pattern p = Pattern.compile("((0[1-9])/(0[1-9])/(\\d{4}))"	//for 0d/0m/yyyy
									+"|((0[1-9]|1\\d|2[1-8])/(02)/(\\d{4}))"	//for month 2 only
									+"|(0[1-9]|[12]\\d|30)/(04|06|09|11)/(\\d{4})"	//for months with 30 days
									+"|(0[1-9]|[12]\\d|3[01])/(01|03|05|07|08|10|12)/(\\d{4})");	////for months with 31 days
		Matcher m = p.matcher(text);
		System.out.println(m.matches());
		scan.close();
	}
}