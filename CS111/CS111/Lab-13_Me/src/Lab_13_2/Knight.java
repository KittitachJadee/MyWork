//Pangon La-or-on
//6409700074

package Lab_13_2;

public class Knight extends Piece{
	public Knight(int r, int c) {
		super(r, c);
	}
	@Override
	public boolean canMoveTo(int r, int c) {
		//Knight can move distance (2, 1) or (1, 2)
		if((getR() - r == 2 && (getC() - c == 1 || getC() - c == -1)) || (r - getR() == 2 && (c - getC() == 1 || c - getC() == -1))) {
			return true;
		}else if((getC() - c == 2 && (getR() - r == 1 || getR() - r == -1)) || (c - getC() == 2 && (r - getR() == 1 || r - getR() == -1))) {
			return true;
		}else {
			return false;
		}
	}
}