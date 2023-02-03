package game;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameOver extends JPanel{
	public GameOver(int score, ActionListener display) {
		this.setBounds(0, 0, 1000, 600);
		this.setFocusable(true);
		this.setLayout(null);
		createLabel(score);
		createButton(display);
	}
	// Create label and add to panel
	public void createLabel(int score) {
		JLabel showStatus = new JLabel("Game Over!!!");
		showStatus.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
		showStatus.setBounds(330, 135, 350, 100);
		showStatus.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel showScore = new JLabel("Score " +score);
		showScore.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		showScore.setBounds(400, 200, 200, 100);
		showScore.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(showStatus);
		this.add(showScore);
	}
	// Create menus and add to panel
	public void createButton(ActionListener display) {
		JButton restart = new JButton("Restart");
		restart.setBounds(390, 290, 100, 50);
		restart.addActionListener(display);
		JButton exit = new JButton("Exit");
		exit.setBounds(510, 290, 100, 50);
		exit.addActionListener(display);
		this.add(restart);
		this.add(exit);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			g.drawImage(ImageIO.read(new File("image\\bg.png")), 0, 0, 1000, 600, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}