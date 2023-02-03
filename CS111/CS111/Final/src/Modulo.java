/* 
LANG: JAVA 
COMPILER: JAVA 
*/
/*
NAME: Pangon La-or-on
SID: 6409700074
*/

import java.util.Scanner;

public class Modulo {
	private int B, A[], total[];
	Scanner scan;
	
	public Modulo() {
		scan = new Scanner(System.in);
	}
	public int findAmount() {
		int i, amount = 0;
		B = scan.nextInt();
		A = new int[scan.nextInt()];
		total = new int[A.length];
		for(i = 0; i < A.length; A[i] = scan.nextInt(), i++);
		for(i = 0; i < A.length; total[A[i] % B]++, i++);
		for(i = 0; i < total.length; amount += total[i] != 0? 1: 0, i++);
		return amount;
	}
	
	public static void main(String[] args) {
		Modulo mod = new Modulo();
		System.out.println(mod.findAmount());
	}
}