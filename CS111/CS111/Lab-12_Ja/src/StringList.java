//Kanyanat Det-in
//6409618011
import java.util.ArrayList;
import java.util.Collections;
public class StringList {
	ArrayList<String> word;
	public StringList() {
		word=new ArrayList<String>();
	}
	public void add(String word) {
		this.word.add(word);
	}
	public void sortArrayList() {
		Collections.sort(word);
	}
	public void print() {
		for(String text: word) {
			System.out.print(text +" ");
		}
		System.out.println();
	}
}