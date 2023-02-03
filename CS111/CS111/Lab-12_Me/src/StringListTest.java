//Pangon La-or-on
//6409700074

public class StringListTest {
	public static void main(String[] args) {
		StringList list = new StringList();
		list.add("cat");
		list.add("fat");
		list.add("mother");
		list.add("sleep");
		list.add("zero");
		list.add("ant");
		list.add("wolf");
		list.add("listen");
		list.add("queen");
		list.add("joker");
		System.out.println("input : " +list.toString());
		list.sortArrayList();
		System.out.println("output : " +list.toString());
	}
}