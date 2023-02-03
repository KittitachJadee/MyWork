package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import game.Game;

public abstract class Behind extends Character{
	protected Timer timer;
	private int speed;
	
	public Behind(int x, int y, int size, int speed) {
		super(x, y, size);
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}