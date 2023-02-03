package event;

import character.*;

public class Clash {
	public static boolean isClash(Animal animal, Enemie tree) {
		// every move in round can clash animal 1 time/enemie (getChecker())
		if(animal.getPositionX() + animal.getSize() >= tree.getPositionX() && animal.getPositionX() <= tree.getPositionX() &&
		   animal.getPositionY() + animal.getSize() >= tree.getPositionY() && !tree.getChecked()) {
			return true;
		}
		return false;
	}
}