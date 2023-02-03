import javax.swing.JOptionPane;

public class SensorDataTest {
	public static void main(String[] args) {
		SensorData sensor = new SensorData(new Temperature());
		sensor.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}