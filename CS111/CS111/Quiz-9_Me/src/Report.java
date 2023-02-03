//Pangon La-or-on
//6409700074

import java.util.ArrayList;
public class Report {
	public static void main(String[] args) {
		ArrayList<Reportable> list = new ArrayList<Reportable>();
		list.add(new Person());
		list.add(new Item("Gold", 10));
		list.add(new Item("Silver", 15.0));
		list.add(new Person());
		System.out.println("--Report--");
		for (Reportable r : list) {
			r.report();
			if (r instanceof Person) {
				Person p = (Person)r;
				p.move((int)(Math.random()*100), (int)(Math.random()*100));
				System.out.println("New state after move: " + p.getStatus());
			}
		}
	}
}