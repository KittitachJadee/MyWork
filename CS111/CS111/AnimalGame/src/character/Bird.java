package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import game.Game;

public class Bird extends Animal{
	public static String name = "Bird";
	BufferedImage image;
	
	public Bird() {
		super(60, 5);
		setJumpHigh(225);
	}
	@Override
	public BufferedImage getImage() {
		try {
			image = ImageIO.read(new File("image\\bird.png"));
			return image;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}
	@Override
	public void move(JPanel panel) {
		positionY -= getJumpHigh();
		panel.repaint();
		Timer timer = new Timer(600,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(positionY < Game.startY) {
						positionY += getJumpHigh();
						panel.repaint();
					}
			}
		});
		timer.setRepeats(false);
		timer.start();
	}
	public void move(JPanel panel, String status) {
		positionY += Game.startY - positionY;
	}
}