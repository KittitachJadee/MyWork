import java.util.ArrayList;
import java.util.Random;

public class PigGame {
	private ArrayList<Player> playerList;
	public static int TARGET_SCORE = 100;
	private int turn;
	
	public PigGame(Player...players) throws RuntimeException{
		if(players.length < 2)	throw new RuntimeException("Not enouhg players");
		else {
			this.playerList = new ArrayList<Player>();
			for(Player person: players) {
				this.playerList.add(person);
			}
			Random rand = new Random();
			this.turn = rand.nextInt(playerList.size());
		}
	}
	public int getOpponentMaxScore(Player me) {
		int max = 0;
		for(Player person: playerList) {
			if(!person.equals(me)) {
				if(person.getScore() > max)	max = person.getScore();
			}
		}
		return max;
	}
	public void reset() {
		for(Player person: playerList) {
			person.resetScore();
		}
	}
	public void play() {
		for(int i = turn; i < playerList.size(); i++) {
			if(playerList.get(i) instanceof AgressiveAutoPlayer) {
				AgressiveAutoPlayer player = (AgressiveAutoPlayer)playerList.get(i);
				player.setGame(this);
				player.play();
			}
			else	playerList.get(i).play();
			if(playerList.get(i).getScore() >= TARGET_SCORE) {
				System.out.print(playerList.get(i).getName() +" wins!");
				System.exit(0);
			}
			if(i == playerList.size() - 1)	i = -1;
		}
	}
}
