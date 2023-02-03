/* 
LANG: JAVA 
COMPILER: JAVA 
*/
/*
NAME: Pangon La-or-on
SID: 6409700074
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cards {
	private int C, D, H, S;
	Scanner scan;
	
	public Cards() {
		C = 13;
		D = 13;
		H = 13;
		S = 13;
		scan = new Scanner(System.in);
	}
	public String findBalanceCards() {
		ArrayList<String> data = new ArrayList<String>();
		String message = scan.nextLine();
		Pattern p = Pattern.compile("[CDHS]0[1-9]|[CDHS]1[0-3]");
		Matcher m = p.matcher(message);
		while(m.find()) {
			data.add(message.substring(m.start(), m.end()));
		}
		for(int i = 0; i < data.size(); i++) {
			for(int j = 0; j < data.size(); j++) {
				if(i != j && data.get(i).equalsIgnoreCase(data.get(j)))	return "" +-1;
			}
		}
		for(String card: data) {
			switch(card.charAt(0)) {
			case 'C': C--; break;
			case 'D': D--; break;
			case 'H': H--; break;
			case 'S': S--; break;
			}
		}
		return "" +C +" " +D +" " +H +" " +S;
	}
	
	public static void main(String[] args) {
		Cards card = new Cards();
		System.out.println(card.findBalanceCards());
	}
}