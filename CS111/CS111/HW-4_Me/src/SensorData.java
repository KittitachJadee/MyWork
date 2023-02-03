import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

public class SensorData implements ActionListener{
	private final int REPORT_ROUND = 12;
	private ArrayList<Integer> data;
	private int round;
	private Timer time;
	private Temperature temp;
	
	public SensorData(Temperature temp) {
		this.data = new ArrayList<Integer>();
		this.round = 0;
		this.temp = temp;
		this.time = new Timer(500, this);
	}
	@Override
	public void actionPerformed(ActionEvent ev) {
		for(int i = 0; i < REPORT_ROUND; i++) {
			data.add(temp.getTemp());
			if((i+1) == REPORT_ROUND)	printReport();	//++i == REPORT_ROUND is 6 seconds
		}
	}
	public void printReport() {
		int i, j, k;
		System.out.print("Current: ");
		//round * REPORT_ROUND = 0, 12, 24, ... is new temp per round
		//++rounf * REPORT_ROUND = 12, 24, 36, ... is new temp per round
		for(i = round * REPORT_ROUND; i < ((round + 1) * REPORT_ROUND); i++) {
			System.out.print(data.get(i));
		}
		round++;
		int amountOfValue[] = findAmountOfValue();
		int max = 1;
		for(i = 0; i < amountOfValue.length; i++) {		//can't use Collections.max
			if(max < amountOfValue[i])	max = amountOfValue[i];
		}
		for(i = 0; i < max; i++) {
			System.out.print(max - i +" |");
			for(j = 0; j < REPORT_ROUND; j++) {
				if(amountOfValue[j] == max - i)	System.out.print("* ");
				else System.out.print("  ");
			}
		}
		System.out.println("-----------------------------------\n   ");
		for(i = 25; i <= 35; System.out.print(i +" "), i++);
	}
	public int[] findAmountOfValue() {
		int amount[] = new int[11];	//25 - 35
		for(int i = 0; i < 11; amount[i] = 0, i++);
		for(int j = 0; j < data.size(); j++) {
			for(int k = 25; k <= 35; k++) {
				if(data.get(j) == k) {
					amount[k - 25]++;	//k - 25 = index of amount (0 - 10)
					break;
				}
			}
		}
		return amount;
	}
	public void start() {
		time.start();
	}
}
