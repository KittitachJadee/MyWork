package game;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import character.*;
import event.*;

public class Game extends JPanel implements KeyListener{
	static Display display;
	//---- width and default position y ------------
	public static int startX = 1000, startY = 350;
	//---- for check animal can move ---------------
	private boolean hasReleasedKey;
	//---- score player ----------------------------
	private double score;
	//---- character and behind in game ------------
	private Animal animal;
	private Cloud[] cloud;
	private Ground ground;
	private Enemie tree[];
	
	public Game(String name) {
		this.setBounds(0, 0, 1000, 600);
		this.setLayout(null);
		hasReleasedKey = true;
		makeEnemies();
		makeClouds();
		score = 0;
		ground = new Ground(this);
		if(name.equalsIgnoreCase(Cat.name)) {
			animal = new Cat();
		}else if(name.equalsIgnoreCase(Bird.name)) {
			animal = new Bird();
		}else if(name.equalsIgnoreCase(Rabbit.name)){
			animal = new Rabbit();
		}
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		drawBackGround(g2D);
		drawHealth(g2D);
		g2D.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		g2D.drawString("Point : " +Math.round(score), 20, 80);
		g2D.drawImage(animal.getImage(), animal.getPositionX(), animal.getPositionY(), animal.getSize(), animal.getSize(), null);
		for(Enemie enemie: tree) {
			g2D.drawImage(enemie.getImage(), enemie.getPositionX(), enemie.getPositionY(), enemie.getSize(), enemie.getSize(), null);
			if(Clash.isClash(animal, enemie)) {
				animal.setHealth(animal.getHealth() - 1);
				enemie.setChecked(true);
				if(animal.getHealth() == 0) {
					display.endGame((int)score);
				}
			}else {
				score += 0.05;
			}
		}
	}
	public void drawHealth(Graphics2D g2D) {
		int distance = 0;
		try {
			for(int i = 0; i < animal.getHealth(); i++) {
				distance += 22;
				g2D.drawImage(ImageIO.read(new File("image\\heart.png")), distance, 20, 20, 20, null);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void makeEnemies() {
		tree = new Enemie[3];
		for(int i = 0; i < tree.length; i++) {
			int location = Game.startX + (int)(Math.random() * 1500);
			tree[i] = new Enemie(location, this);
		}
	}
	public void makeClouds() {
		cloud = new Cloud[4];
		for(int i = 0; i < cloud.length; cloud[i] = new Cloud(this), i++);
	}
	private void drawBackGround(Graphics2D g2D) {
		try {
			g2D.setBackground(Color.BLUE);
			g2D.drawImage(ImageIO.read(new File("image\\mountain.png")), 0, 0, 1000, 400, null);
			g2D.drawImage(ground.getImage(), 0, 290, Game.startX, 300, null);
			for(Cloud sky: cloud) {
				g2D.drawImage(sky.getImage(), sky.getPositionX(), sky.getPositionY(), sky.getSize(), sky.getSize(), null);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//32 is space bar, 38 is up arrow and 40 is down arrow
		if(animal instanceof Cat) {
			if(animal.getPositionY() == Game.startY && hasReleasedKey) {
				if(e.getKeyCode() == 32 || e.getKeyCode() == 38) {
					animal.move(this);
					hasReleasedKey = false;
				}
			}
		}else if(animal instanceof Bird) {
			if(animal.getPositionY() == Game.startY && hasReleasedKey) {
				if(e.getKeyCode() == 32 || e.getKeyCode() == 38) {
					animal.move(this);
					hasReleasedKey = false;
				}
			}else if(e.getKeyCode() == 40) {
				((Bird)animal).move(this, "down");
				hasReleasedKey = false;
			}
		}else if(animal instanceof Rabbit) {
			if(hasReleasedKey) {
				if(animal.getPositionY() == Game.startY){
					((Rabbit) animal).resetAmountJump();
				}
				if(e.getKeyCode() == 32 || e.getKeyCode() == 38) {
					animal.move(this);
					hasReleasedKey = false;
				}
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		hasReleasedKey = true;
	}
	public static void main(String[] args) {
			display = new Display();
	}
}