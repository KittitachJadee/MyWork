package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import game.Game;

public class Rabbit extends Animal{
	public static String name = "Rabbit";
	private int amountJump = 0;
	BufferedImage image;
	
	public Rabbit() {
		super(60, 5);
		setJumpHigh(125);
	}
	public void resetAmountJump() {
		amountJump = 0;
	}
	@Override
	public BufferedImage getImage() {
		try {
			image = ImageIO.read(new File("image\\rabbit.png"));
			return image;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}
	@Override
	public void move(JPanel panel) {
		amountJump++;
		if(amountJump < 3) {
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
}