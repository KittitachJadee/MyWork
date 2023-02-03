//Pangon La-or-on
//6409700074

import java.util.ArrayList;
import java.util.Collections;

public class StringList {
	ArrayList<String> text;
	
	public StringList() {
		text = new ArrayList<String>();
	}
	public void add(String word) {
		text.add(word);
	}
	public void sortArrayList() {
		Collections.sort(text);
	}
	public String toString() {
		String list = "";
		for(String message: text) {
			list += message +" ";
		}
		return list;
	}
}
