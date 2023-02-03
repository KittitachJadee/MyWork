//Pangon La-or-on
//6409700074
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterFileReader {
	private static Monster read(Scanner scan){
		int x, y;
		boolean status = false;
		if (scan.hasNext())
		x = scan.nextInt();
		else
		return null;
		if (scan.hasNext())
		y = scan.nextInt();
		else
		throw new RuntimeException("Unexpected EOF: no y value");
		if (scan.hasNext()){
		String state = scan.nextLine();
		status = state.trim().equalsIgnoreCase("sleep");
		}
		Monster mons = new Monster();
		mons.setPositionX(x);
		mons.setPositionY(y);
		mons.setSleep(status);
		return mons;
		}
	public static Monster[][] readMonsters(String filename)
			throws FileNotFoundException {
			File file = new File(filename);
			Scanner scan = null;
			Monster[][] cage = null;
			try {
			scan = new Scanner(new File(filename));
			int squareSize = scan.nextInt();
			int size = (int) Math.round(Math.sqrt(squareSize));
			if(size * size != squareSize)
			throw new RuntimeException("File contains an invalid size of cage");
			cage = new Monster[size][size];
			for(int i = 0; i < cage.length; i++){
			for(int j = 0; j < cage[i].length; j++){
			Monster mon = read(scan);
			if(mon != null)
			cage[i][j] = mon;
			else
			throw new RuntimeException("Not enough monsters");
			}
			}
			} finally {
			if (scan != null) scan.close();
			}return cage;
			}

}


