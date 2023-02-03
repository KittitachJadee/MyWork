public class PigGameTest {
	public static void main(String[] args) {
		AgressiveAutoPlayer player = new AgressiveAutoPlayer("A-Comp");
		PigGame game = new PigGame(player, new BasicAutoPlayer("B-Comp"));
		player.setGame(game);
		game.play();
	/*
		AggressiveAutoPlayer player = new AggressiveAutoPlayer("A-Comp");
		PigGame game = new PigGame(new Player("Human"), new
		BasicAutoPlayer("B-Comp"), player);
		player.setGame(game);
		game.play();
	 */
	}
}