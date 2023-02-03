//Pangon La-or-on
//6409700074

package three;

import java.util.ArrayList;
import one.*;

public class GeneralStack <T> {
	private ArrayList<T> stack;
	
	public GeneralStack() {
		stack = new ArrayList<T>();
	}
	public void putIn(T data) {
		stack.add(data);
	}
	public T takeOut() {
		if(!isEmpty()) {
			T data = stack.get(size() - 1);
			stack.remove(size() - 1);
			return data;
		}else {
			return null;
		}
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public int size() {
		return stack.size();
	}
	
	public static void main(String[] args) {
		GeneralStack <String> sStack = new GeneralStack <String>();
		sStack.putIn("Pokemon");
		sStack.putIn("Digimon");
		sStack.putIn("Yugio");
		sStack.putIn("Doraemon");
		System.out.println("Stack has " + sStack.size() + " item");
		while (!sStack.isEmpty()){
			System.out.println(sStack.takeOut());
		}
		System.out.println ("------------------------------------------ ");
		GeneralStack <Dessert> dStack = new GeneralStack <Dessert>();
		dStack.putIn(new Dessert("Vanilla Layer Cake ", "Cake", "S&P", 800));
		dStack.putIn(new Dessert("Croissant ", "Bakery", "S&P", 300));
		dStack.putIn(new Dessert("Honey Toast", "Bakery", "After You", 950));
		dStack.putIn(new Dessert("Strawberry Panna Cotta ", "Sweet", "On the table", 400));
		dStack.putIn(new Dessert("Red Bean Moji", "Japanese", "Sukishi", 650));
		System.out.println("Stack has " + dStack.size() + " item");
		while (!dStack.isEmpty()){
			System.out.println(dStack.takeOut());
		}
	}
}