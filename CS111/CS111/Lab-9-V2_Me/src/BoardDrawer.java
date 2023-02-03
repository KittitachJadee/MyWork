import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardDrawer implements ActionListener{
	private int width, length;
	
	public BoardDrawer(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public void actionPerformed(ActionEvent event) {
		int board = 0;
		int line = length;
		if(line > 0) {
			for(int i = 0; i < length; i++) {
				for(int j = 0; j < board; System.out.print(" "), j++);
				board++;
				if(board == 5) {
					board = 0;
				}
				for(int k = 0; k < width; System.out.print("+"), k++);
				System.out.println();
			}
		}
		line--;
	}
	
}
