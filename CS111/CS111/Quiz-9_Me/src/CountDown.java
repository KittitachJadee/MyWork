//Pangon La-or-on
//6409700074

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CountDown implements ActionListener {
	private int count;
	public CountDown(int initialCount) {
		count = initialCount;
	}
	public void actionPerformed(ActionEvent event) {
		if (count > 0) System.out.println(count);
		if (count == 0) System.out.println("Happy New Year!");
		count--;
	}
}
