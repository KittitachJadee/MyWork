//Pangon La-or-on
//6409700074

package Lab_13_2;

public class PieceTest {
	public static void main(String[] args) {
		Piece pieces[] = new Piece[5];
		//Checkerboard size = 8 * 8
		int length = 8;
		
		pieces[0] = new King(1, 1);
		pieces[1] = new King(7, 8);
		pieces[2] = new Knight(7, 4);
		pieces[3] = new Knight(4, 4);
		pieces[4] = new King(5, 3);
		
		for(int i = 0; i < pieces.length; i++) {
			for(int j = 1; j <= length; j++) {
				for(int k = 1; k <= length; k++) {
					if(pieces[i].canMoveTo(j, k)) {
						if(pieces[i] instanceof King) {
							System.out.println("King(" +pieces[i].getR() +"," +pieces[i].getC() +") can move to: (" +j +"," +k +")");
						}else {
							System.out.println("Knight(" +pieces[i].getR() +"," +pieces[i].getC() +") can move to: (" +j +"," +k +")");
						}
					}
				}
			}
			if(i < pieces.length - 1)	System.out.println("-------------------------------");
		}
	}
}
