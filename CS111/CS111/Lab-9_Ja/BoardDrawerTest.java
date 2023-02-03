//Kanyanat Det-in
//6409618011

import javax.swing.JOptionPane;
import javax.swing.Timer;
public class BoardDrawerTest {
	public static void main(String[] args) {
		BoardDrawer obj=new BoardDrawer(10, 15);
		final int DELAY=500;
		Timer t=new Timer(DELAY, obj);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}