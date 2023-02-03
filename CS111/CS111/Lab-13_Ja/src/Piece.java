//Kanyanat Det-in
//6409618011

public abstract class Piece {
	private String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public abstract boolean canMoveTo(int r, int c);
}
