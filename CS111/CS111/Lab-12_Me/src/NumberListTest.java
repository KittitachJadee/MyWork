//Pangon La-or-on
//6409700074

import java.util.Arrays;

public class NumberListTest {
	public static void main(String[] args) {
		NumberList list = new NumberList();
		list.add(38);
		list.add(43);
		list.add(21);
		list.add(16);
		list.add(9);
		list.add(7);
		list.add(66);
		list.add(15);
		list.add(30);
		list.add(23);
		System.out.println("input : " +list.toString());
		list.sortArrayList();
		System.out.println("output : " +list.toString());
	}
}