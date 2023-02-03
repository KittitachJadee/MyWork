package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import game.Game;

public class Cat extends Animal{
	public static String name = "Cat";
	BufferedImage image;
	
	public Cat() {
		super(60, 7);
		setJumpHigh(150);
	}
	@Override
	public BufferedImage getImage() {
		try {
			image = ImageIO.read(new File("image\\cat.png"));
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
		Timer timer = new Timer(450,new ActionListener() {
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
}