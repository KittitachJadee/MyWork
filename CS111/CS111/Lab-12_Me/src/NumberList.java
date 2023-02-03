//Pangon La-or-on
//6409700074

import java.util.ArrayList;
import java.util.Collections;

public class NumberList {
	private ArrayList<Integer> list;
	
	public NumberList() {
		list = new ArrayList<Integer>();
	}
	public void add(int num) {
		list.add(num);
	}
	public void sortArrayList() {
		Collections.sort(list);
	}
	public String toString() {
		return list.toString().replaceAll("\\[|\\]|,", "");	//don't want "[ ] ,"
	}
}
