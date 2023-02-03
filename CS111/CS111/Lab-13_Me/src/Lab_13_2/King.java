//Pangon La-or-on
//6409700074

package Lab_13_2;

public class King extends Piece{
	public King(int r, int c) {
		super(r, c);
	}
	@Override
	public boolean canMoveTo(int r, int c) {
		//King can move distance 1 square on x or y
		if((getR() - r == 1 && getC() - c == 0) || (r - getR() == 1 && c - getC() == 0)){
			return true;
		}else if((getC() - c == 1 && getR() - r == 0) || (c - getC() == 1 && r - getR() == 0)) {
			return true;
		}else {
			return false;
		}
	}
}