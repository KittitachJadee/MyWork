//Kanyanat Det-in
//6409618011
import java.util.Random;
import java.util.Scanner;
public class Game {
	private Room room;
	private Person player;
	
	public void init() {
		Random ran=new Random();
		player=new Person();
		room = new Room(5+ran.nextInt(11), 5+ran.nextInt(11));
	}
	
	public void play() {
		int round=0;
		boolean alive=true;
		Random ran=new Random();
		int currentDiceFace;
		Scanner scan=new Scanner(System.in);
		System.out.println(room.getExitStatus());
		while(alive) {
			round++;
			room.updateMonsterStatus();
			System.out.println("-------- Playing Round " +round +"--------");
			System.out.println(room.getMonsterStatus());
			currentDiceFace=ran.nextInt(6)+1;
			System.out.println(" Player threw "+currentDiceFace);
			for(int i=0; i<currentDiceFace; i++) {
				System.out.print("Direction? u(up) d(down) l(left) r(right): ");
				String direction = scan.nextLine();
				int xDist=0, yDist=0;
				switch(direction.trim().toLowerCase()) {
				case "u": yDist++; break;
				case "d": yDist++; break;
				case "l": xDist++; break;
				case "r": xDist++; break;
				}
				if(room.inbound(player.getPositionX()+xDist, player.getPositionY()+yDist))
					player.move(xDist, yDist);
				else
					player.move(0, 0);
				System.out.println(player.getStatus());
				if(room.isAtExit(player)) {
					System.out.println("Found EXIT --- Player Win");
					return;
				}
				if(room.hasMonsterSee(player))
					alive=false;
			}
		}
		System.out.println("Player Dead!!!");
	}
}
