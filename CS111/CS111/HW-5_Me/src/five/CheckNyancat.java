//Pangon La-or-on
//6409700074

package five;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNyancat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a text: ");
		String text = scan.nextLine();
		Pattern p = Pattern.compile("[nN][yY][aA][nN][cC][aA][tT]");
		Matcher m = p.matcher(text);
		String newText = m.replaceAll("nyancat");
		m = p.matcher(newText);
		newText = m.replaceFirst("Nyancat");
		System.out.println(newText);
		scan.close();
	}
}