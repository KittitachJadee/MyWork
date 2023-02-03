//Kanyanat Det-in
//6409618011

public class PieceTest {
	public static void main(String[] args) {
		Piece pieces[] = new Piece[5];
		int width = 8;
		
		pieces[0] = new King(1, 1);
		pieces[1] = new King(7, 8);
		pieces[2] = new Knight(7, 4);
		pieces[3] = new Knight(4, 4);
		pieces[4] = new King(5, 3);
		
		for(int i = 0; i < pieces.length; i++) {
			for(int j = 1; j <= width; j++) {
				for(int k = 1; k <= width; k++) {
					if(pieces[i].canMoveTo(j, k)) {
						if(pieces[i].getType().equalsIgnoreCase("King")) {
							System.out.println("King(" +pieces[i].getR() +"," +pieces[i].getC() +") can move to: (" +j +"," +k +")");
						}
						if(pieces[i].getType().equalsIgnoreCase("Knight")) {
							System.out.println("Knight(" +pieces[i].getR() +"," +pieces[i].getC() +") can move to: (" +j +"," +k +")");
						}
					}
				}
			}
			if(i < pieces.length - 1)	System.out.println("-------------------------------");
		}
	}
}
