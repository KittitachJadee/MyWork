//Pangon La-or-on
//6409700074

package Lab_13_2;

public abstract class Piece {
	private int r, c;
	
	public Piece(int r, int c) {
		this.r = r;
		this.c = c;
	}
	public int getR() {
		return r;
	}
	public int getC() {
		return c;
	}
	public abstract boolean canMoveTo(int r, int c);
}
