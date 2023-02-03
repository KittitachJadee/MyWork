import java.util.Arrays;
import java.util.Scanner;

public class Minimum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		char strNum[] = String.valueOf(num).toCharArray();
		Arrays.sort(strNum);
		char strNewNum[];
		
		for (int i = num + 1; i < Math.pow(10, strNum.length); i++)
		{
			strNewNum = String.valueOf(i).toCharArray();
			Arrays.sort(strNewNum);
			if (Arrays.equals(strNum, strNewNum)) {
				System.out.println(i);
				System.exit(1);
			}
		}
		System.out.println(0);
	}
}