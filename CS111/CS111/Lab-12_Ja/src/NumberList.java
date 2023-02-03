//Kanyanat Det-in
//6409618011
import java.util.ArrayList;
import java.util.Collections;
public class NumberList {
	private ArrayList<Integer> array;
	public NumberList() {
		array=new ArrayList<Integer>();
	}
	public void add(int num) {
		array.add(num);
	}
	public void sortArrayList() {
		Collections.sort(array);
	}
	public void print() {
		for(int i=0; i<array.size(); i++) {
			System.out.print(array.get(i)+" ");
		}
		System.out.println();
	}
}