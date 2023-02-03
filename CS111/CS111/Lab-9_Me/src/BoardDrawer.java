import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Pangon La-or-on
//6409700074

public class BoardDrawer implements ActionListener{
	private int width, length, space = 0, balanceLength;
	
	public BoardDrawer(int width, int length) {
		this.width=width;
		this.length=length;
		balanceLength = length;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(balanceLength > 0) {
			for(int i = 0; i < space; System.out.print(" "), i++);
			for(int j = 0; j < width; System.out.print("+"), j++);
			space++;
			System.out.println();
			if(space + width > length)	space = 0;
			balanceLength--;
		}
	}

}
