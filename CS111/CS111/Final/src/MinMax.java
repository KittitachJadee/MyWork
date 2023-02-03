/* 
LANG: JAVA 
COMPILER: JAVA 
*/
/*
NAME: Pangon La-or-on
SID: 6409700074
*/

import java.util.Scanner;

public class MinMax {
	private int data[];
	private Scanner scan;
	
	public MinMax() {
		scan = new Scanner(System.in);
	}
	public String fineMinMax() {
		data = new int[scan.nextInt()];
		for(int i = 0; i < data.length; data[i] = scan.nextInt(), i++);
		int min = data[0], max = data[0];
		for(int j = 0; j < data.length; j++) {
			if(min > data[j])	min = data[j];
			if(max < data[j])	max = data[j];
		}
		return "" +min +" " +max;
	}
	
	public static void main(String[] args) {
		MinMax find = new MinMax();
		System.out.println(find.fineMinMax());
	}
}