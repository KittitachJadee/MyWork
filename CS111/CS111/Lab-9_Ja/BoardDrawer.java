//Kanyanat Det-in
//6409618011

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BoardDrawer implements ActionListener{
	private int width, length;
	private int line=0, spaceBar=0;
	public BoardDrawer(int width, int length) {
		this.width=width;
		this.length=length;
	}
	public void actionPerformed(ActionEvent e) {
		if(balanceLength>0) {
			for(int i=0; i<spaceBar; i++) {
				 System.out.print(" ");
			}
			for(int j=0; j<width; j++) {
				System.out.print("+");
			}
			spaceBar++;
			if(spaceBar + width > length)
				spaceBar = 0;
			line++;
			System.out.println();
		}
		else
			return;
	}
}