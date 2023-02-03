//Kanyanat Det-in
//6409618011

public class Knight extends Piece{
	public Knight(int r, int c) {
		super(r, c);
		setType("Knight");
	}
	@Override
	public boolean canMoveTo(int r, int c) {
		//Knight can move distance (2, 1) or (1, 2)
		if(getR() - r == 2 && getC() - c == 1) {
			return true;
		}else if(getC() - c == 2 && getR() - r == 1) {
			return true;
		}else {
			return false;
		}
	}
}