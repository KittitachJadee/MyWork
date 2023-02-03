//Kanyanat Det-in
//6409618011
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pattern = "0|([1-9]([a-zA-Z0-9]*)?[02468]$)";
		System.out.print("Please Enter a text : ");
		String text = scan.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		System.out.println(m.matches());
		scan.close();
	}
}
