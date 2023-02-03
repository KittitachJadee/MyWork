package character;

import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public abstract class Character {
	int positionX, positionY, size;
	
	public Character(int x, int y, int size) {
		positionX = x;
		positionY = y;
		this.size = size;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int x) {
		positionX = x;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int y) {
		positionY = y;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	// actions of animal
	public abstract void move(JPanel panel);
	// image of animal
	public abstract BufferedImage getImage();
}