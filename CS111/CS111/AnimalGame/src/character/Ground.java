package character;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import game.*;

public class Ground extends Behind{
	BufferedImage image;
	
	public Ground(JPanel panel) {
		super(0, Game.startY, Math.abs(600 - Game.startY), 10);
		move(panel);
	}
	@Override
	public void move(JPanel panel) {
		// not move
	}
	@Override
	public BufferedImage getImage() {
		try {
			image = ImageIO.read(new File("image\\ground.png"));
			return image;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}
}