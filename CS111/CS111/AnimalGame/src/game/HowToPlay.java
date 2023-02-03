package game;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class HowToPlay extends JPanel{
	//---- buttons -------------------------
	private JRadioButton cat, bird, rabbit;
	private ButtonGroup group;
	//---- location of image ---------------
	private String fileName; 
	
	public HowToPlay(ActionListener display) {
		//character is first page
		fileName = "image\\howToPlayCat.png";
		this.setBounds(0, 0, 1000, 600);
		this.setFocusable(true);
		this.setLayout(null);
		createButton(display);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			g.drawImage(ImageIO.read(new File(fileName)), 10, 10, 960, 450, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Create menus and add to panel
	public void createButton(ActionListener display) {
		cat = new JRadioButton("Character: Cat", true);
		cat.setBounds(300, 490, 150, 20);
		cat.addActionListener(display);
		bird = new JRadioButton("Character: Bird", false);
		bird.setBounds(450,  490, 150, 20);
		bird.addActionListener(display);
		rabbit = new JRadioButton("Character: Rabbit", false);
		rabbit.setBounds(600, 490, 150, 20);
		rabbit.addActionListener(display);
		group = new ButtonGroup();
		group.add(cat);
		group.add(bird);
		group.add(rabbit);
		this.add(cat);
		this.add(bird);
		this.add(rabbit);
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}