//Kanyanat Det-in
//6409618011

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AccountsTest {
	public static void main(String[] args) {
		StringTokenizer st;
		
		try(Scanner scan = new Scanner(new File("accounts.txt"))) {
			//Not assign because use .hasNext() instead;
			scan.nextLine();
			while(scan.hasNext()) {
				st = new StringTokenizer(scan.nextLine());
				System.out.println(st.nextToken() +" " +(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken())) );	
			}
		}catch(FileNotFoundException e) {
			System.out.println("Account file not found");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}