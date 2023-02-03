//Kanyanat Det-in
//6409618011

public class King extends Piece{
	public King(int r, int c) {
		super(r, c);
		setType("King");
	}
	@Override
	public boolean canMoveTo(int r, int c) {
		//King can move distance 1 square on x or y
		if(getR() - r == 1 && getC() - c == 0){
			return true;
		}else if(getC() - c == 1 && getR() - r == 0) {
			return true;
		}else {
			return false;
		}
	}
}