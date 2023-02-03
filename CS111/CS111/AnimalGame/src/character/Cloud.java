package character;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import game.*;

public class Cloud extends Behind{
	BufferedImage image;
	
	public Cloud(JPanel panel) {
		super(Game.startX, Game.startY - 350, 100, 10);
		move(panel);
	}
	@Override
	public void move(JPanel panel) {
		timer = new Timer(10,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(positionX <= 0) {
						//the end of frame + new start point
						positionX = Game.startX + (int)(Math.random() * 1500);
					}
					positionX -= getSpeed();
					panel.repaint();
			}
		});
		 timer.start();
	}
	@Override
	public BufferedImage getImage() {
		try {
			image = ImageIO.read(new File("image\\cloud.png"));
			return image;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}
}