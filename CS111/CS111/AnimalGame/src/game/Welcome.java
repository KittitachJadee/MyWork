package game;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

import character.Bird;
import character.Cat;
import character.Rabbit;

public class Welcome extends JPanel {
	//---- buttons -------------------------------------------
	private JButton start, exit;
	private JRadioButton cat, bird, rabbit;
	private ButtonGroup group;
	//---- locations of animal -------------------------------
	private ImageIcon imageCat, imageBird, imageRabbit;
	//---- other attributes and classes ---------------------- 
	private String choose;
	private String animalList[] = {Cat.name, Bird.name, Rabbit.name};
	private Random rand;
	
	public Welcome(ActionListener display) {
		this.setBounds(0, 0, 1000, 600);
		this.setFocusable(true);
		this.setLayout(null);
		imageCat = new ImageIcon("image\\cat.png");
		imageBird = new ImageIcon("image\\bird.png");
		imageRabbit = new ImageIcon("image\\rabbit.png");
		createButton(display);
		// don't choose is default of choose
		choose = "";
		rand = new Random();
	}
	// Create menus and add to panel
	public void createButton(ActionListener display) {
		start = new JButton("Start");
		start.setBounds(450, 100, 100, 50);
		start.addActionListener(display);
		exit = new JButton("Exit");
		exit.setBounds(450, 350, 100, 50);
		exit.addActionListener(display);
		cat = new JRadioButton("Cat", imageCat, true);
		cat.setBounds(450, 200, 120, 75);
		cat.addActionListener(display);
		bird = new JRadioButton("Bird", imageBird, false);
		bird.setBounds(320, 200, 120, 75);
		bird.addActionListener(display);
		rabbit = new JRadioButton("Rabbit", imageRabbit, false);
		rabbit.setBounds(580, 200, 120, 75);
		rabbit.addActionListener(display);
		group = new ButtonGroup();
		group.add(cat);
		group.add(bird);
		group.add(rabbit);
		this.add(start);
		this.add(exit);
		this.add(cat);
		this.add(bird);
		this.add(rabbit);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			g.drawImage(ImageIO.read(new File("image\\bg.png")), 0, 0, 1000, 600, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(choose == "") {
			g.drawString(choose, 425, 300);
		}else {
			g.drawString(getStatus(), 425, 300);
		}
	}
	// if starting the game without selecting animal = random animal
	public void setChoose() {
		choose = animalList[rand.nextInt(3)];
	}
	public void setChoose(String animal) {
		choose = animal;
	}
	public String getChoose() {
		return choose;
	}
	public String getStatus() {
		return "You choose character: " +choose;
	}
}