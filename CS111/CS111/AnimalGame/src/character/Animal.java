package character;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

import game.Game;

public abstract class Animal extends Character{
	private int health, jumpHigh;
	
	public Animal(int size, int health) {
		super(50, Game.startY, size);
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setJumpHigh(int jumpHigh) {
		this.jumpHigh = jumpHigh;
	}
	public int getJumpHigh() {
		return jumpHigh;
	}
	/*subclass do something
	 - public abstract void move(JPanel panel);
	 - public abstract BufferedImage getImage(); 
	 */
}