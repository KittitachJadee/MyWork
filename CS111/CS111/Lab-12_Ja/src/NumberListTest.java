//Kanyanat Det-in
//6409618011
import java.util.Arrays;
public class NumberListTest {
	public static void main(String[] args) {
		NumberList array=new NumberList();
		array.add(38);
		array.add(43);
		array.add(21);
		array.add(16);
		array.add(9);
		array.add(7);
		array.add(66);
		array.add(15);
		array.add(30);
		array.add(23);
		System.out.print("input : ");
		array.print();
		array.sortArrayList();
		System.out.print("output : ");
		array.print();
	}
}