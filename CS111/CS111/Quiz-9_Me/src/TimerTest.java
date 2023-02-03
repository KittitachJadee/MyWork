import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
This program tests the Timer class.
*/
public class TimerTest {
	public static void main(String[] args) {
		CountDown listener = new CountDown(10);
		final int DELAY = 1000; // milliseconds between timer ticks
		Timer t = new Timer(DELAY, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}
