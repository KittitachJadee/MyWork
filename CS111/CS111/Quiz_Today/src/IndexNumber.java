import java.util.Scanner;
import java.util.StringTokenizer;

/*
LANG: JAVA
COMPILER: JAVA
*/
/*
NAME: Pangon La-or-on
SID: 6409700074
*/

public class IndexNumber {
	public static void main(String[] args) {
		String amount;
		StringTokenizer stk;
		int number = 0;
		int row, col;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		amount = scan.nextLine();
		stk = new StringTokenizer(amount);
		row = Integer.parseInt(stk.nextToken());
		col = Integer.parseInt(stk.nextToken());
		for(int i = 1; i <= row; i++) {
			if(i == col) {
				number = scan1.nextInt();
			}else {
				scan.nextInt();
			}
		}
		System.out.println(number);
	}
}
