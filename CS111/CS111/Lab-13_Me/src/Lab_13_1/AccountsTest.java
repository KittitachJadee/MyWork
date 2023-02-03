package Lab_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AccountsTest {
	public static void main(String[] args) {
		int amount;
		StringTokenizer stk;
		
		try(Scanner scanFile = new Scanner(new File("accounts.txt"))) {
			amount = Integer.parseInt(scanFile.nextLine());
			for(int i = 0; i < amount; i++) {
				stk = new StringTokenizer(scanFile.nextLine());
				System.out.println(stk.nextToken() +" " +(Integer.parseInt(stk.nextToken()) - Integer.parseInt(stk.nextToken())) );	
			}
		}catch(FileNotFoundException e) {
			System.out.println("Account file not found");
		}catch(Exception e) {
			System.out.print("Something went wrong: " +e);
		}
	}
}