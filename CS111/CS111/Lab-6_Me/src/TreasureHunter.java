import java.util.Random;
import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class TreasureHunter {
	private final int RANGE=20;
	private final int REACHABLE_DISTANCE=2;
	private Random generator;
	private Person player;
	private Monster monster;
	
	public TreasureHunter() {
		generator=new Random();
		player=new Person();
		monster=new Monster();
		
	}private void randomAllStatus() {
		int x=generator.nextInt(RANGE);
		int y=generator.nextInt(RANGE);
		boolean sleep=generator.nextInt(2)==1;
		monster.setSleep(sleep);
		monster.setPositionX(x);
		monster.setPositionY(y);
		x=generator.nextInt(RANGE);
		y=generator.nextInt(RANGE);
		player.setPositionX(x);
		player.setPositionY(y);
	}
	public void playerMove() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter direction (0=horizontal, 1=vertical): ");
		int direction=scan.nextInt();
		if(direction==0||direction==1) {
			System.out.print("Enter distance: ");
			int distance=scan.nextInt();
			if(direction==0) {
				System.out.println("You chose horizontal walk");
				player.move(distance, 0);
			}
			else {
				System.out.println("You chose vertical walk");
				player.move(0, distance);
			}
			System.out.print("Do you like to see your position (1=Yes)?");
			int choice=scan.nextInt();
			if(choice==1)
				player.showPosition();
		}
		else
			System.out.println("You chose the non-walkable direction.");
	}
	public void play() {
		boolean gameOver=false;
		do {
			randomAllStatus();
			System.out.println("Monster: "+monster.getStatus());
			System.out.println("Player: "+player.getStatus());
			if(monster.getPositionX()==player.getPositionX()&&
				monster.getPositionY()==player.getPositionY())
					break;
			else {
				playerMove();
				if((!monster.isSleep())&&monster.canSee(player)) {
					gameOver=true;
					System.out.print("\n"+"Your total treasure: "+player.getTreasure());
				}
				else {
					double distance=monster.getDistanceFrom(player);
					if(distance<=REACHABLE_DISTANCE)
						player.addTreasure();
				}
				System.out.println();
			}
		}while(!gameOver);
	}
}
