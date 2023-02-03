//Pangon La-or-on
//6409700074

public class PairValue {
	private Pair value;
	
	public <T, E> PairValue(T first, E second) {
		value = new Pair(first, second);
	}
	public void print() {
		System.out.println("first: " +value.getFirst() +" second: " +value.getSecond());
	}
}
