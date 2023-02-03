//Kanyanat Det-in
//6409618011
public class Pair<T, E> {
	private T first;
	private E second;
	public Pair(T first, E second) {
		this.first = first;
		this.second = second;
	}
	public T getFirst() {
		return this.first;
	}
	public E getSecond() {
		return this.second;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public void setSecond(E second) {
		this.second = second;
	}
}