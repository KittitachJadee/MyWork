//Kanyanat Det-in
//6409618011
import java.util.ArrayList;

public class GeneralStack <T> {
	private ArrayList<T> stack;
	
	public GeneralStack() {
		stack=new ArrayList<T>();
	}
	public void putIn(T data) {
		stack.add(data);
	}
	public T takeOut() {
		if(!stack.isEmpty()) {
			T remove=stack.get(size()-1);
			stack.remove(size()-1);
			return remove;
		}
		else
			return null;
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public int size() {
		return stack.size();
	}

}
