//Kanyanat Det-in
//6409618011
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNyancat {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String pattern1="[nN][yY][aA][nN][cC][aA][tT]";
		System.out.print("Please Enter a text: ");
		String text=scn.nextLine();
		Pattern p1=Pattern.compile(pattern1);
		Matcher m1=p1.matcher(text);
		String newText=m1.replaceAll("nyancat");
		String pattern2="^([nN][yY][aA][nN][cC][aA][tT])";
		Pattern p2=Pattern.compile(pattern2);
		Matcher m2=p2.matcher(newText);
		newText=m2.replaceFirst("Nyancat");
		System.out.println(newText);
		scn.close();
		
	}
	
}
