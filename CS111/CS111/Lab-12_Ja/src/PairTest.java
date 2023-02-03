//Kanyanat Det-in
//6409618011
public class PairTest {
	private Pair value;
	public <T,E> PairTest(T first, E second) {
		value=new Pair(first, second);
	}
	public void print() {
		System.out.println("first: "+value.getFirst());
		System.out.print(" second: "+value.getSecond());
	}
	public static void main(String[] args) {
		PairTest pair1=new PairTest(50, 20);
		PairTest pair2=new PairTest(100, "MaK");
		pair1.print();
		pair2.print();
	}
}