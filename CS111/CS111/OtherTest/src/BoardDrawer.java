import javax.swing.*;

public class BoardDrawer extends JFrame {

	public static void main(String[] args) {
		BoardDrawer frameTabel = new BoardDrawer();
	}

	JLabel welcome = new JLabel("Welcome to ThaiCreate.Com");
	JPanel panel = new JPanel();

	BoardDrawer() {
		super("Team");
		setSize(1000, 500);
		setLocation(500, 280);
		panel.setLayout(null);

		welcome.setBounds(70, 50, 150, 60);

		panel.add(welcome);

		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}