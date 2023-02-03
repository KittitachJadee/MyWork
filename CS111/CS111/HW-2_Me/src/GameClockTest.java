//Pangon La-or-on
//6409700074

public class GameClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameClock game=new GameClock();
		
		do {
			game.gameController();
		}while(game.choice==1||game.choice==2);
	}
}