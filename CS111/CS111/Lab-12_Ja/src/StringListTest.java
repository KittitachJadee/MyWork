//Kanyanat Det-in
//6409618011
public class StringListTest {
	public static void main(String[] args) {
		StringList list=new StringList();
		list.add("cow");
		list.add("eat");
		list.add("rat");
		list.add("pink");
		list.add("blue");
		list.add("yellow");
		list.add("her");
		list.add("she");
		list.add("you");
		list.add("pen");
		System.out.print("input : ");
		list.print();
		list.sortArrayList();
		System.out.print("output : ");
		list.print();
	}
}