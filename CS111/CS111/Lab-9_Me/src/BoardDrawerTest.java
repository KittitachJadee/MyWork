import javax.swing.JOptionPane;
import javax.swing.Timer;

//Pangon La-or-on
//6409700074

public class BoardDrawerTest {

	public static void main(String[] args) {
		BoardDrawer draw = new BoardDrawer(10, 15);
		final int DELAY = 500; // milliseconds between timer ticks
		Timer t = new Timer(DELAY, draw);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}
