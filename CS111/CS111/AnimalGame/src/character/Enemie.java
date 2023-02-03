package character;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import game.*;

public class Enemie extends Character{
	private Timer timer;
	private int speedEnemie = 30;
	//---- for check enemie is cash -----
	private boolean checked;
	
	public Enemie(int x, JPanel panel) {
		super(x, Game.startY, 60);
		checked = false;
		move(panel);
	}
	public boolean getChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public void move(JPanel panel) {
		timer = new Timer(50,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(positionX <= 0) {
						//the end of frame + new start point
						positionX = Game.startX + (int)(Math.random() * 1500);
						checked = false;
					}
					positionX -= speedEnemie;
					panel.repaint();
			}
		});
		 timer.start();
	}
	public BufferedImage getImage() {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("image\\devilTree.png"));
			return image;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}
}